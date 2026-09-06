package AST;

public class UnaryExpression extends Expression {
    public String operator;
    public Expression operand;
    public boolean isPrefix;

    public UnaryExpression(String operator, Expression operand, boolean isPrefix) {
        this.operator = operator;
        this.operand = operand;
        this.isPrefix = isPrefix;
    }

    @Override
    public String toString() {
        if (isPrefix) {
            return "(" + operator + operand + ")";
        }
        return "(" + operand + operator + ")";
    }
}
