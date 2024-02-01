// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class TypeMethodDeclarationFormPars extends MethodDecl {

    private Type Type;
    private String I2;
    private FormPars FormPars;
    private MultipleVarDeclarations MultipleVarDeclarations;
    private MultipleStatements MultipleStatements;

    public TypeMethodDeclarationFormPars (Type Type, String I2, FormPars FormPars, MultipleVarDeclarations MultipleVarDeclarations, MultipleStatements MultipleStatements) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.I2=I2;
        this.FormPars=FormPars;
        if(FormPars!=null) FormPars.setParent(this);
        this.MultipleVarDeclarations=MultipleVarDeclarations;
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.setParent(this);
        this.MultipleStatements=MultipleStatements;
        if(MultipleStatements!=null) MultipleStatements.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public FormPars getFormPars() {
        return FormPars;
    }

    public void setFormPars(FormPars FormPars) {
        this.FormPars=FormPars;
    }

    public MultipleVarDeclarations getMultipleVarDeclarations() {
        return MultipleVarDeclarations;
    }

    public void setMultipleVarDeclarations(MultipleVarDeclarations MultipleVarDeclarations) {
        this.MultipleVarDeclarations=MultipleVarDeclarations;
    }

    public MultipleStatements getMultipleStatements() {
        return MultipleStatements;
    }

    public void setMultipleStatements(MultipleStatements MultipleStatements) {
        this.MultipleStatements=MultipleStatements;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(FormPars!=null) FormPars.accept(visitor);
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.accept(visitor);
        if(MultipleStatements!=null) MultipleStatements.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(FormPars!=null) FormPars.traverseTopDown(visitor);
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.traverseTopDown(visitor);
        if(MultipleStatements!=null) MultipleStatements.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(FormPars!=null) FormPars.traverseBottomUp(visitor);
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.traverseBottomUp(visitor);
        if(MultipleStatements!=null) MultipleStatements.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("TypeMethodDeclarationFormPars(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(FormPars!=null)
            buffer.append(FormPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleVarDeclarations!=null)
            buffer.append(MultipleVarDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleStatements!=null)
            buffer.append(MultipleStatements.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TypeMethodDeclarationFormPars]");
        return buffer.toString();
    }
}
