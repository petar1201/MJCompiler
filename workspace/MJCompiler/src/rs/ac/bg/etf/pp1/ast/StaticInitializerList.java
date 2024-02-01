// generated with ast extension for cup
// version 0.8
// 21/0/2024 23:40:4


package rs.ac.bg.etf.pp1.ast;

public class StaticInitializerList extends MultipleStaticInitializers {

    private StaticInitializer StaticInitializer;
    private MultipleStaticInitializers MultipleStaticInitializers;

    public StaticInitializerList (StaticInitializer StaticInitializer, MultipleStaticInitializers MultipleStaticInitializers) {
        this.StaticInitializer=StaticInitializer;
        if(StaticInitializer!=null) StaticInitializer.setParent(this);
        this.MultipleStaticInitializers=MultipleStaticInitializers;
        if(MultipleStaticInitializers!=null) MultipleStaticInitializers.setParent(this);
    }

    public StaticInitializer getStaticInitializer() {
        return StaticInitializer;
    }

    public void setStaticInitializer(StaticInitializer StaticInitializer) {
        this.StaticInitializer=StaticInitializer;
    }

    public MultipleStaticInitializers getMultipleStaticInitializers() {
        return MultipleStaticInitializers;
    }

    public void setMultipleStaticInitializers(MultipleStaticInitializers MultipleStaticInitializers) {
        this.MultipleStaticInitializers=MultipleStaticInitializers;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(StaticInitializer!=null) StaticInitializer.accept(visitor);
        if(MultipleStaticInitializers!=null) MultipleStaticInitializers.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(StaticInitializer!=null) StaticInitializer.traverseTopDown(visitor);
        if(MultipleStaticInitializers!=null) MultipleStaticInitializers.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(StaticInitializer!=null) StaticInitializer.traverseBottomUp(visitor);
        if(MultipleStaticInitializers!=null) MultipleStaticInitializers.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StaticInitializerList(\n");

        if(StaticInitializer!=null)
            buffer.append(StaticInitializer.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleStaticInitializers!=null)
            buffer.append(MultipleStaticInitializers.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StaticInitializerList]");
        return buffer.toString();
    }
}
