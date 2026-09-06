package AST;

public class ExpressionStatement extends Statement {
    public Expression expression;

    public ExpressionStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nExpressionStatement{" +
                "expr=" + expression +
                '}';
    }
}
