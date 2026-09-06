package AST;

public class VariableDeclarator extends ASTNode {
    public String name;
    public Expression initializer;

    public VariableDeclarator(String name, Expression initializer) {
        this.name = name;
        this.initializer = initializer;
    }

    public VariableDeclarator(String name) {
        this(name, null);
    }

    @Override
    public String toString() {
        return "VariableDeclarator{" +
                "name='" + name + '\'' +
                (initializer != null ? ", init=" + initializer : "") +
                '}';
    }
}
