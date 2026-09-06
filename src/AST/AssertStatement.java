package AST;

public class AssertStatement extends Statement {
    public Expression condition;
    public Expression message;

    public AssertStatement(Expression condition, Expression message) {
        this.condition = condition;
        this.message = message;
    }

    @Override
    public String toString() {
        return "\nAssertStatement{" +
                "condition=" + condition +
                (message != null ? ", message=" + message : "") +
                '}';
    }
}
