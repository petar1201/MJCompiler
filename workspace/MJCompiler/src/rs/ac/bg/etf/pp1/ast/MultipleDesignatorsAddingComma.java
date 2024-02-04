// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class MultipleDesignatorsAddingComma extends MultipleDesignators {

    private MultipleDesignators MultipleDesignators;

    public MultipleDesignatorsAddingComma (MultipleDesignators MultipleDesignators) {
        this.MultipleDesignators=MultipleDesignators;
        if(MultipleDesignators!=null) MultipleDesignators.setParent(this);
    }

    public MultipleDesignators getMultipleDesignators() {
        return MultipleDesignators;
    }

    public void setMultipleDesignators(MultipleDesignators MultipleDesignators) {
        this.MultipleDesignators=MultipleDesignators;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDesignators!=null) MultipleDesignators.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDesignators!=null) MultipleDesignators.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDesignators!=null) MultipleDesignators.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleDesignatorsAddingComma(\n");

        if(MultipleDesignators!=null)
            buffer.append(MultipleDesignators.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleDesignatorsAddingComma]");
        return buffer.toString();
    }
}
