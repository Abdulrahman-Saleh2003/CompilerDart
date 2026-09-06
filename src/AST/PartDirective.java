package AST;

public class PartDirective extends ASTNode {
    public String uri;
    public boolean isPartOf;

    public PartDirective(String uri, boolean isPartOf) {
        this.uri = uri;
        this.isPartOf = isPartOf;
    }

    @Override
    public String toString() {
        return "\nPartDirective{" +
                (isPartOf ? "part of " : "part ") +
                "'" + uri + '\'' +
                '}';
    }
}
