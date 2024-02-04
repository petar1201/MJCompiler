package rs.ac.bg.etf.pp1.semantic;


import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;


public class CustomSemanticPass extends VisitorAdaptor{
	

	boolean errorDetected = false;
	public int printCallCount = 0;
	Obj currentMethod = null;
	boolean returnFound = false;
	int nVars;
	
	//---------- My Globals
	public boolean isInNamespace = false;
	public String namespaceNameString = "";
	
	public Struct constType = CustomSymbolTable.noType;
	public int constVal = -1;
	public String constName = "";
	

	public boolean isInVar = false;
	public Struct varType = CustomSymbolTable.noType;
	public String varName = "";
	


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
	
	
	//-------- PROGRAM
	
	@Override
    public void visit(ProgramName ProgramName) { 
		ProgramName.obj = CustomSymbolTable.insert(Obj.Prog, ProgramName.getPName(), CustomSymbolTable.noType);
        CustomSymbolTable.openScope();
		report_info("Program name", ProgramName);
	}
   
	
	@Override
    public void visit(Program program) { 
		Obj objj = CustomSymbolTable.find("main");
		if(objj == CustomSymbolTable.noObj) {
			report_error("Ne postoji main metoda!", null);
		}
		else if(objj.getKind() != Obj.Meth) {
				report_error("Main moze da bude samo metoda", null);
		}
		CustomSymbolTable.chainLocalSymbols(program.getProgramName().obj);
	    CustomSymbolTable.closeScope();
		report_info("Program", program);
	}
	
	//-------- NAMESPACE DECLARATION AND END

	@Override
	public void visit(NamespaceIdent namespaceIdent) {
		isInNamespace = true;
		namespaceNameString = namespaceIdent.getNamespaceName();
		report_info("Namespace Name", namespaceIdent);
	}
	
	@Override
	public void visit(Namespace namespace) {
		isInNamespace = false;
		namespaceNameString = "";
		report_info("Namespace", namespace);
	}
	
	//-------- TYPE
	
	@Override
	public void visit(BasicType basicType) {

		Obj typeObject = CustomSymbolTable.find(basicType.getTypeName());
		
		if(typeObject != CustomSymbolTable.noObj && Obj.Type == typeObject.getKind()) {
			basicType.struct = typeObject.getType();
			report_info("Tip" , basicType);
		}
		else if(typeObject != CustomSymbolTable.noObj && Obj.Type != typeObject.getKind()) {
			report_error("Prosledjeno ime tipa nije type: " + basicType.getTypeName(), basicType);
		}
		else if(typeObject == CustomSymbolTable.noObj) {
			report_error("U tabeli simbola se ne nalazi tip: " + basicType.getTypeName(), basicType);
		}
		
	}
	
	// ------- CONST

	public void checksForConst() {
		Obj objj = CustomSymbolTable.find(constName);
		if(objj != CustomSymbolTable.noObj) {
			report_error("Konstanta sa imenom '" + constName + "' vec postoji." , null);
		}
	}
	
	private void checkAndAddConst() {
		if(isInNamespace) {
			constName = namespaceNameString + "::" + constName;
		}
		checksForConst();
		Obj node = CustomSymbolTable.insert(Obj.Con, constName, constType);
		node.setAdr(constVal);
	}
	

	
	@Override
	public void visit(TypeConstIdent typeConstIdent) {
		constName = typeConstIdent.getConstName();
	}
	
	@Override
	public void visit(CommaIdent commaIdent) {
		constName = commaIdent.getName();
		if(isInVar) {
			varName = commaIdent.getName();
			if(isInNamespace) {
				varName = namespaceNameString + "::" + varName;
			}
			addVar();
		}
	}
	
	@Override
	public void visit(TypeConst typeConst) {
		constType = typeConst.getType().struct;
	}
	
	
	@Override
	public void visit(NumOrCharOrBoolConstBoolConst boolC) {
		if(CustomSymbolTable.boolType != constType) {
			report_error("Ne poklapaju se tipovi kod konstante sa imenom: " + constName, null);
		}
		if(boolC.getBoolValue() == true) {
			constVal = 1;
		}
		else {
			constVal = 0;
		}
		checkAndAddConst();
	}
	
	@Override
	public void visit (NumOrCharOrBoolConstCharConst charC) {
		if(CustomSymbolTable.charType != constType) {
			report_error("Ne poklapaju se tipovi kod konstante sa imenom: " + constName, null);
		}
		constVal = charC.getCharValue();
		checkAndAddConst();

	}
	
	@Override
	public void visit (NumOrCharOrBoolConstNumConst numC) {
		if(CustomSymbolTable.intType != constType) {
			report_error("Ne poklapaju se tipovi kod konstante sa imenom: " + constName, null);
		}
		constVal = numC.getNumValue();
		checkAndAddConst();
	}
	
	
	// ------- VARDECL
	

	private void checkIfVarWithNameExistsInCurrScope() {
		if(CustomSymbolTable.findInCurrentScope(varName) != CustomSymbolTable.noObj) {
			report_error("Promenljiva sa imenom '" + varName + "' vec postoji." , null);
		}
	}
	
	private void addVar() {
		checkIfVarWithNameExistsInCurrScope();
		Obj node = CustomSymbolTable.insert(Obj.Var, varName, varType);
		if(currentMethod == null) {
			node.setLevel(0);
			node.setAdr(nVars++);
		}
		else {
			node.setLevel(1);
		}
	}
	
	private void addArrVar() {
		checkIfVarWithNameExistsInCurrScope();
		Obj node = CustomSymbolTable.insert(Obj.Var, varName, new Struct(Struct.Array, varType));
		if(currentMethod == null) {
			node.setLevel(0);
			node.setAdr(nVars++);
		}
		else {
			node.setLevel(1);
		}
		
	}
	
	
	@Override
	public void visit(VarDecl varDecl) {
		isInVar = false;
	}
	
	@Override
	public void visit(VarTypeIdent varTypeIdent) {
		isInVar = true;
		varType = varTypeIdent.getType().struct;
		varName = varTypeIdent.getVarName();
		if(isInNamespace) {
			varName = namespaceNameString + "::" + varName;
		}
		addVar();
	}
	
	
	@Override
	public void visit(VarrArrTypeIdent varrArrTypeIdent) {
		isInVar = true;
		varType = varrArrTypeIdent.getType().struct;
		varName = varrArrTypeIdent.getVarName();
		if(isInNamespace) {
			varName = namespaceNameString + "::" + varName;
		}
		addArrVar();
	}
	
	@Override
	public void visit(CommaIdentLbracketRbracket commaIdentLbracketRbracket) {
		varName = commaIdentLbracketRbracket.getVarName();
		if(isInNamespace) {
			varName = namespaceNameString + "::" + varName;
		}
		addArrVar();
	}
	
	//----------- MAIN
	@Override
	public void visit(VoidIdent voidIdent) {
		currentMethod = CustomSymbolTable.insert(Obj.Meth, voidIdent.getName(), CustomSymbolTable.noType);
		currentMethod.setLevel(0);
		CustomSymbolTable.openScope();
	}
	
	@Override
	public void visit(VoidMethodDeclaration voidMethodDeclaration) {	
		CustomSymbolTable.chainLocalSymbols(currentMethod);
		CustomSymbolTable.closeScope();
		currentMethod = null;
	}
	
	// ----------- DESIGNATOR
	
	
	
	@Override
	public void visit(BasicDesignator basicDesignator) {
		String dName = basicDesignator.getDesignatorName();
		if(isInNamespace) {
			dName = namespaceNameString + "::" + dName;
		}
		Obj objj = CustomSymbolTable.find(dName);
		if(objj == CustomSymbolTable.noObj) {
			report_error(dName + " nije deklarisano", basicDesignator);
		}
		basicDesignator.obj = objj;
		report_info("Koriscenje " + CustomSymbolTable.objNodeDetails(objj), basicDesignator);
	}
	
	
	@Override
	public void visit(ExtendedDesignator extendedDesignator) {
		String dName = extendedDesignator.getNamespaceName() + "::"+ extendedDesignator.getDesignatorName();
		if(isInNamespace) {
			dName = namespaceNameString + "::" + dName;
		}
		Obj objj = CustomSymbolTable.find(dName);
		if(objj == CustomSymbolTable.noObj) {
			report_error(dName + " nije deklarisano", extendedDesignator);
		}
		extendedDesignator.obj = objj;
		report_info("Koriscenje " + CustomSymbolTable.objNodeDetails(objj), extendedDesignator);
	}
	
	@Override
	public void visit(ArrDesignator arrDesignator) {
		Obj objj = arrDesignator.getDesignator().obj;
		
		if(arrDesignator.getExpr().struct.getKind() == Struct.Array) {
			if(arrDesignator.getExpr().struct.getElemType() != CustomSymbolTable.intType) {
				report_error("Samo int moze da bude u []", arrDesignator);
			}
		}
		else if(arrDesignator.getExpr().struct != CustomSymbolTable.intType) {
			report_error("Samo int moze da bude u []", arrDesignator);
		}
		
		if(objj.getType().getKind() != Struct.Array) {
			report_error(objj.getName() + " nije niz" , arrDesignator);
		}
		
		report_info("Pristup elem niza " + CustomSymbolTable.objNodeDetails(objj), arrDesignator);
		
		arrDesignator.obj = objj;
		
	}
	
	// ------ FACTOR
	
	@Override
	public void visit(FactorDesignator factorDesignator) {
		factorDesignator.struct = factorDesignator.getDesignator().obj.getType();
		if(factorDesignator.getDesignator().getClass() == ArrDesignator.class) {
			factorDesignator.struct = factorDesignator.struct.getElemType();
		}
	}
	
	@Override
	public void visit(FactorNum factorNum) {
		factorNum.struct = CustomSymbolTable.intType;
	}
	
	@Override
	public void visit(FactorChar factorChar) {
		factorChar.struct = CustomSymbolTable.charType;
	}
	
	@Override
	public void visit(FactorBool factorBool) {
		factorBool.struct = CustomSymbolTable.boolType;
	}
	
	@Override
	public void visit(FactorNewTypeBracketsExpr factorNewTypeBracketsExpr) {
		if(factorNewTypeBracketsExpr.getExpr().struct != CustomSymbolTable.intType) {
			report_error("Expr mora da bude int ", factorNewTypeBracketsExpr);
		}
		factorNewTypeBracketsExpr.struct = new Struct(Struct.Array,factorNewTypeBracketsExpr.getType().struct);
	}
	
	@Override
	public void visit(FactorParensExpr factorParensExpr) {
		factorParensExpr.struct = factorParensExpr.getExpr().struct;
	}
	
	//--------TERM
	
	@Override
	public void visit(BasicTermFactor basicTermFactor) {
		basicTermFactor.struct = basicTermFactor.getFactor().struct;

	}
	
	@Override
	public void visit(TermFactorList termFactorList) {
		if(termFactorList.getTerm().struct != termFactorList.getFactor().struct) {
			report_error("tipovi se razlikuju", termFactorList);
		}
		else if(termFactorList.getTerm().struct != CustomSymbolTable.intType || termFactorList.getFactor().struct != CustomSymbolTable.intType) {
			report_error("mora int da bude kad se mulop", termFactorList);
		}
		else
			termFactorList.struct = CustomSymbolTable.intType;
	}
	
	
	//-------- EXPR
	
	
	@Override
	public void visit(BasicExpr basicExpr) {
		basicExpr.struct = basicExpr.getTerm().struct;
	}
	
	@Override 
	public void visit(BasicExprWithMinus basicExprWithMinus) {
		if(basicExprWithMinus.getTerm().struct != CustomSymbolTable.intType) {
			report_error("mora  int da bude kod znaka -", basicExprWithMinus);
		}
		else 
			basicExprWithMinus.struct = basicExprWithMinus.getTerm().struct;
	}
	
	@Override
	public void visit(MultipleExprTerm multipleExprTerm) {
		if(multipleExprTerm.getTerm().struct != multipleExprTerm.getExpr().struct) {
			report_error("tipovi se razlikuju", multipleExprTerm);
		}
		else if(multipleExprTerm.getTerm().struct != CustomSymbolTable.intType || multipleExprTerm.getExpr().struct != CustomSymbolTable.intType) {
			report_error("mora int da bude kad se addop", multipleExprTerm);
		}
		else
			multipleExprTerm.struct = CustomSymbolTable.intType;
	}
	
	//-------- STATEMENT
	
	
	@Override
	public void visit(StatementReadParensDesignatorSemi srpds) {
		if(srpds.getDesignator().obj.getType() != CustomSymbolTable.boolType 
				&& srpds.getDesignator().obj.getType() != CustomSymbolTable.charType
				&& srpds.getDesignator().obj.getType() != CustomSymbolTable.intType) {
			report_error("Designator mora da bude int char ili bool", srpds);
		}
		if(srpds.getDesignator().getClass() != ArrDesignator.class && srpds.getDesignator().obj.getKind() != Obj.Var) {
			report_error("Designator mora da oznacava promenljivu ili element niza", srpds);
		}
	}
	
	
	@Override
	public void visit(StatementPrintParensExprSemi sppes) {
		if(sppes.getExpr().struct != CustomSymbolTable.intType
				&& sppes.getExpr().struct != CustomSymbolTable.boolType
				&& sppes.getExpr().struct != CustomSymbolTable.charType) {
			report_error("Kod printa, expr mora da bude int char ili bool", sppes);
		}
	}
	
	@Override
	public void visit(StatementPrintParensExprNumConstSemi sppencs) {
		if(sppencs.getExpr().struct != CustomSymbolTable.intType
				&& sppencs.getExpr().struct != CustomSymbolTable.boolType
				&& sppencs.getExpr().struct != CustomSymbolTable.charType) {
			report_error("Kod printa, expr mora da bude int char ili bool", sppencs);
		}
	}
	
	//----------- DESIGNATOR STATEMENT
	
	
	@Override
	public void visit(DesignatorStatementIncrement dsi) {
		if(dsi.getDesignator().obj.getType() != CustomSymbolTable.boolType 
				&& dsi.getDesignator().obj.getType() != CustomSymbolTable.charType
				&& dsi.getDesignator().obj.getType() != CustomSymbolTable.intType) {
			report_error("Designator mora da bude int char ili bool", dsi);
		}
		if(dsi.getDesignator().getClass() != ArrDesignator.class && dsi.getDesignator().obj.getKind() != Obj.Var) {
			report_error("Designator mora da oznacava promenljivu ili element niza", dsi);
		}
	}
	
	@Override
	public void visit(DesignatorStatementDecrement dsi) {
		if(dsi.getDesignator().obj.getType() != CustomSymbolTable.boolType 
				&& dsi.getDesignator().obj.getType() != CustomSymbolTable.charType
				&& dsi.getDesignator().obj.getType() != CustomSymbolTable.intType) {
			report_error("Designator mora da bude int char ili bool", dsi);
		}
		if(dsi.getDesignator().getClass() != ArrDesignator.class && dsi.getDesignator().obj.getKind() != Obj.Var) {
			report_error("Designator mora da oznacava promenljivu ili element niza", dsi);
		}
	}
	
	@Override
	public void visit(DesignatorStatementAssignopExpr dsi) {
		if(dsi.getDesignator().getClass() != ArrDesignator.class && dsi.getDesignator().obj.getKind() != Obj.Var) {
			report_error("Designator mora da oznacava promenljivu ili element niza", dsi);
		}
		else {
			if(dsi.getDesignator().getClass() != ArrDesignator.class) {
				if(!dsi.getExpr().struct.assignableTo(dsi.getDesignator().obj.getType())) {
					report_error("TIpovi nisu kompatibilni", dsi);
				}
			}
			else {
				if(!dsi.getExpr().struct.assignableTo(dsi.getDesignator().obj.getType().getElemType())) {
					report_error("TIpovi nisu kompatibilni", dsi);
				}
			}
		}

	}
	
}
