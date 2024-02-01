// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarationWithBrackets extends VarDecl {

    private Type Type;
    private String I2;
    private MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations;

    public VarDeclarationWithBrackets (Type Type, String I2, MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.I2=I2;
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public MultipleVariablesInOneLineDeclarations getMultipleVariablesInOneLineDeclarations() {
        return MultipleVariablesInOneLineDeclarations;
    }

    public void setMultipleVariablesInOneLineDeclarations(MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarationWithBrackets(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(MultipleVariablesInOneLineDeclarations!=null)
            buffer.append(MultipleVariablesInOneLineDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarationWithBrackets]");
        return buffer.toString();
    }
}
