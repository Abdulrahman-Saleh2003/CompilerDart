package AST;

public class ReturnStatement extends Statement {
    public Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    public ReturnStatement() {
        this(null);
    }

    @Override
    public String toString() {
        return "\nReturnStatement{" +
                (expression != null ? "expr=" + expression : "") +
                '}';
    }
}
