package AST;

public class PrintStatement extends Statement {
    public Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nPrintStatement{" +
                "expr=" + expression +
                '}';
    }
}
