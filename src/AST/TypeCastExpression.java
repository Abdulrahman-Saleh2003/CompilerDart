package AST;

public class TypeCastExpression extends Expression {
    public Expression expression;
    public TypeNode type;

    public TypeCastExpression(Expression expression, TypeNode type) {
        this.expression = expression;
        this.type = type;
    }

    @Override
    public String toString() {
        return "(" + expression + " as " + type + ")";
    }
}
