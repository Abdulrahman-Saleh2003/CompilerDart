package AST;

public class DoWhileStatement extends Statement {
    public Statement body;
    public Expression condition;

    public DoWhileStatement(Statement body, Expression condition) {
        this.body = body;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "\nDoWhileStatement{" +
                "\nbody=" + body +
                ",\n condition=" + condition +
                '}';
    }
}
