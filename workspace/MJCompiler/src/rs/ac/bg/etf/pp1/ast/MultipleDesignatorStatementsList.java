// generated with ast extension for cup
// version 0.8
// 4/1/2024 0:22:44


package rs.ac.bg.etf.pp1.ast;

public class MultipleDesignatorStatementsList extends MultipleDesignatorStatements {

    private MultipleDesignatorStatements MultipleDesignatorStatements;
    private DesignatorStatement DesignatorStatement;

    public MultipleDesignatorStatementsList (MultipleDesignatorStatements MultipleDesignatorStatements, DesignatorStatement DesignatorStatement) {
        this.MultipleDesignatorStatements=MultipleDesignatorStatements;
        if(MultipleDesignatorStatements!=null) MultipleDesignatorStatements.setParent(this);
        this.DesignatorStatement=DesignatorStatement;
        if(DesignatorStatement!=null) DesignatorStatement.setParent(this);
    }

    public MultipleDesignatorStatements getMultipleDesignatorStatements() {
        return MultipleDesignatorStatements;
    }

    public void setMultipleDesignatorStatements(MultipleDesignatorStatements MultipleDesignatorStatements) {
        this.MultipleDesignatorStatements=MultipleDesignatorStatements;
    }

    public DesignatorStatement getDesignatorStatement() {
        return DesignatorStatement;
    }

    public void setDesignatorStatement(DesignatorStatement DesignatorStatement) {
        this.DesignatorStatement=DesignatorStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDesignatorStatements!=null) MultipleDesignatorStatements.accept(visitor);
        if(DesignatorStatement!=null) DesignatorStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDesignatorStatements!=null) MultipleDesignatorStatements.traverseTopDown(visitor);
        if(DesignatorStatement!=null) DesignatorStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDesignatorStatements!=null) MultipleDesignatorStatements.traverseBottomUp(visitor);
        if(DesignatorStatement!=null) DesignatorStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleDesignatorStatementsList(\n");

        if(MultipleDesignatorStatements!=null)
            buffer.append(MultipleDesignatorStatements.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorStatement!=null)
            buffer.append(DesignatorStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleDesignatorStatementsList]");
        return buffer.toString();
    }
}
