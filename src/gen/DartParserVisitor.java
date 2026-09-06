// Generated from DartParser.g4 by ANTLR 4.13.2

package gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#libraryDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDirective(DartParser.LibraryDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#importDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDirective(DartParser.ImportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#exportDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDirective(DartParser.ExportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#partDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartDirective(DartParser.PartDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#partOfDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartOfDirective(DartParser.PartOfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(DartParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(DartParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(DartParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDeclaration(DartParser.TopLevelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(DartParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#mixinDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinDeclaration(DartParser.MixinDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#extensionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionDeclaration(DartParser.ExtensionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(DartParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(DartParser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefDeclaration(DartParser.TypedefDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(DartParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(DartParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(DartParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(DartParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#constructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorName(DartParser.ConstructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#constructorInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInitializerList(DartParser.ConstructorInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#constructorInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInitializer(DartParser.ConstructorInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(DartParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#getterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetterDeclaration(DartParser.GetterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#setterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetterDeclaration(DartParser.SetterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDeclaration(DartParser.OperatorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#userDefinableOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinableOperator(DartParser.UserDefinableOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#topLevelFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelFunctionDeclaration(DartParser.TopLevelFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#topLevelVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelVariableDeclaration(DartParser.TopLevelVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#asyncModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncModifier(DartParser.AsyncModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(DartParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(DartParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#optionalParameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameterGroup(DartParser.OptionalParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#normalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalParameter(DartParser.NormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#optionalPositionalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalPositionalParameter(DartParser.OptionalPositionalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#namedParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParameter(DartParser.NamedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(DartParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(DartParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(DartParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DartParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(DartParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(DartParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DartParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(DartParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DartParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#forLoopParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopParts(DartParser.ForLoopPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#forInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitializer(DartParser.ForInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DartParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DartParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(DartParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(DartParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(DartParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(DartParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(DartParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#onPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPart(DartParser.OnPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#catchPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchPart(DartParser.CatchPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#finallyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyPart(DartParser.FinallyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(DartParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(DartParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#rethrowStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRethrowStatement(DartParser.RethrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(DartParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(DartParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#yieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStatement(DartParser.YieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(DartParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(DartParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(DartParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseAndExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpr(DartParser.BitwiseAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseOrExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpr(DartParser.BitwiseOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(DartParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(DartParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(DartParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(DartParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpr(DartParser.PrefixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(DartParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(DartParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(DartParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AwaitExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpr(DartParser.AwaitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullCoalescingExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullCoalescingExpr(DartParser.NullCoalescingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(DartParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorExpr(DartParser.SelectorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(DartParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(DartParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CascadeExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeExpr(DartParser.CascadeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseXorExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorExpr(DartParser.BitwiseXorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeTestExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTestExpr(DartParser.TypeTestExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpr(DartParser.ShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCastExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExpr(DartParser.TypeCastExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#cascadeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeOperator(DartParser.CascadeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#cascadeSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeSection(DartParser.CascadeSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(DartParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(DartParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(DartParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(DartParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(DartParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(DartParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(DartParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#prefixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOperator(DartParser.PrefixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#postfixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixOperator(DartParser.PostfixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DartParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(DartParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(DartParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#setOrMapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOrMapLiteral(DartParser.SetOrMapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#collectionElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionElementList(DartParser.CollectionElementListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapEntryElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntryElement(DartParser.MapEntryElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpreadElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadElement(DartParser.SpreadElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElement(DartParser.IfElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForElement(DartParser.ForElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionElement(DartParser.ExpressionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#objectCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreation(DartParser.ObjectCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(DartParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(DartParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DartParser.LiteralContext ctx);
}