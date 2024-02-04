// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class MultipleVariablesInOneLineDeclarationsBrackets extends MultipleVariablesInOneLineDeclarations {

    private MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations;
    private CommaIdentLbracketRbracket CommaIdentLbracketRbracket;

    public MultipleVariablesInOneLineDeclarationsBrackets (MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations, CommaIdentLbracketRbracket CommaIdentLbracketRbracket) {
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.setParent(this);
        this.CommaIdentLbracketRbracket=CommaIdentLbracketRbracket;
        if(CommaIdentLbracketRbracket!=null) CommaIdentLbracketRbracket.setParent(this);
    }

    public MultipleVariablesInOneLineDeclarations getMultipleVariablesInOneLineDeclarations() {
        return MultipleVariablesInOneLineDeclarations;
    }

    public void setMultipleVariablesInOneLineDeclarations(MultipleVariablesInOneLineDeclarations MultipleVariablesInOneLineDeclarations) {
        this.MultipleVariablesInOneLineDeclarations=MultipleVariablesInOneLineDeclarations;
    }

    public CommaIdentLbracketRbracket getCommaIdentLbracketRbracket() {
        return CommaIdentLbracketRbracket;
    }

    public void setCommaIdentLbracketRbracket(CommaIdentLbracketRbracket CommaIdentLbracketRbracket) {
        this.CommaIdentLbracketRbracket=CommaIdentLbracketRbracket;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.accept(visitor);
        if(CommaIdentLbracketRbracket!=null) CommaIdentLbracketRbracket.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseTopDown(visitor);
        if(CommaIdentLbracketRbracket!=null) CommaIdentLbracketRbracket.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleVariablesInOneLineDeclarations!=null) MultipleVariablesInOneLineDeclarations.traverseBottomUp(visitor);
        if(CommaIdentLbracketRbracket!=null) CommaIdentLbracketRbracket.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleVariablesInOneLineDeclarationsBrackets(\n");

        if(MultipleVariablesInOneLineDeclarations!=null)
            buffer.append(MultipleVariablesInOneLineDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CommaIdentLbracketRbracket!=null)
            buffer.append(CommaIdentLbracketRbracket.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleVariablesInOneLineDeclarationsBrackets]");
        return buffer.toString();
    }
}
