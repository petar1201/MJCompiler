// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class Namespace implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String I1;
    private ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration;
    private MultipleMethodDeclaration MultipleMethodDeclaration;

    public Namespace (String I1, ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration, MultipleMethodDeclaration MultipleMethodDeclaration) {
        this.I1=I1;
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.setParent(this);
        this.MultipleMethodDeclaration=MultipleMethodDeclaration;
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public ClassOrVarOrConstDeclaration getClassOrVarOrConstDeclaration() {
        return ClassOrVarOrConstDeclaration;
    }

    public void setClassOrVarOrConstDeclaration(ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration) {
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
    }

    public MultipleMethodDeclaration getMultipleMethodDeclaration() {
        return MultipleMethodDeclaration;
    }

    public void setMultipleMethodDeclaration(MultipleMethodDeclaration MultipleMethodDeclaration) {
        this.MultipleMethodDeclaration=MultipleMethodDeclaration;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.accept(visitor);
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseTopDown(visitor);
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseBottomUp(visitor);
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Namespace(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(ClassOrVarOrConstDeclaration!=null)
            buffer.append(ClassOrVarOrConstDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleMethodDeclaration!=null)
            buffer.append(MultipleMethodDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Namespace]");
        return buffer.toString();
    }
}
