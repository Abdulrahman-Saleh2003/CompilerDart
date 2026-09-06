package AST;

public class LiteralExpression extends Expression {
    public Object value;
    public String typeName;

    public LiteralExpression(Object value, String typeName) {
        this.value = value;
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
