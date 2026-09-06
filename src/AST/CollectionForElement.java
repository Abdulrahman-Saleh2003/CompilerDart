package AST;

public class CollectionForElement extends ASTNode {
    public String varName;
    public Expression iterable;
    public ASTNode body;

    public CollectionForElement(String varName, Expression iterable, ASTNode body) {
        this.varName = varName;
        this.iterable = iterable;
        this.body = body;
    }

    @Override
    public String toString() {
        return "for (" + varName + " in " + iterable + ") " + body;
    }
}
