// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class MultipleVariablesInOneLineDeclarationsNoBrackets extends MultipleVariablesInOneLineDeclarations {

    private MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations;
    private CommaIdent CommaIdent;

    public MultipleVariablesInOneLineDeclarationsNoBrackets (MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations, CommaIdent CommaIdent) {
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.setParent(this);
        this.CommaIdent=CommaIdent;
        if(CommaIdent!=null) CommaIdent.setParent(this);
    }

    public MultipleVariablesInOneLineDeclarations getMultipleVariablesInOneLineDeclarations() {
        return MultipleVariablesInOneLineDeclarations;
    }

    public void setMultipleVariablesInOneLineDeclarations(MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
    }

    public CommaIdent getCommaIdent() {
        return CommaIdent;
    }

    public void setCommaIdent(CommaIdent CommaIdent) {
        this.CommaIdent=CommaIdent;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.accept(visitor);
        if(CommaIdent!=null) CommaIdent.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseTopDown(visitor);
        if(CommaIdent!=null) CommaIdent.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseBottomUp(visitor);
        if(CommaIdent!=null) CommaIdent.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleVariablesInOneLineDeclarationsNoBrackets(\n");

        if(MultipleVariablesInOneLineDeclarations!=null)
            buffer.append(MultipleVariablesInOneLineDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CommaIdent!=null)
            buffer.append(CommaIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleVariablesInOneLineDeclarationsNoBrackets]");
        return buffer.toString();
    }
}
