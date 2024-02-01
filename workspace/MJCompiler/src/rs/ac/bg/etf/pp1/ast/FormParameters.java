// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class FormParameters extends FormPars {

    private TypeIdentOptionalBrackets TypeIdentOptionalBrackets;
    private MultipleTypeIdentOptionalBrackets MultipleTypeIdentOptionalBrackets;

    public FormParameters (TypeIdentOptionalBrackets TypeIdentOptionalBrackets, MultipleTypeIdentOptionalBrackets MultipleTypeIdentOptionalBrackets) {
        this.TypeIdentOptionalBrackets=TypeIdentOptionalBrackets;
        if(TypeIdentOptionalBrackets!=null) TypeIdentOptionalBrackets.setParent(this);
        this.MultipleTypeIdentOptionalBrackets=MultipleTypeIdentOptionalBrackets;
        if(MultipleTypeIdentOptionalBrackets!=null) MultipleTypeIdentOptionalBrackets.setParent(this);
    }

    public TypeIdentOptionalBrackets getTypeIdentOptionalBrackets() {
        return TypeIdentOptionalBrackets;
    }

    public void setTypeIdentOptionalBrackets(TypeIdentOptionalBrackets TypeIdentOptionalBrackets) {
        this.TypeIdentOptionalBrackets=TypeIdentOptionalBrackets;
    }

    public MultipleTypeIdentOptionalBrackets getMultipleTypeIdentOptionalBrackets() {
        return MultipleTypeIdentOptionalBrackets;
    }

    public void setMultipleTypeIdentOptionalBrackets(MultipleTypeIdentOptionalBrackets MultipleTypeIdentOptionalBrackets) {
        this.MultipleTypeIdentOptionalBrackets=MultipleTypeIdentOptionalBrackets;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(TypeIdentOptionalBrackets!=null) TypeIdentOptionalBrackets.accept(visitor);
        if(MultipleTypeIdentOptionalBrackets!=null) MultipleTypeIdentOptionalBrackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TypeIdentOptionalBrackets!=null) TypeIdentOptionalBrackets.traverseTopDown(visitor);
        if(MultipleTypeIdentOptionalBrackets!=null) MultipleTypeIdentOptionalBrackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TypeIdentOptionalBrackets!=null) TypeIdentOptionalBrackets.traverseBottomUp(visitor);
        if(MultipleTypeIdentOptionalBrackets!=null) MultipleTypeIdentOptionalBrackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParameters(\n");

        if(TypeIdentOptionalBrackets!=null)
            buffer.append(TypeIdentOptionalBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleTypeIdentOptionalBrackets!=null)
            buffer.append(MultipleTypeIdentOptionalBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParameters]");
        return buffer.toString();
    }
}
