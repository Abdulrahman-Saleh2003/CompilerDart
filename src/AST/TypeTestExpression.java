package AST;

public class TypeTestExpression extends Expression {
    public Expression expression;
    public String operator; // "is" or "is!"
    public TypeNode type;

    public TypeTestExpression(Expression expression, String operator, TypeNode type) {
        this.expression = expression;
        this.operator = operator;
        this.type = type;
    }

    @Override
    public String toString() {
        return "(" + expression + " " + operator + " " + type + ")";
    }
}
