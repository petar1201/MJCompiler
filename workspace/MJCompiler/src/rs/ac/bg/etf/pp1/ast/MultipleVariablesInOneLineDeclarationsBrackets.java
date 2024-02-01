// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class MultipleVariablesInOneLineDeclarationsBrackets extends MultipleVariablesInOneLineDeclarations {

    private MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations;
    private String I2;

    public MultipleVariablesInOneLineDeclarationsBrackets (MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations, String I2) {
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.setParent(this);
        this.I2=I2;
    }

    public MultipleVariablesInOneLineDeclarations getMultipleVariablesInOneLineDeclarations() {
        return MultipleVariablesInOneLineDeclarations;
    }

    public void setMultipleVariablesInOneLineDeclarations(MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleVariablesInOneLineDeclarationsBrackets(\n");

        if(MultipleVariablesInOneLineDeclarations!=null)
            buffer.append(MultipleVariablesInOneLineDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleVariablesInOneLineDeclarationsBrackets]");
        return buffer.toString();
    }
}
