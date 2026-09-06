package AST;

public class ContinueStatement extends Statement {
    public String label;

    public ContinueStatement(String label) {
        this.label = label;
    }

    public ContinueStatement() {
        this(null);
    }

    @Override
    public String toString() {
        return "\nContinueStatement{" +
                (label != null ? "label='" + label + '\'' : "") +
                '}';
    }
}
