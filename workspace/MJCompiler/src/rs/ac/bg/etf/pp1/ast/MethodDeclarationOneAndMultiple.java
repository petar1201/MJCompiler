// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclarationOneAndMultiple extends MultipleMethodDeclaration {

    private MultipleMethodDeclaration MultipleMethodDeclaration;
    private MethodDecl MethodDecl;

    public MethodDeclarationOneAndMultiple (MultipleMethodDeclaration MultipleMethodDeclaration, MethodDecl MethodDecl) {
        this.MultipleMethodDeclaration=MultipleMethodDeclaration;
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.setParent(this);
        this.MethodDecl=MethodDecl;
        if(MethodDecl!=null) MethodDecl.setParent(this);
    }

    public MultipleMethodDeclaration getMultipleMethodDeclaration() {
        return MultipleMethodDeclaration;
    }

    public void setMultipleMethodDeclaration(MultipleMethodDeclaration MultipleMethodDeclaration) {
        this.MultipleMethodDeclaration=MultipleMethodDeclaration;
    }

    public MethodDecl getMethodDecl() {
        return MethodDecl;
    }

    public void setMethodDecl(MethodDecl MethodDecl) {
        this.MethodDecl=MethodDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.accept(visitor);
        if(MethodDecl!=null) MethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.traverseTopDown(visitor);
        if(MethodDecl!=null) MethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.traverseBottomUp(visitor);
        if(MethodDecl!=null) MethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclarationOneAndMultiple(\n");

        if(MultipleMethodDeclaration!=null)
            buffer.append(MultipleMethodDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDecl!=null)
            buffer.append(MethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclarationOneAndMultiple]");
        return buffer.toString();
    }
}
