package AST;

public class Argument extends ASTNode {
    public String name;
    public Expression value;

    public Argument(String name, Expression value) {
        this.name = name;
        this.value = value;
    }

    public Argument(Expression value) {
        this(null, value);
    }

    @Override
    public String toString() {
        if (name != null) {
            return name + ": " + value;
        }
        return String.valueOf(value);
    }
}
