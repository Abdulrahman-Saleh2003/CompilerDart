// Generated from DartParser.g4 by ANTLR 4.13.2

package gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartParser}.
 */
public interface DartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#libraryDirective}.
	 * @param ctx the parse tree
	 */
	void enterLibraryDirective(DartParser.LibraryDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#libraryDirective}.
	 * @param ctx the parse tree
	 */
	void exitLibraryDirective(DartParser.LibraryDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(DartParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(DartParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#exportDirective}.
	 * @param ctx the parse tree
	 */
	void enterExportDirective(DartParser.ExportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#exportDirective}.
	 * @param ctx the parse tree
	 */
	void exitExportDirective(DartParser.ExportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#partDirective}.
	 * @param ctx the parse tree
	 */
	void enterPartDirective(DartParser.PartDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#partDirective}.
	 * @param ctx the parse tree
	 */
	void exitPartDirective(DartParser.PartDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#partOfDirective}.
	 * @param ctx the parse tree
	 */
	void enterPartOfDirective(DartParser.PartOfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#partOfDirective}.
	 * @param ctx the parse tree
	 */
	void exitPartOfDirective(DartParser.PartOfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(DartParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(DartParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(DartParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(DartParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(DartParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(DartParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDeclaration(DartParser.TopLevelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDeclaration(DartParser.TopLevelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(DartParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(DartParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#mixinDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMixinDeclaration(DartParser.MixinDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#mixinDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMixinDeclaration(DartParser.MixinDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExtensionDeclaration(DartParser.ExtensionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExtensionDeclaration(DartParser.ExtensionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(DartParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(DartParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(DartParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(DartParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedefDeclaration(DartParser.TypedefDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedefDeclaration(DartParser.TypedefDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(DartParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(DartParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(DartParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(DartParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(DartParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(DartParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(DartParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(DartParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#constructorName}.
	 * @param ctx the parse tree
	 */
	void enterConstructorName(DartParser.ConstructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#constructorName}.
	 * @param ctx the parse tree
	 */
	void exitConstructorName(DartParser.ConstructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#constructorInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInitializerList(DartParser.ConstructorInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#constructorInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInitializerList(DartParser.ConstructorInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInitializer(DartParser.ConstructorInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInitializer(DartParser.ConstructorInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(DartParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(DartParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#getterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGetterDeclaration(DartParser.GetterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#getterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGetterDeclaration(DartParser.GetterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#setterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSetterDeclaration(DartParser.SetterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#setterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSetterDeclaration(DartParser.SetterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDeclaration(DartParser.OperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDeclaration(DartParser.OperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#userDefinableOperator}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinableOperator(DartParser.UserDefinableOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#userDefinableOperator}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinableOperator(DartParser.UserDefinableOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#topLevelFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelFunctionDeclaration(DartParser.TopLevelFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#topLevelFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelFunctionDeclaration(DartParser.TopLevelFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#topLevelVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelVariableDeclaration(DartParser.TopLevelVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#topLevelVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelVariableDeclaration(DartParser.TopLevelVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#asyncModifier}.
	 * @param ctx the parse tree
	 */
	void enterAsyncModifier(DartParser.AsyncModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#asyncModifier}.
	 * @param ctx the parse tree
	 */
	void exitAsyncModifier(DartParser.AsyncModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(DartParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(DartParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(DartParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(DartParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#optionalParameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameterGroup(DartParser.OptionalParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#optionalParameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameterGroup(DartParser.OptionalParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#normalParameter}.
	 * @param ctx the parse tree
	 */
	void enterNormalParameter(DartParser.NormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#normalParameter}.
	 * @param ctx the parse tree
	 */
	void exitNormalParameter(DartParser.NormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#optionalPositionalParameter}.
	 * @param ctx the parse tree
	 */
	void enterOptionalPositionalParameter(DartParser.OptionalPositionalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#optionalPositionalParameter}.
	 * @param ctx the parse tree
	 */
	void exitOptionalPositionalParameter(DartParser.OptionalPositionalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#namedParameter}.
	 * @param ctx the parse tree
	 */
	void enterNamedParameter(DartParser.NamedParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#namedParameter}.
	 * @param ctx the parse tree
	 */
	void exitNamedParameter(DartParser.NamedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(DartParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(DartParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(DartParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(DartParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(DartParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(DartParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DartParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DartParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(DartParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(DartParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(DartParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(DartParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DartParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DartParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(DartParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(DartParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DartParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DartParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(DartParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#forLoopParts}.
	 * @param ctx the parse tree
	 */
	void enterForLoopParts(DartParser.ForLoopPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#forLoopParts}.
	 * @param ctx the parse tree
	 */
	void exitForLoopParts(DartParser.ForLoopPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#forInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForInitializer(DartParser.ForInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#forInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForInitializer(DartParser.ForInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DartParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DartParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(DartParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(DartParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(DartParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(DartParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(DartParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(DartParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(DartParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(DartParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(DartParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(DartParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(DartParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(DartParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#onPart}.
	 * @param ctx the parse tree
	 */
	void enterOnPart(DartParser.OnPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#onPart}.
	 * @param ctx the parse tree
	 */
	void exitOnPart(DartParser.OnPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#catchPart}.
	 * @param ctx the parse tree
	 */
	void enterCatchPart(DartParser.CatchPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#catchPart}.
	 * @param ctx the parse tree
	 */
	void exitCatchPart(DartParser.CatchPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#finallyPart}.
	 * @param ctx the parse tree
	 */
	void enterFinallyPart(DartParser.FinallyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#finallyPart}.
	 * @param ctx the parse tree
	 */
	void exitFinallyPart(DartParser.FinallyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(DartParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(DartParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(DartParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(DartParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#rethrowStatement}.
	 * @param ctx the parse tree
	 */
	void enterRethrowStatement(DartParser.RethrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#rethrowStatement}.
	 * @param ctx the parse tree
	 */
	void exitRethrowStatement(DartParser.RethrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(DartParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(DartParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(DartParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(DartParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(DartParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(DartParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(DartParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(DartParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(DartParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(DartParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(DartParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(DartParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseAndExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExpr(DartParser.BitwiseAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseAndExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExpr(DartParser.BitwiseAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseOrExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExpr(DartParser.BitwiseOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseOrExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExpr(DartParser.BitwiseOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(DartParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(DartParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(DartParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(DartParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(DartParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(DartParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(DartParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(DartParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(DartParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(DartParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(DartParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(DartParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(DartParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(DartParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(DartParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(DartParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpr(DartParser.AwaitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpr(DartParser.AwaitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullCoalescingExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullCoalescingExpr(DartParser.NullCoalescingExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullCoalescingExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullCoalescingExpr(DartParser.NullCoalescingExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(DartParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(DartParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpr(DartParser.SelectorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpr(DartParser.SelectorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(DartParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(DartParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(DartParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(DartParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CascadeExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCascadeExpr(DartParser.CascadeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CascadeExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCascadeExpr(DartParser.CascadeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseXorExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorExpr(DartParser.BitwiseXorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseXorExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorExpr(DartParser.BitwiseXorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeTestExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeTestExpr(DartParser.TypeTestExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeTestExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeTestExpr(DartParser.TypeTestExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(DartParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(DartParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCastExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastExpr(DartParser.TypeCastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCastExpr}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastExpr(DartParser.TypeCastExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#cascadeOperator}.
	 * @param ctx the parse tree
	 */
	void enterCascadeOperator(DartParser.CascadeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#cascadeOperator}.
	 * @param ctx the parse tree
	 */
	void exitCascadeOperator(DartParser.CascadeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#cascadeSection}.
	 * @param ctx the parse tree
	 */
	void enterCascadeSection(DartParser.CascadeSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#cascadeSection}.
	 * @param ctx the parse tree
	 */
	void exitCascadeSection(DartParser.CascadeSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(DartParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(DartParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(DartParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(DartParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(DartParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(DartParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(DartParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(DartParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(DartParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(DartParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(DartParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(DartParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(DartParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(DartParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(DartParser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(DartParser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperator(DartParser.PostfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperator(DartParser.PostfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DartParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DartParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(DartParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(DartParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(DartParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(DartParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#setOrMapLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSetOrMapLiteral(DartParser.SetOrMapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#setOrMapLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSetOrMapLiteral(DartParser.SetOrMapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#collectionElementList}.
	 * @param ctx the parse tree
	 */
	void enterCollectionElementList(DartParser.CollectionElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#collectionElementList}.
	 * @param ctx the parse tree
	 */
	void exitCollectionElementList(DartParser.CollectionElementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapEntryElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void enterMapEntryElement(DartParser.MapEntryElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapEntryElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void exitMapEntryElement(DartParser.MapEntryElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpreadElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void enterSpreadElement(DartParser.SpreadElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpreadElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void exitSpreadElement(DartParser.SpreadElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void enterIfElement(DartParser.IfElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void exitIfElement(DartParser.IfElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void enterForElement(DartParser.ForElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void exitForElement(DartParser.ForElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionElement(DartParser.ExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionElement}
	 * labeled alternative in {@link DartParser#collectionElement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionElement(DartParser.ExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreation(DartParser.ObjectCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreation(DartParser.ObjectCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(DartParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(DartParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(DartParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(DartParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DartParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DartParser.LiteralContext ctx);
}