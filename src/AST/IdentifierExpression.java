package AST;

public class IdentifierExpression extends Expression {
    public String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
