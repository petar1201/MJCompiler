// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class StaticVarDeclarationsList extends StaticVarDeclarations {

    private StaticVarDeclarations StaticVarDeclarations;
    private VarDecl VarDecl;

    public StaticVarDeclarationsList (StaticVarDeclarations StaticVarDeclarations, VarDecl VarDecl) {
        this.StaticVarDeclarations=StaticVarDeclarations;
        if(StaticVarDeclarations!=null) StaticVarDeclarations.setParent(this);
        this.VarDecl=VarDecl;
        if(VarDecl!=null) VarDecl.setParent(this);
    }

    public StaticVarDeclarations getStaticVarDeclarations() {
        return StaticVarDeclarations;
    }

    public void setStaticVarDeclarations(StaticVarDeclarations StaticVarDeclarations) {
        this.StaticVarDeclarations=StaticVarDeclarations;
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
        if(StaticVarDeclarations!=null) StaticVarDeclarations.accept(visitor);
        if(VarDecl!=null) VarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(StaticVarDeclarations!=null) StaticVarDeclarations.traverseTopDown(visitor);
        if(VarDecl!=null) VarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(StaticVarDeclarations!=null) StaticVarDeclarations.traverseBottomUp(visitor);
        if(VarDecl!=null) VarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StaticVarDeclarationsList(\n");

        if(StaticVarDeclarations!=null)
            buffer.append(StaticVarDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDecl!=null)
            buffer.append(VarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StaticVarDeclarationsList]");
        return buffer.toString();
    }
}
