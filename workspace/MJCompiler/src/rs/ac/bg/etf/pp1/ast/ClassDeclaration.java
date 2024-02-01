// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclaration extends ClassDecl {

    private String I1;
    private ExtendableClass ExtendableClass;
    private StaticVarDeclarations StaticVarDeclarations;
    private MultipleStaticInitializers MultipleStaticInitializers;
    private MultipleVarDeclarations MultipleVarDeclarations;
    private MultipleMethodDeclarationsForClass MultipleMethodDeclarationsForClass;

    public ClassDeclaration (String I1, ExtendableClass ExtendableClass, StaticVarDeclarations StaticVarDeclarations, MultipleStaticInitializers MultipleStaticInitializers, MultipleVarDeclarations MultipleVarDeclarations, MultipleMethodDeclarationsForClass MultipleMethodDeclarationsForClass) {
        this.I1=I1;
        this.ExtendableClass=ExtendableClass;
        if(ExtendableClass!=null) ExtendableClass.setParent(this);
        this.StaticVarDeclarations=StaticVarDeclarations;
        if(StaticVarDeclarations!=null) StaticVarDeclarations.setParent(this);
        this.MultipleStaticInitializers=MultipleStaticInitializers;
        if(MultipleStaticInitializers!=null) MultipleStaticInitializers.setParent(this);
        this.MultipleVarDeclarations=MultipleVarDeclarations;
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.setParent(this);
        this.MultipleMethodDeclarationsForClass=MultipleMethodDeclarationsForClass;
        if(MultipleMethodDeclarationsForClass!=null) MultipleMethodDeclarationsForClass.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public ExtendableClass getExtendableClass() {
        return ExtendableClass;
    }

    public void setExtendableClass(ExtendableClass ExtendableClass) {
        this.ExtendableClass=ExtendableClass;
    }

    public StaticVarDeclarations getStaticVarDeclarations() {
        return StaticVarDeclarations;
    }

    public void setStaticVarDeclarations(StaticVarDeclarations StaticVarDeclarations) {
        this.StaticVarDeclarations=StaticVarDeclarations;
    }

    public MultipleStaticInitializers getMultipleStaticInitializers() {
        return MultipleStaticInitializers;
    }

    public void setMultipleStaticInitializers(MultipleStaticInitializers MultipleStaticInitializers) {
        this.MultipleStaticInitializers=MultipleStaticInitializers;
    }

    public MultipleVarDeclarations getMultipleVarDeclarations() {
        return MultipleVarDeclarations;
    }

    public void setMultipleVarDeclarations(MultipleVarDeclarations MultipleVarDeclarations) {
        this.MultipleVarDeclarations=MultipleVarDeclarations;
    }

    public MultipleMethodDeclarationsForClass getMultipleMethodDeclarationsForClass() {
        return MultipleMethodDeclarationsForClass;
    }

    public void setMultipleMethodDeclarationsForClass(MultipleMethodDeclarationsForClass MultipleMethodDeclarationsForClass) {
        this.MultipleMethodDeclarationsForClass=MultipleMethodDeclarationsForClass;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExtendableClass!=null) ExtendableClass.accept(visitor);
        if(StaticVarDeclarations!=null) StaticVarDeclarations.accept(visitor);
        if(MultipleStaticInitializers!=null) MultipleStaticInitializers.accept(visitor);
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.accept(visitor);
        if(MultipleMethodDeclarationsForClass!=null) MultipleMethodDeclarationsForClass.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExtendableClass!=null) ExtendableClass.traverseTopDown(visitor);
        if(StaticVarDeclarations!=null) StaticVarDeclarations.traverseTopDown(visitor);
        if(MultipleStaticInitializers!=null) MultipleStaticInitializers.traverseTopDown(visitor);
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.traverseTopDown(visitor);
        if(MultipleMethodDeclarationsForClass!=null) MultipleMethodDeclarationsForClass.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExtendableClass!=null) ExtendableClass.traverseBottomUp(visitor);
        if(StaticVarDeclarations!=null) StaticVarDeclarations.traverseBottomUp(visitor);
        if(MultipleStaticInitializers!=null) MultipleStaticInitializers.traverseBottomUp(visitor);
        if(MultipleVarDeclarations!=null) MultipleVarDeclarations.traverseBottomUp(visitor);
        if(MultipleMethodDeclarationsForClass!=null) MultipleMethodDeclarationsForClass.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclaration(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(ExtendableClass!=null)
            buffer.append(ExtendableClass.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StaticVarDeclarations!=null)
            buffer.append(StaticVarDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleStaticInitializers!=null)
            buffer.append(MultipleStaticInitializers.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleVarDeclarations!=null)
            buffer.append(MultipleVarDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleMethodDeclarationsForClass!=null)
            buffer.append(MultipleMethodDeclarationsForClass.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclaration]");
        return buffer.toString();
    }
}
