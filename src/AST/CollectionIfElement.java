package AST;

public class CollectionIfElement extends ASTNode {
    public Expression condition;
    public ASTNode thenElement;
    public ASTNode elseElement;

    public CollectionIfElement(Expression condition, ASTNode thenElement, ASTNode elseElement) {
        this.condition = condition;
        this.thenElement = thenElement;
        this.elseElement = elseElement;
    }

    @Override
    public String toString() {
        return "if (" + condition + ") " + thenElement + (elseElement != null ? " else " + elseElement : "");
    }
}
