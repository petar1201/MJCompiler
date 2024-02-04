// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class MultipleTypeIdentOptionalBracketsList extends MultipleTypeIdentOptionalBrackets {

    private MultipleTypeIdentOptionalBrackets MultipleTypeIdentOptionalBrackets;
    private TypeIdentOptionalBrackets TypeIdentOptionalBrackets;

    public MultipleTypeIdentOptionalBracketsList (MultipleTypeIdentOptionalBrackets MultipleTypeIdentOptionalBrackets, TypeIdentOptionalBrackets TypeIdentOptionalBrackets) {
        this.MultipleTypeIdentOptionalBrackets=MultipleTypeIdentOptionalBrackets;
        if(MultipleTypeIdentOptionalBrackets!=null) MultipleTypeIdentOptionalBrackets.setParent(this);
        this.TypeIdentOptionalBrackets=TypeIdentOptionalBrackets;
        if(TypeIdentOptionalBrackets!=null) TypeIdentOptionalBrackets.setParent(this);
    }

    public MultipleTypeIdentOptionalBrackets getMultipleTypeIdentOptionalBrackets() {
        return MultipleTypeIdentOptionalBrackets;
    }

    public void setMultipleTypeIdentOptionalBrackets(MultipleTypeIdentOptionalBrackets MultipleTypeIdentOptionalBrackets) {
        this.MultipleTypeIdentOptionalBrackets=MultipleTypeIdentOptionalBrackets;
    }

    public TypeIdentOptionalBrackets getTypeIdentOptionalBrackets() {
        return TypeIdentOptionalBrackets;
    }

    public void setTypeIdentOptionalBrackets(TypeIdentOptionalBrackets TypeIdentOptionalBrackets) {
        this.TypeIdentOptionalBrackets=TypeIdentOptionalBrackets;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleTypeIdentOptionalBrackets!=null) MultipleTypeIdentOptionalBrackets.accept(visitor);
        if(TypeIdentOptionalBrackets!=null) TypeIdentOptionalBrackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleTypeIdentOptionalBrackets!=null) MultipleTypeIdentOptionalBrackets.traverseTopDown(visitor);
        if(TypeIdentOptionalBrackets!=null) TypeIdentOptionalBrackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleTypeIdentOptionalBrackets!=null) MultipleTypeIdentOptionalBrackets.traverseBottomUp(visitor);
        if(TypeIdentOptionalBrackets!=null) TypeIdentOptionalBrackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleTypeIdentOptionalBracketsList(\n");

        if(MultipleTypeIdentOptionalBrackets!=null)
            buffer.append(MultipleTypeIdentOptionalBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(TypeIdentOptionalBrackets!=null)
            buffer.append(TypeIdentOptionalBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleTypeIdentOptionalBracketsList]");
        return buffer.toString();
    }
}
