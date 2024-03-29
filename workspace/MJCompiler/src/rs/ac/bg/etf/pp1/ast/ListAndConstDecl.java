// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class ListAndConstDecl extends ClassOrVarOrConstDeclaration {

    private ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration;
    private ConstDecl ConstDecl;

    public ListAndConstDecl (ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration, ConstDecl ConstDecl) {
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.setParent(this);
        this.ConstDecl=ConstDecl;
        if(ConstDecl!=null) ConstDecl.setParent(this);
    }

    public ClassOrVarOrConstDeclaration getClassOrVarOrConstDeclaration() {
        return ClassOrVarOrConstDeclaration;
    }

    public void setClassOrVarOrConstDeclaration(ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration) {
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
    }

    public ConstDecl getConstDecl() {
        return ConstDecl;
    }

    public void setConstDecl(ConstDecl ConstDecl) {
        this.ConstDecl=ConstDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.accept(visitor);
        if(ConstDecl!=null) ConstDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseTopDown(visitor);
        if(ConstDecl!=null) ConstDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseBottomUp(visitor);
        if(ConstDecl!=null) ConstDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListAndConstDecl(\n");

        if(ClassOrVarOrConstDeclaration!=null)
            buffer.append(ClassOrVarOrConstDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDecl!=null)
            buffer.append(ConstDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListAndConstDecl]");
        return buffer.toString();
    }
}
