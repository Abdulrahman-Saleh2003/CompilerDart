package AST;

import java.util.ArrayList;
import java.util.List;

public class TypeNode extends ASTNode {
    public String name;
    public List<TypeNode> typeArguments;
    public boolean isNullable;

    public TypeNode(String name, List<TypeNode> typeArguments, boolean isNullable) {
        this.name = name;
        this.typeArguments = typeArguments != null ? typeArguments : new ArrayList<>();
        this.isNullable = isNullable;
    }

    public TypeNode(String name) {
        this(name, new ArrayList<>(), false);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (!typeArguments.isEmpty()) {
            sb.append("<");
            for (int i = 0; i < typeArguments.size(); i++) {
                sb.append(typeArguments.get(i).toString());
                if (i < typeArguments.size() - 1) sb.append(", ");
            }
            sb.append(">");
        }
        if (isNullable) sb.append("?");
        return sb.toString();
    }
}
