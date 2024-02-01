package rs.ac.bg.etf.pp1;
import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class SemanticPass extends VisitorAdaptor {

	@Override
	public void visit(Unmatched Unmatched) {
		// TODO Auto-generated method stub
		super.visit(Unmatched);
	}

	@Override
	public void visit(MultipleDesignators MultipleDesignators) {
		// TODO Auto-generated method stub
		super.visit(MultipleDesignators);
	}

	@Override
	public void visit(ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration) {
		// TODO Auto-generated method stub
		super.visit(ClassOrVarOrConstDeclaration);
	}

	@Override
	public void visit(Mulop Mulop) {
		// TODO Auto-generated method stub
		super.visit(Mulop);
	}

	@Override
	public void visit(MethodDecl MethodDecl) {
		// TODO Auto-generated method stub
		super.visit(MethodDecl);
	}

	@Override
	public void visit(Matched Matched) {
		// TODO Auto-generated method stub
		super.visit(Matched);
	}

	@Override
	public void visit(Relop Relop) {
		// TODO Auto-generated method stub
		super.visit(Relop);
	}

	@Override
	public void visit(MultipleMethodDeclaration MultipleMethodDeclaration) {
		// TODO Auto-generated method stub
		super.visit(MultipleMethodDeclaration);
	}

	@Override
	public void visit(Addop Addop) {
		// TODO Auto-generated method stub
		super.visit(Addop);
	}

	@Override
	public void visit(DesignatorIdentExprList DesignatorIdentExprList) {
		// TODO Auto-generated method stub
		super.visit(DesignatorIdentExprList);
	}

	@Override
	public void visit(MultipleConstVariablesInOneLineDeclarations MultipleConstVariablesInOneLineDeclarations) {
		// TODO Auto-generated method stub
		super.visit(MultipleConstVariablesInOneLineDeclarations);
	}

	@Override
	public void visit(MultipleDesignatorStatements MultipleDesignatorStatements) {
		// TODO Auto-generated method stub
		super.visit(MultipleDesignatorStatements);
	}

	@Override
	public void visit(MultipleStaticInitializers MultipleStaticInitializers) {
		// TODO Auto-generated method stub
		super.visit(MultipleStaticInitializers);
	}

	@Override
	public void visit(Factor Factor) {
		// TODO Auto-generated method stub
		super.visit(Factor);
	}

	@Override
	public void visit(CondTerm CondTerm) {
		// TODO Auto-generated method stub
		super.visit(CondTerm);
	}

	@Override
	public void visit(NumOrCharOrBoolConst NumOrCharOrBoolConst) {
		// TODO Auto-generated method stub
		super.visit(NumOrCharOrBoolConst);
	}

	@Override
	public void visit(StaticVarDeclarations StaticVarDeclarations) {
		// TODO Auto-generated method stub
		super.visit(StaticVarDeclarations);
	}

	@Override
	public void visit(Designator Designator) {
		// TODO Auto-generated method stub
		super.visit(Designator);
	}

	@Override
	public void visit(Term Term) {
		// TODO Auto-generated method stub
		super.visit(Term);
	}

	@Override
	public void visit(Condition Condition) {
		// TODO Auto-generated method stub
		super.visit(Condition);
	}

	@Override
	public void visit(MultipleVarDeclarations MultipleVarDeclarations) {
		// TODO Auto-generated method stub
		super.visit(MultipleVarDeclarations);
	}

	@Override
	public void visit(MultipleMethodDeclarationsForClass MultipleMethodDeclarationsForClass) {
		// TODO Auto-generated method stub
		super.visit(MultipleMethodDeclarationsForClass);
	}

	@Override
	public void visit(MultipleStatements MultipleStatements) {
		// TODO Auto-generated method stub
		super.visit(MultipleStatements);
	}

	@Override
	public void visit(TypeIdentOptionalBrackets TypeIdentOptionalBrackets) {
		// TODO Auto-generated method stub
		super.visit(TypeIdentOptionalBrackets);
	}

	@Override
	public void visit(MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
		// TODO Auto-generated method stub
		super.visit(MultipleVariablesInOneLineDeclarations);
	}

	@Override
	public void visit(Expr Expr) {
		// TODO Auto-generated method stub
		super.visit(Expr);
	}

	@Override
	public void visit(ExtendableClass ExtendableClass) {
		// TODO Auto-generated method stub
		super.visit(ExtendableClass);
	}

	@Override
	public void visit(ActPars ActPars) {
		// TODO Auto-generated method stub
		super.visit(ActPars);
	}

	@Override
	public void visit(DesignatorStatement DesignatorStatement) {
		// TODO Auto-generated method stub
		super.visit(DesignatorStatement);
	}

	@Override
	public void visit(MultipleTypeIdentOptionalBrackets MultipleTypeIdentOptionalBrackets) {
		// TODO Auto-generated method stub
		super.visit(MultipleTypeIdentOptionalBrackets);
	}

	@Override
	public void visit(Statement Statement) {
		// TODO Auto-generated method stub
		super.visit(Statement);
	}

	@Override
	public void visit(VarDecl VarDecl) {
		// TODO Auto-generated method stub
		super.visit(VarDecl);
	}

	@Override
	public void visit(Type Type) {
		// TODO Auto-generated method stub
		super.visit(Type);
	}

	@Override
	public void visit(ClassDecl ClassDecl) {
		// TODO Auto-generated method stub
		super.visit(ClassDecl);
	}

	@Override
	public void visit(ConstDecl ConstDecl) {
		// TODO Auto-generated method stub
		super.visit(ConstDecl);
	}

	@Override
	public void visit(CondFact CondFact) {
		// TODO Auto-generated method stub
		super.visit(CondFact);
	}

	@Override
	public void visit(StaticInitializer StaticInitializer) {
		// TODO Auto-generated method stub
		super.visit(StaticInitializer);
	}

	@Override
	public void visit(FormPars FormPars) {
		// TODO Auto-generated method stub
		super.visit(FormPars);
	}

	@Override
	public void visit(MultipleNamespace MultipleNamespace) {
		// TODO Auto-generated method stub
		super.visit(MultipleNamespace);
	}

	@Override
	public void visit(EmptyMethodDeclaration EmptyMethodDeclaration) {
		// TODO Auto-generated method stub
		super.visit(EmptyMethodDeclaration);
	}

	@Override
	public void visit(MethodDeclarationOneAndMultiple MethodDeclarationOneAndMultiple) {
		// TODO Auto-generated method stub
		super.visit(MethodDeclarationOneAndMultiple);
	}

	@Override
	public void visit(EmptyClassOrVarOrConstDeclaration EmptyClassOrVarOrConstDeclaration) {
		// TODO Auto-generated method stub
		super.visit(EmptyClassOrVarOrConstDeclaration);
	}

	@Override
	public void visit(ListAndClassDecl ListAndClassDecl) {
		// TODO Auto-generated method stub
		super.visit(ListAndClassDecl);
	}

	@Override
	public void visit(ListAndVarDecl ListAndVarDecl) {
		// TODO Auto-generated method stub
		super.visit(ListAndVarDecl);
	}

	@Override
	public void visit(ListAndConstDecl ListAndConstDecl) {
		// TODO Auto-generated method stub
		super.visit(ListAndConstDecl);
	}

	@Override
	public void visit(EmptyNamespace EmptyNamespace) {
		// TODO Auto-generated method stub
		super.visit(EmptyNamespace);
	}

	@Override
	public void visit(NamespacesOneAndMultiple NamespacesOneAndMultiple) {
		// TODO Auto-generated method stub
		super.visit(NamespacesOneAndMultiple);
	}

	@Override
	public void visit(
			EmptyMultipleConstVariablesInOneLineDeclarations EmptyMultipleConstVariablesInOneLineDeclarations) {
		// TODO Auto-generated method stub
		super.visit(EmptyMultipleConstVariablesInOneLineDeclarations);
	}

	@Override
	public void visit(MultipleConstVariablesInOneLineDeclarationsList MultipleConstVariablesInOneLineDeclarationsList) {
		// TODO Auto-generated method stub
		super.visit(MultipleConstVariablesInOneLineDeclarationsList);
	}

	@Override
	public void visit(NumOrCharOrBoolConstNumConst NumOrCharOrBoolConstNumConst) {
		// TODO Auto-generated method stub
		super.visit(NumOrCharOrBoolConstNumConst);
	}

	@Override
	public void visit(NumOrCharOrBoolConstBoolConst NumOrCharOrBoolConstBoolConst) {
		// TODO Auto-generated method stub
		super.visit(NumOrCharOrBoolConstBoolConst);
	}

	@Override
	public void visit(NumOrCharOrBoolConstCharConst NumOrCharOrBoolConstCharConst) {
		// TODO Auto-generated method stub
		super.visit(NumOrCharOrBoolConstCharConst);
	}

	@Override
	public void visit(EmptyMultipleVariablesInOneLineDeclarations EmptyMultipleVariablesInOneLineDeclarations) {
		// TODO Auto-generated method stub
		super.visit(EmptyMultipleVariablesInOneLineDeclarations);
	}

	@Override
	public void visit(
			MultipleVariablesInOneLineDeclarationsNoBrackets MultipleVariablesInOneLineDeclarationsNoBrackets) {
		// TODO Auto-generated method stub
		super.visit(MultipleVariablesInOneLineDeclarationsNoBrackets);
	}

	@Override
	public void visit(MultipleVariablesInOneLineDeclarationsBrackets MultipleVariablesInOneLineDeclarationsBrackets) {
		// TODO Auto-generated method stub
		super.visit(MultipleVariablesInOneLineDeclarationsBrackets);
	}

	@Override
	public void visit(ClassNotExtened ClassNotExtened) {
		// TODO Auto-generated method stub
		super.visit(ClassNotExtened);
	}

	@Override
	public void visit(ClassExtended ClassExtended) {
		// TODO Auto-generated method stub
		super.visit(ClassExtended);
	}

	@Override
	public void visit(EmptyStaticVarDeclarations EmptyStaticVarDeclarations) {
		// TODO Auto-generated method stub
		super.visit(EmptyStaticVarDeclarations);
	}

	@Override
	public void visit(StaticVarDeclarationsList StaticVarDeclarationsList) {
		// TODO Auto-generated method stub
		super.visit(StaticVarDeclarationsList);
	}

	@Override
	public void visit(EmptyStaticInitalizerList EmptyStaticInitalizerList) {
		// TODO Auto-generated method stub
		super.visit(EmptyStaticInitalizerList);
	}

	@Override
	public void visit(StaticInitializerList StaticInitializerList) {
		// TODO Auto-generated method stub
		super.visit(StaticInitializerList);
	}

	@Override
	public void visit(EmptyMultipleVarDeclarations EmptyMultipleVarDeclarations) {
		// TODO Auto-generated method stub
		super.visit(EmptyMultipleVarDeclarations);
	}

	@Override
	public void visit(MultipleVarDeclarationsList MultipleVarDeclarationsList) {
		// TODO Auto-generated method stub
		super.visit(MultipleVarDeclarationsList);
	}

	@Override
	public void visit(EmptyMultipleMethodDeclarationsForClass EmptyMultipleMethodDeclarationsForClass) {
		// TODO Auto-generated method stub
		super.visit(EmptyMultipleMethodDeclarationsForClass);
	}

	@Override
	public void visit(MultipleMethodDeclarationsForClassList MultipleMethodDeclarationsForClassList) {
		// TODO Auto-generated method stub
		super.visit(MultipleMethodDeclarationsForClassList);
	}

	@Override
	public void visit(EmptyMultipleStatements EmptyMultipleStatements) {
		// TODO Auto-generated method stub
		super.visit(EmptyMultipleStatements);
	}

	@Override
	public void visit(MultipleStatementsList MultipleStatementsList) {
		// TODO Auto-generated method stub
		super.visit(MultipleStatementsList);
	}

	@Override
	public void visit(EmptyMultipleTypeIdentOptionalBrackets EmptyMultipleTypeIdentOptionalBrackets) {
		// TODO Auto-generated method stub
		super.visit(EmptyMultipleTypeIdentOptionalBrackets);
	}

	@Override
	public void visit(MultipleTypeIdentOptionalBracketsList MultipleTypeIdentOptionalBracketsList) {
		// TODO Auto-generated method stub
		super.visit(MultipleTypeIdentOptionalBracketsList);
	}

	@Override
	public void visit(TypeIdentOptionalBracketsBrackets TypeIdentOptionalBracketsBrackets) {
		// TODO Auto-generated method stub
		super.visit(TypeIdentOptionalBracketsBrackets);
	}

	@Override
	public void visit(TypeIdentOptionalBracketsNoBrackets TypeIdentOptionalBracketsNoBrackets) {
		// TODO Auto-generated method stub
		super.visit(TypeIdentOptionalBracketsNoBrackets);
	}

	@Override
	public void visit(EmptyDesignatorIdentExprList EmptyDesignatorIdentExprList) {
		// TODO Auto-generated method stub
		super.visit(EmptyDesignatorIdentExprList);
	}

	@Override
	public void visit(DesignatorIdentExprListExpr DesignatorIdentExprListExpr) {
		// TODO Auto-generated method stub
		super.visit(DesignatorIdentExprListExpr);
	}

	@Override
	public void visit(DesignatorIdentExprListIdent DesignatorIdentExprListIdent) {
		// TODO Auto-generated method stub
		super.visit(DesignatorIdentExprListIdent);
	}

	@Override
	public void visit(EmptyMultipleDesignators EmptyMultipleDesignators) {
		// TODO Auto-generated method stub
		super.visit(EmptyMultipleDesignators);
	}

	@Override
	public void visit(MultipleDesignatorsAddingComma MultipleDesignatorsAddingComma) {
		// TODO Auto-generated method stub
		super.visit(MultipleDesignatorsAddingComma);
	}

	@Override
	public void visit(MultipleDesignatorsAddingDesignatorAndComma MultipleDesignatorsAddingDesignatorAndComma) {
		// TODO Auto-generated method stub
		super.visit(MultipleDesignatorsAddingDesignatorAndComma);
	}

	@Override
	public void visit(EmptyMultipleDesignatorStatements EmptyMultipleDesignatorStatements) {
		// TODO Auto-generated method stub
		super.visit(EmptyMultipleDesignatorStatements);
	}

	@Override
	public void visit(BasicMultipleDesignatorStatements BasicMultipleDesignatorStatements) {
		// TODO Auto-generated method stub
		super.visit(BasicMultipleDesignatorStatements);
	}

	@Override
	public void visit(MultipleDesignatorStatementsList MultipleDesignatorStatementsList) {
		// TODO Auto-generated method stub
		super.visit(MultipleDesignatorStatementsList);
	}

	@Override
	public void visit(MatchedMultipletStatements MatchedMultipletStatements) {
		// TODO Auto-generated method stub
		super.visit(MatchedMultipletStatements);
	}

	@Override
	public void visit(MatchedForLoopCondFact MatchedForLoopCondFact) {
		// TODO Auto-generated method stub
		super.visit(MatchedForLoopCondFact);
	}

	@Override
	public void visit(MatchedForLoop MatchedForLoop) {
		// TODO Auto-generated method stub
		super.visit(MatchedForLoop);
	}

	@Override
	public void visit(MatchedPrintParensExprNumConstSemi MatchedPrintParensExprNumConstSemi) {
		// TODO Auto-generated method stub
		super.visit(MatchedPrintParensExprNumConstSemi);
	}

	@Override
	public void visit(MatchedPrintParensExprSemi MatchedPrintParensExprSemi) {
		// TODO Auto-generated method stub
		super.visit(MatchedPrintParensExprSemi);
	}

	@Override
	public void visit(MatchedReadParensDesignatorSemi MatchedReadParensDesignatorSemi) {
		// TODO Auto-generated method stub
		super.visit(MatchedReadParensDesignatorSemi);
	}

	@Override
	public void visit(MatchedReturnExprSemi MatchedReturnExprSemi) {
		// TODO Auto-generated method stub
		super.visit(MatchedReturnExprSemi);
	}

	@Override
	public void visit(MatchedReturnSemi MatchedReturnSemi) {
		// TODO Auto-generated method stub
		super.visit(MatchedReturnSemi);
	}

	@Override
	public void visit(MatchedContinueSemi MatchedContinueSemi) {
		// TODO Auto-generated method stub
		super.visit(MatchedContinueSemi);
	}

	@Override
	public void visit(MatchedBreakSemi MatchedBreakSemi) {
		// TODO Auto-generated method stub
		super.visit(MatchedBreakSemi);
	}

	@Override
	public void visit(MatchedIfElse MatchedIfElse) {
		// TODO Auto-generated method stub
		super.visit(MatchedIfElse);
	}

	@Override
	public void visit(MatchedDesignatorStatementSemi MatchedDesignatorStatementSemi) {
		// TODO Auto-generated method stub
		super.visit(MatchedDesignatorStatementSemi);
	}

	@Override
	public void visit(IfElseUnmatched IfElseUnmatched) {
		// TODO Auto-generated method stub
		super.visit(IfElseUnmatched);
	}

	@Override
	public void visit(IfUnmatched IfUnmatched) {
		// TODO Auto-generated method stub
		super.visit(IfUnmatched);
	}

	@Override
	public void visit(Mod Mod) {
		// TODO Auto-generated method stub
		super.visit(Mod);
	}

	@Override
	public void visit(Divide Divide) {
		// TODO Auto-generated method stub
		super.visit(Divide);
	}

	@Override
	public void visit(Times Times) {
		// TODO Auto-generated method stub
		super.visit(Times);
	}

	@Override
	public void visit(Minus Minus) {
		// TODO Auto-generated method stub
		super.visit(Minus);
	}

	@Override
	public void visit(Plus Plus) {
		// TODO Auto-generated method stub
		super.visit(Plus);
	}

	@Override
	public void visit(Lte Lte) {
		// TODO Auto-generated method stub
		super.visit(Lte);
	}

	@Override
	public void visit(Lt Lt) {
		// TODO Auto-generated method stub
		super.visit(Lt);
	}

	@Override
	public void visit(Gte Gte) {
		// TODO Auto-generated method stub
		super.visit(Gte);
	}

	@Override
	public void visit(Gt Gt) {
		// TODO Auto-generated method stub
		super.visit(Gt);
	}

	@Override
	public void visit(Neq Neq) {
		// TODO Auto-generated method stub
		super.visit(Neq);
	}

	@Override
	public void visit(Eq Eq) {
		// TODO Auto-generated method stub
		super.visit(Eq);
	}

	@Override
	public void visit(Assignop Assignop) {
		// TODO Auto-generated method stub
		super.visit(Assignop);
	}

	@Override
	public void visit(Label Label) {
		// TODO Auto-generated method stub
		super.visit(Label);
	}

	@Override
	public void visit(ExtendedDesignator ExtendedDesignator) {
		// TODO Auto-generated method stub
		super.visit(ExtendedDesignator);
	}

	@Override
	public void visit(BasicDesignator BasicDesignator) {
		// TODO Auto-generated method stub
		super.visit(BasicDesignator);
	}

	@Override
	public void visit(FactorParensExpr FactorParensExpr) {
		// TODO Auto-generated method stub
		super.visit(FactorParensExpr);
	}

	@Override
	public void visit(FactorNewTypeParensActPars FactorNewTypeParensActPars) {
		// TODO Auto-generated method stub
		super.visit(FactorNewTypeParensActPars);
	}

	@Override
	public void visit(FactorNewTypeParens FactorNewTypeParens) {
		// TODO Auto-generated method stub
		super.visit(FactorNewTypeParens);
	}

	@Override
	public void visit(FactorNewTypeBracketsExpr FactorNewTypeBracketsExpr) {
		// TODO Auto-generated method stub
		super.visit(FactorNewTypeBracketsExpr);
	}

	@Override
	public void visit(FactorConst FactorConst) {
		// TODO Auto-generated method stub
		super.visit(FactorConst);
	}

	@Override
	public void visit(FactorDesifnatorParensActPars FactorDesifnatorParensActPars) {
		// TODO Auto-generated method stub
		super.visit(FactorDesifnatorParensActPars);
	}

	@Override
	public void visit(FactorDesignatorParens FactorDesignatorParens) {
		// TODO Auto-generated method stub
		super.visit(FactorDesignatorParens);
	}

	@Override
	public void visit(FactorDesignator FactorDesignator) {
		// TODO Auto-generated method stub
		super.visit(FactorDesignator);
	}

	@Override
	public void visit(BasicTermFactor BasicTermFactor) {
		// TODO Auto-generated method stub
		super.visit(BasicTermFactor);
	}

	@Override
	public void visit(TermFactorList TermFactorList) {
		// TODO Auto-generated method stub
		super.visit(TermFactorList);
	}

	@Override
	public void visit(BasicTerm BasicTerm) {
		// TODO Auto-generated method stub
		super.visit(BasicTerm);
	}

	@Override
	public void visit(MultipleExprTerm MultipleExprTerm) {
		// TODO Auto-generated method stub
		super.visit(MultipleExprTerm);
	}

	@Override
	public void visit(BasicTermWithMinus BasicTermWithMinus) {
		// TODO Auto-generated method stub
		super.visit(BasicTermWithMinus);
	}

	@Override
	public void visit(ExpandedCondFact ExpandedCondFact) {
		// TODO Auto-generated method stub
		super.visit(ExpandedCondFact);
	}

	@Override
	public void visit(BasicCondFact BasicCondFact) {
		// TODO Auto-generated method stub
		super.visit(BasicCondFact);
	}

	@Override
	public void visit(BasicCondTerm BasicCondTerm) {
		// TODO Auto-generated method stub
		super.visit(BasicCondTerm);
	}

	@Override
	public void visit(ExpandedCondTerm ExpandedCondTerm) {
		// TODO Auto-generated method stub
		super.visit(ExpandedCondTerm);
	}

	@Override
	public void visit(BasicCondition BasicCondition) {
		// TODO Auto-generated method stub
		super.visit(BasicCondition);
	}

	@Override
	public void visit(ExpandedCondition ExpandedCondition) {
		// TODO Auto-generated method stub
		super.visit(ExpandedCondition);
	}

	@Override
	public void visit(BasicActPat BasicActPat) {
		// TODO Auto-generated method stub
		super.visit(BasicActPat);
	}

	@Override
	public void visit(MultipleActPats MultipleActPats) {
		// TODO Auto-generated method stub
		super.visit(MultipleActPats);
	}

	@Override
	public void visit(DesignatorStatementWithPointer DesignatorStatementWithPointer) {
		// TODO Auto-generated method stub
		super.visit(DesignatorStatementWithPointer);
	}

	@Override
	public void visit(DesignatorStatementDecrement DesignatorStatementDecrement) {
		// TODO Auto-generated method stub
		super.visit(DesignatorStatementDecrement);
	}

	@Override
	public void visit(DesignatorStatementIncrement DesignatorStatementIncrement) {
		// TODO Auto-generated method stub
		super.visit(DesignatorStatementIncrement);
	}

	@Override
	public void visit(DesignatorStatementParensActPars DesignatorStatementParensActPars) {
		// TODO Auto-generated method stub
		super.visit(DesignatorStatementParensActPars);
	}

	@Override
	public void visit(DesignatorStatementParens DesignatorStatementParens) {
		// TODO Auto-generated method stub
		super.visit(DesignatorStatementParens);
	}

	@Override
	public void visit(DesignatorStatementAssignopExpr DesignatorStatementAssignopExpr) {
		// TODO Auto-generated method stub
		super.visit(DesignatorStatementAssignopExpr);
	}

	@Override
	public void visit(StatementUnmatched StatementUnmatched) {
		// TODO Auto-generated method stub
		super.visit(StatementUnmatched);
	}

	@Override
	public void visit(StatementMatched StatementMatched) {
		// TODO Auto-generated method stub
		super.visit(StatementMatched);
	}

	@Override
	public void visit(BasicType BasicType) {
		// TODO Auto-generated method stub
		super.visit(BasicType);
	}

	@Override
	public void visit(ExpandedType ExpandedType) {
		// TODO Auto-generated method stub
		super.visit(ExpandedType);
	}

	@Override
	public void visit(FormParameters FormParameters) {
		// TODO Auto-generated method stub
		super.visit(FormParameters);
	}

	@Override
	public void visit(VoidMethodDeclarationFormPars VoidMethodDeclarationFormPars) {
		// TODO Auto-generated method stub
		super.visit(VoidMethodDeclarationFormPars);
	}

	@Override
	public void visit(VoidMethodDeclaration VoidMethodDeclaration) {
		// TODO Auto-generated method stub
		super.visit(VoidMethodDeclaration);
	}

	@Override
	public void visit(TypeMethodDeclarationFormPars TypeMethodDeclarationFormPars) {
		// TODO Auto-generated method stub
		super.visit(TypeMethodDeclarationFormPars);
	}

	@Override
	public void visit(TypeMethodDeclaration TypeMethodDeclaration) {
		// TODO Auto-generated method stub
		super.visit(TypeMethodDeclaration);
	}

	@Override
	public void visit(StaticInit StaticInit) {
		// TODO Auto-generated method stub
		super.visit(StaticInit);
	}

	@Override
	public void visit(ClassDeclaration ClassDeclaration) {
		// TODO Auto-generated method stub
		super.visit(ClassDeclaration);
	}

	@Override
	public void visit(VarDeclarationWithoutBrackets VarDeclarationWithoutBrackets) {
		// TODO Auto-generated method stub
		super.visit(VarDeclarationWithoutBrackets);
	}

	@Override
	public void visit(VarDeclarationWithBrackets VarDeclarationWithBrackets) {
		// TODO Auto-generated method stub
		super.visit(VarDeclarationWithBrackets);
	}

	@Override
	public void visit(ConstDeclaration ConstDeclaration) {
		// TODO Auto-generated method stub
		super.visit(ConstDeclaration);
	}

	@Override
	public void visit(Namespace Namespace) {
		// TODO Auto-generated method stub
		super.visit(Namespace);
	}

	@Override
	public void visit(Program Program) {
		// TODO Auto-generated method stub
		super.visit(Program);
	}

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		super.visit();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	boolean errorDetected = false;
	int printCallCount = 0;
	Obj currentMethod = null;
	boolean returnFound = false;
	int nVars;

	Logger log = Logger.getLogger(getClass());

	public void report_error(String message, SyntaxNode info) {
		errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.error(msg.toString());
	}

	public void report_info(String message, SyntaxNode info) {
		StringBuilder msg = new StringBuilder(message); 
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.info(msg.toString());
	}
	
	public boolean passed() {
		return !errorDetected;
	}
	
	
	
}

