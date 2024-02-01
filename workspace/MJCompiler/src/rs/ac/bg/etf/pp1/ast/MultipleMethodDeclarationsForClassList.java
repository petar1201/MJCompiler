// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class MultipleMethodDeclarationsForClassList extends MultipleMethodDeclarationsForClass {

    private MultipleMethodDeclaration MultipleMethodDeclaration;

    public MultipleMethodDeclarationsForClassList (MultipleMethodDeclaration MultipleMethodDeclaration) {
        this.MultipleMethodDeclaration=MultipleMethodDeclaration;
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.setParent(this);
    }

    public MultipleMethodDeclaration getMultipleMethodDeclaration() {
        return MultipleMethodDeclaration;
    }

    public void setMultipleMethodDeclaration(MultipleMethodDeclaration MultipleMethodDeclaration) {
        this.MultipleMethodDeclaration=MultipleMethodDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleMethodDeclarationsForClassList(\n");

        if(MultipleMethodDeclaration!=null)
            buffer.append(MultipleMethodDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleMethodDeclarationsForClassList]");
        return buffer.toString();
    }
}
