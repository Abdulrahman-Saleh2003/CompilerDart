package AST;

public class ThrowStatement extends Statement {
    public Expression expression;

    public ThrowStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nThrowStatement{" +
                "expr=" + expression +
                '}';
    }
}
