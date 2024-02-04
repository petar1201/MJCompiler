package rs.ac.bg.etf.pp1.semantic;

import org.apache.log4j.net.SocketNode;

import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Scope;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CustomSymbolTable extends Tab {
	
    public static final Struct boolType = new Struct(Struct.Bool);
    
    public static void init() {
        Tab.init();
        currentScope.addToLocals(new Obj(2, "bool", boolType));
    }
    
    public static void dump() {
    	Tab.dump(new CustomDumpSymbolTableVisitor());
    }
    
    public static Obj findInCurrentScope(String name) {
		Obj resultObj = null;
		Scope s = currentScope;
		if (s.getLocals() != null) {
			resultObj = s.getLocals().searchKey(name);
		}
		return (resultObj != null) ? resultObj : noObj;
    }

    
    private static void sNode(Struct structToVisit, StringBuilder output) {
		switch (structToVisit.getKind()) {
		case Struct.None:
			output.append("notype");
			break;
		case Struct.Int:
			output.append("int");
			break;
		case Struct.Char:
			output.append("char");
			break;
		case Struct.Array:
			output.append("Arr of ");
			
			switch (structToVisit.getElemType().getKind()) {
			case Struct.None:
				output.append("notype");
				break;
			case Struct.Int:
				output.append("int");
				break;
			case Struct.Char:
				output.append("char");
				break;
			case Struct.Class:
				output.append("Class");
				break;
			case Struct.Bool:
				output.append("bool");
				break;
			}
			break;
		case Struct.Bool:
			output.append("bool");
			break;
		}
	}


    public static String objNodeDetails(Obj objToVisit) {
    	StringBuilder output = new StringBuilder();
		switch (objToVisit.getKind()) {
		case Obj.Con:  output.append("Con "); break;
		case Obj.Var:  output.append("Var "); break;
		case Obj.Type: output.append("Type "); break;
		case Obj.Meth: output.append("Meth "); break;
		case Obj.Fld:  output.append("Fld "); break;
		case Obj.Prog: output.append("Prog "); break;
		}
		
		output.append(objToVisit.getName());
		output.append(": ");
		
		if ((Obj.Var == objToVisit.getKind()) && "this".equalsIgnoreCase(objToVisit.getName()))
			output.append("");
		else
			sNode(objToVisit.getType(), output);
		
		
		output.append(", ");
		output.append(objToVisit.getAdr());
		output.append(", ");
		output.append(objToVisit.getLevel() + " ");
		return output.toString();	
	}
}
