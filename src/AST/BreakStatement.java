package AST;

public class BreakStatement extends Statement {
    public String label;

    public BreakStatement(String label) {
        this.label = label;
    }

    public BreakStatement() {
        this(null);
    }

    @Override
    public String toString() {
        return "\nBreakStatement{" +
                (label != null ? "label='" + label + '\'' : "") +
                '}';
    }
}
