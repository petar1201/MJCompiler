// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class MatchedForLoopCondFact extends Matched {

    private MultipleDesignatorStatements MultipleDesignatorStatements;
    private CondFact CondFact;
    private MultipleDesignatorStatements MultipleDesignatorStatements1;
    private Matched Matched;

    public MatchedForLoopCondFact (MultipleDesignatorStatements MultipleDesignatorStatements, CondFact CondFact, MultipleDesignatorStatements MultipleDesignatorStatements1, Matched Matched) {
        this.MultipleDesignatorStatements=MultipleDesignatorStatements;
        if(MultipleDesignatorStatements!=null) MultipleDesignatorStatements.setParent(this);
        this.CondFact=CondFact;
        if(CondFact!=null) CondFact.setParent(this);
        this.MultipleDesignatorStatements1=MultipleDesignatorStatements1;
        if(MultipleDesignatorStatements1!=null) MultipleDesignatorStatements1.setParent(this);
        this.Matched=Matched;
        if(Matched!=null) Matched.setParent(this);
    }

    public MultipleDesignatorStatements getMultipleDesignatorStatements() {
        return MultipleDesignatorStatements;
    }

    public void setMultipleDesignatorStatements(MultipleDesignatorStatements MultipleDesignatorStatements) {
        this.MultipleDesignatorStatements=MultipleDesignatorStatements;
    }

    public CondFact getCondFact() {
        return CondFact;
    }

    public void setCondFact(CondFact CondFact) {
        this.CondFact=CondFact;
    }

    public MultipleDesignatorStatements getMultipleDesignatorStatements1() {
        return MultipleDesignatorStatements1;
    }

    public void setMultipleDesignatorStatements1(MultipleDesignatorStatements MultipleDesignatorStatements1) {
        this.MultipleDesignatorStatements1=MultipleDesignatorStatements1;
    }

    public Matched getMatched() {
        return Matched;
    }

    public void setMatched(Matched Matched) {
        this.Matched=Matched;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDesignatorStatements!=null) MultipleDesignatorStatements.accept(visitor);
        if(CondFact!=null) CondFact.accept(visitor);
        if(MultipleDesignatorStatements1!=null) MultipleDesignatorStatements1.accept(visitor);
        if(Matched!=null) Matched.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDesignatorStatements!=null) MultipleDesignatorStatements.traverseTopDown(visitor);
        if(CondFact!=null) CondFact.traverseTopDown(visitor);
        if(MultipleDesignatorStatements1!=null) MultipleDesignatorStatements1.traverseTopDown(visitor);
        if(Matched!=null) Matched.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDesignatorStatements!=null) MultipleDesignatorStatements.traverseBottomUp(visitor);
        if(CondFact!=null) CondFact.traverseBottomUp(visitor);
        if(MultipleDesignatorStatements1!=null) MultipleDesignatorStatements1.traverseBottomUp(visitor);
        if(Matched!=null) Matched.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchedForLoopCondFact(\n");

        if(MultipleDesignatorStatements!=null)
            buffer.append(MultipleDesignatorStatements.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CondFact!=null)
            buffer.append(CondFact.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleDesignatorStatements1!=null)
            buffer.append(MultipleDesignatorStatements1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Matched!=null)
            buffer.append(Matched.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchedForLoopCondFact]");
        return buffer.toString();
    }
}
