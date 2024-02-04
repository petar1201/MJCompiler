// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class Program implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private ProgramName ProgramName;
    private MultipleNamespace MultipleNamespace;
    private ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration;
    private MultipleMethodDeclaration MultipleMethodDeclaration;

    public Program (ProgramName ProgramName, MultipleNamespace MultipleNamespace, ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration, MultipleMethodDeclaration MultipleMethodDeclaration) {
        this.ProgramName=ProgramName;
        if(ProgramName!=null) ProgramName.setParent(this);
        this.MultipleNamespace=MultipleNamespace;
        if(MultipleNamespace!=null) MultipleNamespace.setParent(this);
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.setParent(this);
        this.MultipleMethodDeclaration=MultipleMethodDeclaration;
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.setParent(this);
    }

    public ProgramName getProgramName() {
        return ProgramName;
    }

    public void setProgramName(ProgramName ProgramName) {
        this.ProgramName=ProgramName;
    }

    public MultipleNamespace getMultipleNamespace() {
        return MultipleNamespace;
    }

    public void setMultipleNamespace(MultipleNamespace MultipleNamespace) {
        this.MultipleNamespace=MultipleNamespace;
    }

    public ClassOrVarOrConstDeclaration getClassOrVarOrConstDeclaration() {
        return ClassOrVarOrConstDeclaration;
    }

    public void setClassOrVarOrConstDeclaration(ClassOrVarOrConstDeclaration ClassOrVarOrConstDeclaration) {
        this.ClassOrVarOrConstDeclaration=ClassOrVarOrConstDeclaration;
    }

    public MultipleMethodDeclaration getMultipleMethodDeclaration() {
        return MultipleMethodDeclaration;
    }

    public void setMultipleMethodDeclaration(MultipleMethodDeclaration MultipleMethodDeclaration) {
        this.MultipleMethodDeclaration=MultipleMethodDeclaration;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ProgramName!=null) ProgramName.accept(visitor);
        if(MultipleNamespace!=null) MultipleNamespace.accept(visitor);
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.accept(visitor);
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ProgramName!=null) ProgramName.traverseTopDown(visitor);
        if(MultipleNamespace!=null) MultipleNamespace.traverseTopDown(visitor);
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseTopDown(visitor);
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ProgramName!=null) ProgramName.traverseBottomUp(visitor);
        if(MultipleNamespace!=null) MultipleNamespace.traverseBottomUp(visitor);
        if(ClassOrVarOrConstDeclaration!=null) ClassOrVarOrConstDeclaration.traverseBottomUp(visitor);
        if(MultipleMethodDeclaration!=null) MultipleMethodDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Program(\n");

        if(ProgramName!=null)
            buffer.append(ProgramName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleNamespace!=null)
            buffer.append(MultipleNamespace.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassOrVarOrConstDeclaration!=null)
            buffer.append(ClassOrVarOrConstDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleMethodDeclaration!=null)
            buffer.append(MultipleMethodDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Program]");
        return buffer.toString();
    }
}
