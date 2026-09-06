package AST;

public class SpreadElement extends ASTNode {
    public Expression expression;
    public boolean isNullAware;

    public SpreadElement(Expression expression, boolean isNullAware) {
        this.expression = expression;
        this.isNullAware = isNullAware;
    }

    @Override
    public String toString() {
        return (isNullAware ? "...?" : "...") + expression;
    }
}
