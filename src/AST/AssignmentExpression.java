package AST;

public class AssignmentExpression extends Expression {
    public Expression target;
    public String operator;
    public Expression value;

    public AssignmentExpression(Expression target, String operator, Expression value) {
        this.target = target;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + target + " " + operator + " " + value + ")";
    }
}
