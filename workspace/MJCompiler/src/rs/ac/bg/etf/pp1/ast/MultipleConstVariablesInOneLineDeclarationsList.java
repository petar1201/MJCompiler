// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class MultipleConstVariablesInOneLineDeclarationsList extends MultipleConstVariablesInOneLineDeclarations {

    private MultipleConstVariablesInOneLineDeclarations MultipleConstVariablesInOneLineDeclarations;
    private String I2;
    private NumOrCharOrBoolConst NumOrCharOrBoolConst;

    public MultipleConstVariablesInOneLineDeclarationsList (MultipleConstVariablesInOneLineDeclarations MultipleConstVariablesInOneLineDeclarations, String I2, NumOrCharOrBoolConst NumOrCharOrBoolConst) {
        this.MultipleConstVariablesInOneLineDeclarations=MultipleConstVariablesInOneLineDeclarations;
        if(MultipleConstVariablesInOneLineDeclarations!=null) MultipleConstVariablesInOneLineDeclarations.setParent(this);
        this.I2=I2;
        this.NumOrCharOrBoolConst=NumOrCharOrBoolConst;
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.setParent(this);
    }

    public MultipleConstVariablesInOneLineDeclarations getMultipleConstVariablesInOneLineDeclarations() {
        return MultipleConstVariablesInOneLineDeclarations;
    }

    public void setMultipleConstVariablesInOneLineDeclarations(MultipleConstVariablesInOneLineDeclarations MultipleConstVariablesInOneLineDeclarations) {
        this.MultipleConstVariablesInOneLineDeclarations=MultipleConstVariablesInOneLineDeclarations;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public NumOrCharOrBoolConst getNumOrCharOrBoolConst() {
        return NumOrCharOrBoolConst;
    }

    public void setNumOrCharOrBoolConst(NumOrCharOrBoolConst NumOrCharOrBoolConst) {
        this.NumOrCharOrBoolConst=NumOrCharOrBoolConst;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleConstVariablesInOneLineDeclarations!=null) MultipleConstVariablesInOneLineDeclarations.accept(visitor);
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleConstVariablesInOneLineDeclarations!=null) MultipleConstVariablesInOneLineDeclarations.traverseTopDown(visitor);
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleConstVariablesInOneLineDeclarations!=null) MultipleConstVariablesInOneLineDeclarations.traverseBottomUp(visitor);
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleConstVariablesInOneLineDeclarationsList(\n");

        if(MultipleConstVariablesInOneLineDeclarations!=null)
            buffer.append(MultipleConstVariablesInOneLineDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(NumOrCharOrBoolConst!=null)
            buffer.append(NumOrCharOrBoolConst.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleConstVariablesInOneLineDeclarationsList]");
        return buffer.toString();
    }
}
