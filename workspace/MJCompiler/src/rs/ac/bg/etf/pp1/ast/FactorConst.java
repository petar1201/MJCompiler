// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class FactorConst extends Factor {

    private NumOrCharOrBoolConst NumOrCharOrBoolConst;

    public FactorConst (NumOrCharOrBoolConst NumOrCharOrBoolConst) {
        this.NumOrCharOrBoolConst=NumOrCharOrBoolConst;
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.setParent(this);
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
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorConst(\n");

        if(NumOrCharOrBoolConst!=null)
            buffer.append(NumOrCharOrBoolConst.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorConst]");
        return buffer.toString();
    }
}
