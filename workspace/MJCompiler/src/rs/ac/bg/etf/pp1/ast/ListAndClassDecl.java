// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class ListAndClassDecl extends ClassOrVarOrConstDeclaration {

    private ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration;
    private ClassDecl ClassDecl;

    public ListAndClassDecl (ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration, ClassDecl ClassDecl) {
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.setParent(this);
        this.ClassDecl=ClassDecl;
        if(ClassDecl!=null) ClassDecl.setParent(this);
    }

    public ClassOrVarOrConstDeclaration getClassOrVarOrConstDeclaration() {
        return ClassOrVarOrConstDeclaration;
    }

    public void setClassOrVarOrConstDeclaration(ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration) {
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
    }

    public ClassDecl getClassDecl() {
        return ClassDecl;
    }

    public void setClassDecl(ClassDecl ClassDecl) {
        this.ClassDecl=ClassDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.accept(visitor);
        if(ClassDecl!=null) ClassDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseTopDown(visitor);
        if(ClassDecl!=null) ClassDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseBottomUp(visitor);
        if(ClassDecl!=null) ClassDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListAndClassDecl(\n");

        if(ClassOrVarOrConstDeclaration!=null)
            buffer.append(ClassOrVarOrConstDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassDecl!=null)
            buffer.append(ClassDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListAndClassDecl]");
        return buffer.toString();
    }
}
