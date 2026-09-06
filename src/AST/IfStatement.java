package AST;

public class IfStatement extends Statement {
    public Expression condition;
    public Statement thenBranch;
    public Statement elseBranch;

    public IfStatement(Expression condition, Statement thenBranch, Statement elseBranch) {
        this.condition = condition;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    @Override
    public String toString() {
        return "\nIfStatement{" +
                "\ncondition=" + condition +
                ",\n thenBranch=" + thenBranch +
                (elseBranch != null ? ",\n elseBranch=" + elseBranch : "") +
                '}';
    }
}
