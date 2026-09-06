package AST;

public class ForEachStatement extends Statement {
    public TypeNode itemType;
    public String itemName;
    public Expression iterable;
    public Statement body;
    public boolean isAwait;

    public ForEachStatement(TypeNode itemType, String itemName, Expression iterable, Statement body, boolean isAwait) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.iterable = iterable;
        this.body = body;
        this.isAwait = isAwait;
    }

    @Override
    public String toString() {
        return "\nForEachStatement{" +
                (isAwait ? "await " : "") +
                (itemType != null ? itemType + " " : "") +
                "name='" + itemName + '\'' +
                ",\n in=" + iterable +
                ",\n body=" + body +
                '}';
    }
}
