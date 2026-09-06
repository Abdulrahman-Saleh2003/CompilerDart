package AST;

public class IndexAccessExpression extends Expression {
    public Expression target;
    public Expression index;
    public boolean isNullAware;

    public IndexAccessExpression(Expression target, Expression index, boolean isNullAware) {
        this.target = target;
        this.index = index;
        this.isNullAware = isNullAware;
    }

    @Override
    public String toString() {
        return target + (isNullAware ? "?[" : "[") + index + "]";
    }
}
