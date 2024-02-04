// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class MultipleVarDeclarationsList extends MultipleVarDeclarations {

    private MultipleVarDeclarations MultipleVarDeclarations;
    private VarDecl VarDecl;

    public MultipleVarDeclarationsList (MultipleVarDeclarations MultipleVarDeclarations, VarDecl VarDecl) {
        this.MultipleVarDeclarations=MultipleVarDeclarations;
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.setParent(this);
        this.VarDecl=VarDecl;
        if(VarDecl!=null) VarDecl.setParent(this);
    }

    public MultipleVarDeclarations getMultipleVarDeclarations() {
        return MultipleVarDeclarations;
    }

    public void setMultipleVarDeclarations(MultipleVarDeclarations MultipleVarDeclarations) {
        this.MultipleVarDeclarations=MultipleVarDeclarations;
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
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.accept(visitor);
        if(VarDecl!=null) VarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.traverseTopDown(visitor);
        if(VarDecl!=null) VarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.traverseBottomUp(visitor);
        if(VarDecl!=null) VarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleVarDeclarationsList(\n");

        if(MultipleVarDeclarations!=null)
            buffer.append(MultipleVarDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDecl!=null)
            buffer.append(VarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleVarDeclarationsList]");
        return buffer.toString();
    }
}
