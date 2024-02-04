// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class NamespacesOneAndMultiple extends MultipleNamespace {

    private MultipleNamespace MultipleNamespace;
    private Namespace Namespace;

    public NamespacesOneAndMultiple (MultipleNamespace MultipleNamespace, Namespace Namespace) {
        this.MultipleNamespace=MultipleNamespace;
        if(MultipleNamespace!=null) MultipleNamespace.setParent(this);
        this.Namespace=Namespace;
        if(Namespace!=null) Namespace.setParent(this);
    }

    public MultipleNamespace getMultipleNamespace() {
        return MultipleNamespace;
    }

    public void setMultipleNamespace(MultipleNamespace MultipleNamespace) {
        this.MultipleNamespace=MultipleNamespace;
    }

    public Namespace getNamespace() {
        return Namespace;
    }

    public void setNamespace(Namespace Namespace) {
        this.Namespace=Namespace;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleNamespace!=null) MultipleNamespace.accept(visitor);
        if(Namespace!=null) Namespace.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleNamespace!=null) MultipleNamespace.traverseTopDown(visitor);
        if(Namespace!=null) Namespace.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleNamespace!=null) MultipleNamespace.traverseBottomUp(visitor);
        if(Namespace!=null) Namespace.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NamespacesOneAndMultiple(\n");

        if(MultipleNamespace!=null)
            buffer.append(MultipleNamespace.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Namespace!=null)
            buffer.append(Namespace.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NamespacesOneAndMultiple]");
        return buffer.toString();
    }
}
