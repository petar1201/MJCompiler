// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class ListAndVarDecl extends ClassOrVarOrConstDeclaration {

    private ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration;
    private VarDecl VarDecl;

    public ListAndVarDecl (ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration, VarDecl VarDecl) {
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.setParent(this);
        this.VarDecl=VarDecl;
        if(VarDecl!=null) VarDecl.setParent(this);
    }

    public ClassOrVarOrConstDeclaration getClassOrVarOrConstDeclaration() {
        return ClassOrVarOrConstDeclaration;
    }

    public void setClassOrVarOrConstDeclaration(ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration) {
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
    }

    public VarDecl getVarDecl() {
        return VarDecl;
    }

    public void setVarDecl(VarDecl VarDecl) {
        this.VarDecl=VarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.accept(visitor);
        if(VarDecl!=null) VarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseTopDown(visitor);
        if(VarDecl!=null) VarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseBottomUp(visitor);
        if(VarDecl!=null) VarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListAndVarDecl(\n");

        if(ClassOrVarOrConstDeclaration!=null)
            buffer.append(ClassOrVarOrConstDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDecl!=null)
            buffer.append(VarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListAndVarDecl]");
        return buffer.toString();
    }
}
