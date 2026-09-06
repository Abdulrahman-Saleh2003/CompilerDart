package AST;

import java.util.ArrayList;
import java.util.List;

public class Program extends ASTNode {
    public List<ASTNode> declarations;

    public Program(List<ASTNode> declarations) {
        this.declarations = declarations != null ? declarations : new ArrayList<>();
    }

    public Program() {
        this(new ArrayList<>());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Program {\n");
        for (ASTNode node : declarations) {
            sb.append("  ").append(node.toString().replace("\n", "\n  ")).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
