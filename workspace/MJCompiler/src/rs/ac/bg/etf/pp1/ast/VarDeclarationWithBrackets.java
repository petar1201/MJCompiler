// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarationWithBrackets extends VarDecl {

    private VarrArrTypeIdent VarrArrTypeIdent;
    private MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations;

    public VarDeclarationWithBrackets (VarrArrTypeIdent VarrArrTypeIdent, MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
        this.VarrArrTypeIdent=VarrArrTypeIdent;
        if(VarrArrTypeIdent!=null) VarrArrTypeIdent.setParent(this);
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.setParent(this);
    }

    public VarrArrTypeIdent getVarrArrTypeIdent() {
        return VarrArrTypeIdent;
    }

    public void setVarrArrTypeIdent(VarrArrTypeIdent VarrArrTypeIdent) {
        this.VarrArrTypeIdent=VarrArrTypeIdent;
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
        if(VarrArrTypeIdent!=null) VarrArrTypeIdent.accept(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarrArrTypeIdent!=null) VarrArrTypeIdent.traverseTopDown(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarrArrTypeIdent!=null) VarrArrTypeIdent.traverseBottomUp(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarationWithBrackets(\n");

        if(VarrArrTypeIdent!=null)
            buffer.append(VarrArrTypeIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleVariablesInOneLineDeclarations!=null)
            buffer.append(MultipleVariablesInOneLineDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarationWithBrackets]");
        return buffer.toString();
    }
}
