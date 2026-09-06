package AST;

public class MemberAccessExpression extends Expression {
    public Expression target;
    public String memberName;
    public boolean isNullAware;

    public MemberAccessExpression(Expression target, String memberName, boolean isNullAware) {
        this.target = target;
        this.memberName = memberName;
        this.isNullAware = isNullAware;
    }

    @Override
    public String toString() {
        return target + (isNullAware ? "?." : ".") + memberName;
    }
}
