// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class NumOrCharOrBoolConstNumConst extends NumOrCharOrBoolConst {

    public NumOrCharOrBoolConstNumConst () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NumOrCharOrBoolConstNumConst(\n");

        buffer.append(tab);
        buffer.append(") [NumOrCharOrBoolConstNumConst]");
        return buffer.toString();
    }
}
