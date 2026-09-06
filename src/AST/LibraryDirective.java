package AST;

public class LibraryDirective extends ASTNode {
    public String name;

    public LibraryDirective(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nLibraryDirective{" +
                "name='" + name + '\'' +
                '}';
    }
}
