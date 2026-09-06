package AST;

import gen.DartParser;
import gen.DartParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends DartParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(DartParser.ProgramContext ctx) {
        List<ASTNode> declarations = new ArrayList<>();
        if (ctx.libraryDirective() != null) {
            declarations.add(visit(ctx.libraryDirective()));
        }
        for (DartParser.ImportDirectiveContext imp : ctx.importDirective()) {
            declarations.add(visit(imp));
        }
        for (DartParser.ExportDirectiveContext exp : ctx.exportDirective()) {
            declarations.add(visit(exp));
        }
        for (DartParser.PartDirectiveContext part : ctx.partDirective()) {
            declarations.add(visit(part));
        }
        for (DartParser.PartOfDirectiveContext partOf : ctx.partOfDirective()) {
            declarations.add(visit(partOf));
        }
        for (DartParser.TopLevelDeclarationContext decl : ctx.topLevelDeclaration()) {
            ASTNode node = visit(decl);
            if (node != null) {
                declarations.add(node);
            }
        }
        return new Program(declarations);
    }

    @Override
    public ASTNode visitImportDirective(DartParser.ImportDirectiveContext ctx) {
        String uri = ctx.STRING_LITERAL().getText();
        String prefix = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
        List<String> showList = new ArrayList<>();
        List<String> hideList = new ArrayList<>();
        for (DartParser.CombinatorContext c : ctx.combinator()) {
            if (c.SHOW() != null) {
                for (TerminalNode id : c.identifierList().IDENTIFIER()) {
                    showList.add(id.getText());
                }
            } else if (c.HIDE() != null) {
                for (TerminalNode id : c.identifierList().IDENTIFIER()) {
                    hideList.add(id.getText());
                }
            }
        }
        return new ImportDirective(uri, prefix, showList, hideList);
    }

    @Override
    public ASTNode visitExportDirective(DartParser.ExportDirectiveContext ctx) {
        String uri = ctx.STRING_LITERAL().getText();
        List<String> showList = new ArrayList<>();
        List<String> hideList = new ArrayList<>();
        for (DartParser.CombinatorContext c : ctx.combinator()) {
            if (c.SHOW() != null) {
                for (TerminalNode id : c.identifierList().IDENTIFIER()) {
                    showList.add(id.getText());
                }
            } else if (c.HIDE() != null) {
                for (TerminalNode id : c.identifierList().IDENTIFIER()) {
                    hideList.add(id.getText());
                }
            }
        }
        return new ExportDirective(uri, showList, hideList);
    }

    @Override
    public ASTNode visitLibraryDirective(DartParser.LibraryDirectiveContext ctx) {
        return new LibraryDirective(ctx.qualifiedName().getText());
    }

    @Override
    public ASTNode visitPartDirective(DartParser.PartDirectiveContext ctx) {
        return new PartDirective(ctx.STRING_LITERAL().getText(), false);
    }

    @Override
    public ASTNode visitPartOfDirective(DartParser.PartOfDirectiveContext ctx) {
        String name = ctx.qualifiedName() != null ? ctx.qualifiedName().getText() : ctx.STRING_LITERAL().getText();
        return new PartDirective(name, true);
    }

    @Override
    public ASTNode visitClassDeclaration(DartParser.ClassDeclarationContext ctx) {
        String modifier = ctx.classModifier() != null ? ctx.classModifier().getText() : null;
        String name = ctx.IDENTIFIER().getText();
        List<String> typeParams = new ArrayList<>();
        if (ctx.typeParameters() != null) {
            for (DartParser.TypeParameterContext tp : ctx.typeParameters().typeParameter()) {
                typeParams.add(tp.getText());
            }
        }
        TypeNode superclass = ctx.type() != null ? toTypeNode(ctx.type()) : null;
        List<TypeNode> mixins = new ArrayList<>();
        if (ctx.typeList() != null && !ctx.typeList().isEmpty()) {
            for (DartParser.TypeContext t : ctx.typeList(0).type()) {
                mixins.add(toTypeNode(t));
            }
        }
        List<TypeNode> interfaces = new ArrayList<>();
        int interfaceIndex = (ctx.WITH() != null) ? 1 : 0;
        if (ctx.IMPLEMENTS() != null && ctx.typeList().size() > interfaceIndex) {
            for (DartParser.TypeContext t : ctx.typeList(interfaceIndex).type()) {
                interfaces.add(toTypeNode(t));
            }
        }
        List<ClassMember> members = new ArrayList<>();
        for (DartParser.ClassMemberContext m : ctx.classMember()) {
            ASTNode node = visit(m);
            if (node instanceof ClassMember) {
                members.add((ClassMember) node);
            }
        }
        return new ClassDeclaration(modifier, name, typeParams, superclass, mixins, interfaces, members);
    }

    @Override
    public ASTNode visitMixinDeclaration(DartParser.MixinDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<String> typeParams = new ArrayList<>();
        if (ctx.typeParameters() != null) {
            for (DartParser.TypeParameterContext tp : ctx.typeParameters().typeParameter()) {
                typeParams.add(tp.getText());
            }
        }
        List<TypeNode> onTypes = new ArrayList<>();
        List<TypeNode> interfaces = new ArrayList<>();
        if (ctx.ON() != null && !ctx.typeList().isEmpty()) {
            for (DartParser.TypeContext t : ctx.typeList(0).type()) {
                onTypes.add(toTypeNode(t));
            }
        }
        int ifaceIndex = ctx.ON() != null ? 1 : 0;
        if (ctx.IMPLEMENTS() != null && ctx.typeList().size() > ifaceIndex) {
            for (DartParser.TypeContext t : ctx.typeList(ifaceIndex).type()) {
                interfaces.add(toTypeNode(t));
            }
        }
        List<ClassMember> members = new ArrayList<>();
        for (DartParser.ClassMemberContext m : ctx.classMember()) {
            ASTNode node = visit(m);
            if (node instanceof ClassMember) {
                members.add((ClassMember) node);
            }
        }
        return new MixinDeclaration(name, typeParams, onTypes, interfaces, members);
    }

    @Override
    public ASTNode visitExtensionDeclaration(DartParser.ExtensionDeclarationContext ctx) {
        String name = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
        List<String> typeParams = new ArrayList<>();
        if (ctx.typeParameters() != null) {
            for (DartParser.TypeParameterContext tp : ctx.typeParameters().typeParameter()) {
                typeParams.add(tp.getText());
            }
        }
        TypeNode onType = toTypeNode(ctx.type());
        List<ClassMember> members = new ArrayList<>();
        for (DartParser.ClassMemberContext m : ctx.classMember()) {
            ASTNode node = visit(m);
            if (node instanceof ClassMember) {
                members.add((ClassMember) node);
            }
        }
        return new ExtensionDeclaration(name, typeParams, onType, members);
    }

    @Override
    public ASTNode visitEnumDeclaration(DartParser.EnumDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<String> typeParams = new ArrayList<>();
        if (ctx.typeParameters() != null) {
            for (DartParser.TypeParameterContext tp : ctx.typeParameters().typeParameter()) {
                typeParams.add(tp.getText());
            }
        }
        List<TypeNode> interfaces = new ArrayList<>();
        if (ctx.IMPLEMENTS() != null && ctx.typeList() != null) {
            for (DartParser.TypeContext t : ctx.typeList().type()) {
                interfaces.add(toTypeNode(t));
            }
        }
        List<EnumEntry> entries = new ArrayList<>();
        for (DartParser.EnumEntryContext ee : ctx.enumEntry()) {
            entries.add((EnumEntry) visit(ee));
        }
        List<ClassMember> members = new ArrayList<>();
        for (DartParser.ClassMemberContext m : ctx.classMember()) {
            ASTNode node = visit(m);
            if (node instanceof ClassMember) {
                members.add((ClassMember) node);
            }
        }
        return new EnumDeclaration(name, typeParams, interfaces, entries, members);
    }

    @Override
    public ASTNode visitEnumEntry(DartParser.EnumEntryContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<Argument> args = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (DartParser.ArgumentContext a : ctx.argumentList().argument()) {
                args.add(toArgument(a));
            }
        }
        return new EnumEntry(name, args);
    }

    @Override
    public ASTNode visitTypedefDeclaration(DartParser.TypedefDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<String> typeParams = new ArrayList<>();
        if (ctx.typeParameters() != null) {
            for (DartParser.TypeParameterContext tp : ctx.typeParameters().typeParameter()) {
                typeParams.add(tp.getText());
            }
        }
        TypeNode type = ctx.type() != null ? toTypeNode(ctx.type()) : new TypeNode("Function");
        return new TypedefDeclaration(name, typeParams, type);
    }

    @Override
    public ASTNode visitFieldDeclaration(DartParser.FieldDeclarationContext ctx) {
        boolean isStatic = ctx.STATIC() != null;
        boolean isLate = ctx.LATE() != null;
        boolean isFinal = ctx.varModifier() != null && ctx.varModifier().FINAL() != null;
        boolean isConst = ctx.varModifier() != null && ctx.varModifier().CONST() != null;
        TypeNode type = ctx.type() != null ? toTypeNode(ctx.type()) : null;
        List<VariableDeclarator> declarators = new ArrayList<>();
        for (DartParser.VariableDeclaratorContext vd : ctx.variableDeclarator()) {
            declarators.add((VariableDeclarator) visit(vd));
        }
        return new FieldDeclaration(isStatic, isFinal, isConst, isLate, type, declarators);
    }

    @Override
    public ASTNode visitConstructorDeclaration(DartParser.ConstructorDeclarationContext ctx) {
        boolean isConst = ctx.CONST() != null;
        boolean isFactory = ctx.FACTORY() != null;
        String name = ctx.constructorName().getText();
        List<Parameter> parameters = extractParameters(ctx.formalParameterList());
        List<ConstructorInitializer> initializers = new ArrayList<>();
        if (ctx.constructorInitializerList() != null) {
            for (DartParser.ConstructorInitializerContext ci : ctx.constructorInitializerList().constructorInitializer()) {
                initializers.add(toConstructorInitializer(ci));
            }
        }
        Block body = ctx.block() != null ? (Block) visit(ctx.block()) : null;
        return new ConstructorDeclaration(isConst, isFactory, name, parameters, initializers, body);
    }

    @Override
    public ASTNode visitMethodDeclaration(DartParser.MethodDeclarationContext ctx) {
        boolean isStatic = ctx.STATIC() != null;
        TypeNode returnType = ctx.type() != null ? toTypeNode(ctx.type()) : (ctx.VOID() != null ? new TypeNode("void") : null);
        String name = ctx.IDENTIFIER().getText();
        List<Parameter> parameters = extractParameters(ctx.formalParameterList());
        boolean isAsync = ctx.asyncModifier() != null;
        Block body = ctx.block() != null ? (Block) visit(ctx.block()) : null;
        Expression arrow = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new MethodDeclaration(isStatic, returnType, name, parameters, isAsync, body, arrow);
    }

    @Override
    public ASTNode visitGetterDeclaration(DartParser.GetterDeclarationContext ctx) {
        boolean isStatic = ctx.STATIC() != null;
        TypeNode returnType = ctx.type() != null ? toTypeNode(ctx.type()) : (ctx.VOID() != null ? new TypeNode("void") : null);
        String name = ctx.IDENTIFIER().getText();
        Block body = ctx.block() != null ? (Block) visit(ctx.block()) : null;
        Expression arrow = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new GetterDeclaration(isStatic, returnType, name, body, arrow);
    }

    @Override
    public ASTNode visitSetterDeclaration(DartParser.SetterDeclarationContext ctx) {
        boolean isStatic = ctx.STATIC() != null;
        String name = ctx.IDENTIFIER().getText();
        Parameter param = toParameter(ctx.normalParameter());
        Block body = ctx.block() != null ? (Block) visit(ctx.block()) : null;
        Expression arrow = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new SetterDeclaration(isStatic, name, param, body, arrow);
    }

    @Override
    public ASTNode visitOperatorDeclaration(DartParser.OperatorDeclarationContext ctx) {
        TypeNode returnType = ctx.type() != null ? toTypeNode(ctx.type()) : (ctx.VOID() != null ? new TypeNode("void") : null);
        String op = ctx.userDefinableOperator().getText();
        List<Parameter> params = extractParameters(ctx.formalParameterList());
        Block body = ctx.block() != null ? (Block) visit(ctx.block()) : null;
        Expression arrow = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new OperatorDeclaration(returnType, op, params, body, arrow);
    }

    @Override
    public ASTNode visitTopLevelFunctionDeclaration(DartParser.TopLevelFunctionDeclarationContext ctx) {
        TypeNode returnType = ctx.type() != null ? toTypeNode(ctx.type()) : (ctx.VOID() != null ? new TypeNode("void") : null);
        String name = ctx.IDENTIFIER().getText();
        List<Parameter> parameters = extractParameters(ctx.formalParameterList());
        boolean isAsync = ctx.asyncModifier() != null;
        Block body = ctx.block() != null ? (Block) visit(ctx.block()) : null;
        Expression arrow = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new FunctionDeclaration(returnType, name, parameters, isAsync, body, arrow);
    }

    @Override
    public ASTNode visitTopLevelVariableDeclaration(DartParser.TopLevelVariableDeclarationContext ctx) {
        boolean isFinal = ctx.varModifier() != null && ctx.varModifier().FINAL() != null;
        boolean isConst = ctx.varModifier() != null && ctx.varModifier().CONST() != null;
        boolean isLate = ctx.LATE() != null;
        TypeNode type = ctx.type() != null ? toTypeNode(ctx.type()) : null;
        List<VariableDeclarator> declarators = new ArrayList<>();
        for (DartParser.VariableDeclaratorContext vd : ctx.variableDeclarator()) {
            declarators.add((VariableDeclarator) visit(vd));
        }
        return new VariableDeclarationStatement(isFinal, isConst, isLate, type, declarators);
    }

    @Override
    public ASTNode visitBlock(DartParser.BlockContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (DartParser.StatementContext sc : ctx.statement()) {
            ASTNode node = visit(sc);
            if (node instanceof Statement) {
                statements.add((Statement) node);
            }
        }
        return new Block(statements);
    }

    @Override
    public ASTNode visitVariableDeclarationStatement(DartParser.VariableDeclarationStatementContext ctx) {
        boolean isFinal = ctx.varModifier() != null && ctx.varModifier().FINAL() != null;
        boolean isConst = ctx.varModifier() != null && ctx.varModifier().CONST() != null;
        boolean isLate = ctx.LATE() != null;
        TypeNode type = ctx.type() != null ? toTypeNode(ctx.type()) : null;
        List<VariableDeclarator> declarators = new ArrayList<>();
        for (DartParser.VariableDeclaratorContext vd : ctx.variableDeclarator()) {
            declarators.add((VariableDeclarator) visit(vd));
        }
        return new VariableDeclarationStatement(isFinal, isConst, isLate, type, declarators);
    }

    @Override
    public ASTNode visitVariableDeclarator(DartParser.VariableDeclaratorContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Expression init = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new VariableDeclarator(name, init);
    }

    @Override
    public ASTNode visitIfStatement(DartParser.IfStatementContext ctx) {
        Expression cond = (Expression) visit(ctx.expression());
        Statement thenB = (Statement) visit(ctx.statement(0));
        Statement elseB = ctx.statement().size() > 1 ? (Statement) visit(ctx.statement(1)) : null;
        return new IfStatement(cond, thenB, elseB);
    }

    @Override
    public ASTNode visitForStatement(DartParser.ForStatementContext ctx) {
        boolean isAwait = ctx.AWAIT() != null;
        DartParser.ForLoopPartsContext flp = ctx.forLoopParts();
        if (flp.IN() != null) {
            TypeNode itemType = flp.type() != null ? toTypeNode(flp.type()) : null;
            String itemName = flp.IDENTIFIER().getText();
            Expression iterable = (Expression) visit(flp.expression());
            Statement body = (Statement) visit(ctx.statement());
            return new ForEachStatement(itemType, itemName, iterable, body, isAwait);
        } else {
            Statement init = null;
            if (flp.forInitializer() != null) {
                if (flp.forInitializer().variableDeclarator() != null && !flp.forInitializer().variableDeclarator().isEmpty()) {
                    TypeNode t = flp.forInitializer().type() != null ? toTypeNode(flp.forInitializer().type()) : null;
                    List<VariableDeclarator> decls = new ArrayList<>();
                    for (DartParser.VariableDeclaratorContext vd : flp.forInitializer().variableDeclarator()) {
                        decls.add((VariableDeclarator) visit(vd));
                    }
                    init = new VariableDeclarationStatement(false, false, false, t, decls);
                }
            }
            Expression cond = flp.expression() != null ? (Expression) visit(flp.expression()) : null;
            List<Expression> updates = new ArrayList<>();
            if (flp.expressionList() != null) {
                for (DartParser.ExpressionContext ec : flp.expressionList().expression()) {
                    updates.add((Expression) visit(ec));
                }
            }
            Statement body = (Statement) visit(ctx.statement());
            return new ForStatement(init, cond, updates, body);
        }
    }

    @Override
    public ASTNode visitWhileStatement(DartParser.WhileStatementContext ctx) {
        Expression cond = (Expression) visit(ctx.expression());
        Statement body = (Statement) visit(ctx.statement());
        return new WhileStatement(cond, body);
    }

    @Override
    public ASTNode visitDoWhileStatement(DartParser.DoWhileStatementContext ctx) {
        Statement body = (Statement) visit(ctx.statement());
        Expression cond = (Expression) visit(ctx.expression());
        return new DoWhileStatement(body, cond);
    }

    @Override
    public ASTNode visitSwitchStatement(DartParser.SwitchStatementContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        List<SwitchCase> cases = new ArrayList<>();
        for (DartParser.SwitchCaseContext sc : ctx.switchCase()) {
            cases.add(toSwitchCase(sc));
        }
        List<Statement> defStmts = new ArrayList<>();
        if (ctx.defaultCase() != null) {
            for (DartParser.StatementContext st : ctx.defaultCase().statement()) {
                defStmts.add((Statement) visit(st));
            }
        }
        return new SwitchStatement(expr, cases, defStmts);
    }

    @Override
    public ASTNode visitTryCatchStatement(DartParser.TryCatchStatementContext ctx) {
        Block tryB = (Block) visit(ctx.block());
        List<CatchClause> catches = new ArrayList<>();
        for (DartParser.OnPartContext op : ctx.onPart()) {
            TypeNode onT = op.type() != null ? toTypeNode(op.type()) : null;
            String errVar = null;
            String stVar = null;
            if (op.catchPart() != null) {
                errVar = op.catchPart().IDENTIFIER(0).getText();
                if (op.catchPart().IDENTIFIER().size() > 1) {
                    stVar = op.catchPart().IDENTIFIER(1).getText();
                }
            }
            Block cBody = (Block) visit(op.block());
            catches.add(new CatchClause(onT, errVar, stVar, cBody));
        }
        Block finB = ctx.finallyPart() != null ? (Block) visit(ctx.finallyPart().block()) : null;
        return new TryCatchStatement(tryB, catches, finB);
    }

    @Override
    public ASTNode visitReturnStatement(DartParser.ReturnStatementContext ctx) {
        Expression expr = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new ReturnStatement(expr);
    }

    @Override
    public ASTNode visitThrowStatement(DartParser.ThrowStatementContext ctx) {
        return new ThrowStatement((Expression) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitRethrowStatement(DartParser.RethrowStatementContext ctx) {
        return new RethrowStatement();
    }

    @Override
    public ASTNode visitBreakStatement(DartParser.BreakStatementContext ctx) {
        String label = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
        return new BreakStatement(label);
    }

    @Override
    public ASTNode visitContinueStatement(DartParser.ContinueStatementContext ctx) {
        String label = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
        return new ContinueStatement(label);
    }

    @Override
    public ASTNode visitYieldStatement(DartParser.YieldStatementContext ctx) {
        boolean isStar = ctx.MUL() != null;
        Expression expr = (Expression) visit(ctx.expression());
        return new YieldStatement(isStar, expr);
    }

    @Override
    public ASTNode visitAssertStatement(DartParser.AssertStatementContext ctx) {
        Expression cond = (Expression) visit(ctx.expression(0));
        Expression msg = ctx.expression().size() > 1 ? (Expression) visit(ctx.expression(1)) : null;
        return new AssertStatement(cond, msg);
    }

    @Override
    public ASTNode visitPrintStatement(DartParser.PrintStatementContext ctx) {
        Expression expr = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new PrintStatement(expr);
    }

    @Override
    public ASTNode visitExpressionStatement(DartParser.ExpressionStatementContext ctx) {
        return new ExpressionStatement((Expression) visit(ctx.expression()));
    }

    // --- Expression Visitors ---

    @Override
    public ASTNode visitCascadeExpr(DartParser.CascadeExprContext ctx) {
        Expression target = (Expression) visit(ctx.expression());
        List<Expression> sections = new ArrayList<>();
        sections.add(new IdentifierExpression(ctx.cascadeSection().getText()));
        return new CascadeExpression(target, sections);
    }

    @Override
    public ASTNode visitAssignmentExpr(DartParser.AssignmentExprContext ctx) {
        Expression target = (Expression) visit(ctx.expression(0));
        String op = ctx.assignmentOperator().getText();
        Expression val = (Expression) visit(ctx.expression(1));
        return new AssignmentExpression(target, op, val);
    }

    @Override
    public ASTNode visitConditionalExpr(DartParser.ConditionalExprContext ctx) {
        Expression cond = (Expression) visit(ctx.expression(0));
        Expression thenE = (Expression) visit(ctx.expression(1));
        Expression elseE = (Expression) visit(ctx.expression(2));
        return new ConditionalExpression(cond, thenE, elseE);
    }

    @Override
    public ASTNode visitNullCoalescingExpr(DartParser.NullCoalescingExprContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));
        return new NullCoalescingExpression(left, right);
    }

    @Override
    public ASTNode visitLogicalOrExpr(DartParser.LogicalOrExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), "||", (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitLogicalAndExpr(DartParser.LogicalAndExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), "&&", (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitEqualityExpr(DartParser.EqualityExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), ctx.equalityOperator().getText(), (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitRelationalExpr(DartParser.RelationalExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), ctx.relationalOperator().getText(), (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitTypeTestExpr(DartParser.TypeTestExprContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        String op = ctx.NOT() != null ? "is!" : "is";
        TypeNode type = toTypeNode(ctx.type());
        return new TypeTestExpression(expr, op, type);
    }

    @Override
    public ASTNode visitTypeCastExpr(DartParser.TypeCastExprContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        TypeNode type = toTypeNode(ctx.type());
        return new TypeCastExpression(expr, type);
    }

    @Override
    public ASTNode visitBitwiseOrExpr(DartParser.BitwiseOrExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), "|", (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitBitwiseXorExpr(DartParser.BitwiseXorExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), "^", (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitBitwiseAndExpr(DartParser.BitwiseAndExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), "&", (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitShiftExpr(DartParser.ShiftExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), ctx.shiftOperator().getText(), (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitAdditiveExpr(DartParser.AdditiveExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), ctx.additiveOperator().getText(), (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitMultiplicativeExpr(DartParser.MultiplicativeExprContext ctx) {
        return new BinaryExpression((Expression) visit(ctx.expression(0)), ctx.multiplicativeOperator().getText(), (Expression) visit(ctx.expression(1)));
    }

    @Override
    public ASTNode visitPrefixExpr(DartParser.PrefixExprContext ctx) {
        return new UnaryExpression(ctx.prefixOperator().getText(), (Expression) visit(ctx.expression()), true);
    }

    @Override
    public ASTNode visitAwaitExpr(DartParser.AwaitExprContext ctx) {
        return new UnaryExpression("await", (Expression) visit(ctx.expression()), true);
    }

    @Override
    public ASTNode visitPostfixExpr(DartParser.PostfixExprContext ctx) {
        return new UnaryExpression(ctx.postfixOperator().getText(), (Expression) visit(ctx.expression()), false);
    }

    @Override
    public ASTNode visitSelectorExpr(DartParser.SelectorExprContext ctx) {
        Expression target = (Expression) visit(ctx.expression());
        DartParser.SelectorContext sel = ctx.selector();
        if (sel.DOT() != null) {
            return new MemberAccessExpression(target, sel.IDENTIFIER().getText(), false);
        } else if (sel.NULL_AWARE_DOT() != null) {
            return new MemberAccessExpression(target, sel.IDENTIFIER().getText(), true);
        } else if (sel.LPAREN() != null) {
            List<Argument> args = new ArrayList<>();
            if (sel.argumentList() != null) {
                for (DartParser.ArgumentContext a : sel.argumentList().argument()) {
                    args.add(toArgument(a));
                }
            }
            return new FunctionCallExpression(target, args);
        } else if (sel.LBRACKET() != null) {
            Expression idx = (Expression) visit(sel.expression());
            return new IndexAccessExpression(target, idx, false);
        } else if (sel.NULL_AWARE_INDEX() != null) {
            Expression idx = (Expression) visit(sel.expression());
            return new IndexAccessExpression(target, idx, true);
        }
        return target;
    }

    @Override
    public ASTNode visitPrimaryExpr(DartParser.PrimaryExprContext ctx) {
        DartParser.PrimaryContext p = ctx.primary();
        if (p.literal() != null) {
            return toLiteral(p.literal());
        } else if (p.IDENTIFIER() != null) {
            return new IdentifierExpression(p.IDENTIFIER().getText());
        } else if (p.THIS() != null) {
            return new ThisExpression();
        } else if (p.SUPER() != null) {
            return new SuperExpression();
        } else if (p.LPAREN() != null && p.expression() != null) {
            return visit(p.expression());
        } else if (p.listLiteral() != null) {
            return visit(p.listLiteral());
        } else if (p.setOrMapLiteral() != null) {
            return visit(p.setOrMapLiteral());
        } else if (p.objectCreation() != null) {
            return visit(p.objectCreation());
        } else if (p.functionExpression() != null) {
            return visit(p.functionExpression());
        }
        return new IdentifierExpression(ctx.getText());
    }

    @Override
    public ASTNode visitListLiteral(DartParser.ListLiteralContext ctx) {
        List<ASTNode> elems = new ArrayList<>();
        if (ctx.collectionElementList() != null) {
            for (DartParser.CollectionElementContext ce : ctx.collectionElementList().collectionElement()) {
                elems.add(visit(ce));
            }
        }
        return new ListLiteral(elems);
    }

    @Override
    public ASTNode visitSetOrMapLiteral(DartParser.SetOrMapLiteralContext ctx) {
        List<ASTNode> elems = new ArrayList<>();
        if (ctx.collectionElementList() != null) {
            for (DartParser.CollectionElementContext ce : ctx.collectionElementList().collectionElement()) {
                elems.add(visit(ce));
            }
        }
        return new MapLiteral(elems);
    }

    @Override
    public ASTNode visitMapEntryElement(DartParser.MapEntryElementContext ctx) {
        Expression k = (Expression) visit(ctx.expression(0));
        Expression v = (Expression) visit(ctx.expression(1));
        return new MapEntryElement(k, v);
    }

    @Override
    public ASTNode visitSpreadElement(DartParser.SpreadElementContext ctx) {
        boolean isNullAware = ctx.TRIPLE_DOT_QUESTION() != null;
        Expression expr = (Expression) visit(ctx.expression());
        return new SpreadElement(expr, isNullAware);
    }

    @Override
    public ASTNode visitIfElement(DartParser.IfElementContext ctx) {
        Expression cond = (Expression) visit(ctx.expression());
        ASTNode thenE = visit(ctx.collectionElement(0));
        ASTNode elseE = ctx.collectionElement().size() > 1 ? visit(ctx.collectionElement(1)) : null;
        return new CollectionIfElement(cond, thenE, elseE);
    }

    @Override
    public ASTNode visitForElement(DartParser.ForElementContext ctx) {
        String varName = ctx.forLoopParts().IDENTIFIER() != null ? ctx.forLoopParts().IDENTIFIER().getText() : "item";
        Expression iter = (Expression) visit(ctx.forLoopParts().expression());
        ASTNode body = visit(ctx.collectionElement());
        return new CollectionForElement(varName, iter, body);
    }

    @Override
    public ASTNode visitExpressionElement(DartParser.ExpressionElementContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitObjectCreation(DartParser.ObjectCreationContext ctx) {
        boolean isConst = ctx.NEW() == null;
        TypeNode type = toTypeNode(ctx.type());
        String constructorName = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
        List<Argument> args = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (DartParser.ArgumentContext a : ctx.argumentList().argument()) {
                args.add(toArgument(a));
            }
        }
        return new ObjectCreationExpression(isConst, type, constructorName, args);
    }

    @Override
    public ASTNode visitFunctionExpression(DartParser.FunctionExpressionContext ctx) {
        List<Parameter> params = extractParameters(ctx.formalParameterList());
        boolean isAsync = ctx.asyncModifier() != null;
        Block body = ctx.block() != null ? (Block) visit(ctx.block()) : null;
        Expression arrow = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new LambdaExpression(params, isAsync, body, arrow);
    }

    // --- Helpers ---

    private TypeNode toTypeNode(DartParser.TypeContext ctx) {
        if (ctx == null) return new TypeNode("dynamic");
        String name = ctx.typeName() != null ? ctx.typeName().getText() : "Function";
        List<TypeNode> typeArgs = new ArrayList<>();
        if (ctx.typeArguments() != null) {
            for (DartParser.TypeContext t : ctx.typeArguments().type()) {
                typeArgs.add(toTypeNode(t));
            }
        }
        boolean isNullable = ctx.QUESTION() != null;
        return new TypeNode(name, typeArgs, isNullable);
    }

    private List<Parameter> extractParameters(DartParser.FormalParameterListContext fpl) {
        List<Parameter> params = new ArrayList<>();
        if (fpl == null || fpl.parameterList() == null) return params;
        DartParser.ParameterListContext pl = fpl.parameterList();
        for (DartParser.NormalParameterContext np : pl.normalParameter()) {
            params.add(toParameter(np));
        }
        if (pl.optionalParameterGroup() != null) {
            DartParser.OptionalParameterGroupContext opg = pl.optionalParameterGroup();
            for (DartParser.OptionalPositionalParameterContext op : opg.optionalPositionalParameter()) {
                params.add(toOptionalPositionalParameter(op));
            }
            for (DartParser.NamedParameterContext np : opg.namedParameter()) {
                params.add(toNamedParameter(np));
            }
        }
        return params;
    }

    private Parameter toParameter(DartParser.NormalParameterContext ctx) {
        TypeNode type = ctx.type() != null ? toTypeNode(ctx.type()) : null;
        String name = ctx.IDENTIFIER().getText();
        boolean isThis = ctx.THIS() != null;
        boolean isSuper = ctx.SUPER() != null;
        Expression defVal = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new Parameter(type, name, false, false, false, isThis, isSuper, defVal);
    }

    private Parameter toOptionalPositionalParameter(DartParser.OptionalPositionalParameterContext ctx) {
        TypeNode type = ctx.type() != null ? toTypeNode(ctx.type()) : null;
        String name = ctx.IDENTIFIER().getText();
        boolean isThis = ctx.THIS() != null;
        boolean isSuper = ctx.SUPER() != null;
        Expression defVal = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new Parameter(type, name, false, false, true, isThis, isSuper, defVal);
    }

    private Parameter toNamedParameter(DartParser.NamedParameterContext ctx) {
        TypeNode type = ctx.type() != null ? toTypeNode(ctx.type()) : null;
        String name = ctx.IDENTIFIER().getText();
        boolean isReq = ctx.REQUIRED() != null;
        boolean isThis = ctx.THIS() != null;
        boolean isSuper = ctx.SUPER() != null;
        Expression defVal = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new Parameter(type, name, isReq, true, false, isThis, isSuper, defVal);
    }

    private Argument toArgument(DartParser.ArgumentContext ctx) {
        String name = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
        Expression val = (Expression) visit(ctx.expression());
        return new Argument(name, val);
    }

    private ConstructorInitializer toConstructorInitializer(DartParser.ConstructorInitializerContext ctx) {
        if (ctx.SUPER() != null) {
            String target = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
            List<Argument> args = new ArrayList<>();
            if (ctx.argumentList() != null) {
                for (DartParser.ArgumentContext a : ctx.argumentList().argument()) {
                    args.add(toArgument(a));
                }
            }
            return new ConstructorInitializer("super", target, args, null);
        } else if (ctx.THIS() != null && ctx.LPAREN() != null) {
            String target = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
            List<Argument> args = new ArrayList<>();
            if (ctx.argumentList() != null) {
                for (DartParser.ArgumentContext a : ctx.argumentList().argument()) {
                    args.add(toArgument(a));
                }
            }
            return new ConstructorInitializer("this", target, args, null);
        } else if (ctx.ASSERT() != null) {
            Expression expr = (Expression) visit(ctx.expression(0));
            return new ConstructorInitializer("assert", null, new ArrayList<>(), expr);
        } else {
            String target = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : "field";
            Expression val = (Expression) visit(ctx.expression(0));
            return new ConstructorInitializer("field", target, new ArrayList<>(), val);
        }
    }

    private SwitchCase toSwitchCase(DartParser.SwitchCaseContext ctx) {
        Expression pat = (Expression) visit(ctx.expression(0));
        Expression guard = ctx.WHEN() != null && ctx.expression().size() > 1 ? (Expression) visit(ctx.expression(1)) : null;
        List<Statement> stmts = new ArrayList<>();
        for (DartParser.StatementContext st : ctx.statement()) {
            stmts.add((Statement) visit(st));
        }
        return new SwitchCase(pat, guard, stmts);
    }

    private LiteralExpression toLiteral(DartParser.LiteralContext ctx) {
        if (ctx.INT_LITERAL() != null) {
            return new LiteralExpression(Long.parseLong(ctx.INT_LITERAL().getText()), "int");
        } else if (ctx.HEX_LITERAL() != null) {
            return new LiteralExpression(ctx.HEX_LITERAL().getText(), "hex");
        } else if (ctx.DOUBLE_LITERAL() != null) {
            return new LiteralExpression(Double.parseDouble(ctx.DOUBLE_LITERAL().getText()), "double");
        } else if (ctx.STRING_LITERAL() != null) {
            return new LiteralExpression(ctx.STRING_LITERAL().getText(), "String");
        } else if (ctx.SYMBOL_LITERAL() != null) {
            return new LiteralExpression(ctx.SYMBOL_LITERAL().getText(), "Symbol");
        } else if (ctx.TRUE() != null) {
            return new LiteralExpression(true, "bool");
        } else if (ctx.FALSE() != null) {
            return new LiteralExpression(false, "bool");
        } else {
            return new LiteralExpression(null, "null");
        }
    }
}