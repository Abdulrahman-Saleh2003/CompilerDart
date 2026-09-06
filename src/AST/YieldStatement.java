package AST;

public class YieldStatement extends Statement {
    public boolean isYieldStar;
    public Expression expression;

    public YieldStatement(boolean isYieldStar, Expression expression) {
        this.isYieldStar = isYieldStar;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nYieldStatement{" +
                (isYieldStar ? "yield* " : "yield ") +
                expression +
                '}';
    }
}
