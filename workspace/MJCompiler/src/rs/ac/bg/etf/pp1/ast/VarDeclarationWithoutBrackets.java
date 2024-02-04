// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarationWithoutBrackets extends VarDecl {

    private VarTypeIdent VarTypeIdent;
    private MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations;

    public VarDeclarationWithoutBrackets (VarTypeIdent VarTypeIdent, MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
        this.VarTypeIdent=VarTypeIdent;
        if(VarTypeIdent!=null) VarTypeIdent.setParent(this);
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.setParent(this);
    }

    public VarTypeIdent getVarTypeIdent() {
        return VarTypeIdent;
    }

    public void setVarTypeIdent(VarTypeIdent VarTypeIdent) {
        this.VarTypeIdent=VarTypeIdent;
    }

    public MultipleVariablesInOneLineDeclarations getMultipleVariablesInOneLineDeclarations() {
        return MultipleVariablesInOneLineDeclarations;
    }

    public void setMultipleVariablesInOneLineDeclarations(MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarTypeIdent!=null) VarTypeIdent.accept(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarTypeIdent!=null) VarTypeIdent.traverseTopDown(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarTypeIdent!=null) VarTypeIdent.traverseBottomUp(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarationWithoutBrackets(\n");

        if(VarTypeIdent!=null)
            buffer.append(VarTypeIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleVariablesInOneLineDeclarations!=null)
            buffer.append(MultipleVariablesInOneLineDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarationWithoutBrackets]");
        return buffer.toString();
    }
}
