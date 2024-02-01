// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class DesignatorIdentExprListIdent extends DesignatorIdentExprList {

    private DesignatorIdentExprList DesignatorIdentExprList;
    private String I2;

    public DesignatorIdentExprListIdent (DesignatorIdentExprList DesignatorIdentExprList, String I2) {
        this.DesignatorIdentExprList=DesignatorIdentExprList;
        if(DesignatorIdentExprList!=null) DesignatorIdentExprList.setParent(this);
        this.I2=I2;
    }

    public DesignatorIdentExprList getDesignatorIdentExprList() {
        return DesignatorIdentExprList;
    }

    public void setDesignatorIdentExprList(DesignatorIdentExprList DesignatorIdentExprList) {
        this.DesignatorIdentExprList=DesignatorIdentExprList;
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
        buffer.append("DesignatorIdentExprListIdent(\n");

        if(DesignatorIdentExprList!=null)
            buffer.append(DesignatorIdentExprList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorIdentExprListIdent]");
        return buffer.toString();
    }
}
