package AST;

public class MapEntryElement extends ASTNode {
    public Expression key;
    public Expression value;

    public MapEntryElement(Expression key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }
}
