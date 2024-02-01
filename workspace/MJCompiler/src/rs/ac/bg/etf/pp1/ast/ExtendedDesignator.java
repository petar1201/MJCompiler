// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class ExtendedDesignator extends Designator {

    private String I1;
    private String I2;
    private DesignatorIdentExprList DesignatorIdentExprList;

    public ExtendedDesignator (String I1, String I2, DesignatorIdentExprList DesignatorIdentExprList) {
        this.I1=I1;
        this.I2=I2;
        this.DesignatorIdentExprList=DesignatorIdentExprList;
        if(DesignatorIdentExprList!=null) DesignatorIdentExprList.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public DesignatorIdentExprList getDesignatorIdentExprList() {
        return DesignatorIdentExprList;
    }

    public void setDesignatorIdentExprList(DesignatorIdentExprList DesignatorIdentExprList) {
        this.DesignatorIdentExprList=DesignatorIdentExprList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorIdentExprList!=null) DesignatorIdentExprList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorIdentExprList!=null) DesignatorIdentExprList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorIdentExprList!=null) DesignatorIdentExprList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExtendedDesignator(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(DesignatorIdentExprList!=null)
            buffer.append(DesignatorIdentExprList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExtendedDesignator]");
        return buffer.toString();
    }
}
