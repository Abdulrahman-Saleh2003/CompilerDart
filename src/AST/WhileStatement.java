package AST;

public class WhileStatement extends Statement {
    public Expression condition;
    public Statement body;

    public WhileStatement(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nWhileStatement{" +
                "\ncondition=" + condition +
                ",\n body=" + body +
                '}';
    }
}
