// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class MultipleConstVariablesInOneLineDeclarationsList extends MultipleConstVariablesInOneLineDeclarations {

    private CommaIdent CommaIdent;
    private NumOrCharOrBoolConst NumOrCharOrBoolConst;
    private MultipleConstVariablesInOneLineDeclarations MultipleConstVariablesInOneLineDeclarations;

    public MultipleConstVariablesInOneLineDeclarationsList (CommaIdent CommaIdent, NumOrCharOrBoolConst NumOrCharOrBoolConst, MultipleConstVariablesInOneLineDeclarations MultipleConstVariablesInOneLineDeclarations) {
        this.CommaIdent=CommaIdent;
        if(CommaIdent!=null) CommaIdent.setParent(this);
        this.NumOrCharOrBoolConst=NumOrCharOrBoolConst;
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.setParent(this);
        this.MultipleConstVariablesInOneLineDeclarations=MultipleConstVariablesInOneLineDeclarations;
        if(MultipleConstVariablesInOneLineDeclarations!=null) MultipleConstVariablesInOneLineDeclarations.setParent(this);
    }

    public CommaIdent getCommaIdent() {
        return CommaIdent;
    }

    public void setCommaIdent(CommaIdent CommaIdent) {
        this.CommaIdent=CommaIdent;
    }

    public NumOrCharOrBoolConst getNumOrCharOrBoolConst() {
        return NumOrCharOrBoolConst;
    }

    public void setNumOrCharOrBoolConst(NumOrCharOrBoolConst NumOrCharOrBoolConst) {
        this.NumOrCharOrBoolConst=NumOrCharOrBoolConst;
    }

    public MultipleConstVariablesInOneLineDeclarations getMultipleConstVariablesInOneLineDeclarations() {
        return MultipleConstVariablesInOneLineDeclarations;
    }

    public void setMultipleConstVariablesInOneLineDeclarations(MultipleConstVariablesInOneLineDeclarations MultipleConstVariablesInOneLineDeclarations) {
        this.MultipleConstVariablesInOneLineDeclarations=MultipleConstVariablesInOneLineDeclarations;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CommaIdent!=null) CommaIdent.accept(visitor);
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.accept(visitor);
        if(MultipleConstVariablesInOneLineDeclarations!=null) MultipleConstVariablesInOneLineDeclarations.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CommaIdent!=null) CommaIdent.traverseTopDown(visitor);
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.traverseTopDown(visitor);
        if(MultipleConstVariablesInOneLineDeclarations!=null) MultipleConstVariablesInOneLineDeclarations.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CommaIdent!=null) CommaIdent.traverseBottomUp(visitor);
        if(NumOrCharOrBoolConst!=null) NumOrCharOrBoolConst.traverseBottomUp(visitor);
        if(MultipleConstVariablesInOneLineDeclarations!=null) MultipleConstVariablesInOneLineDeclarations.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleConstVariablesInOneLineDeclarationsList(\n");

        if(CommaIdent!=null)
            buffer.append(CommaIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(NumOrCharOrBoolConst!=null)
            buffer.append(NumOrCharOrBoolConst.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleConstVariablesInOneLineDeclarations!=null)
            buffer.append(MultipleConstVariablesInOneLineDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleConstVariablesInOneLineDeclarationsList]");
        return buffer.toString();
    }
}
