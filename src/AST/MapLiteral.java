package AST;

import java.util.ArrayList;
import java.util.List;

public class MapLiteral extends Expression {
    public List<ASTNode> elements;

    public MapLiteral(List<ASTNode> elements) {
        this.elements = elements != null ? elements : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "{" + elements + "}";
    }
}
