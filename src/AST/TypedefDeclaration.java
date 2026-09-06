package AST;

import java.util.ArrayList;
import java.util.List;

public class TypedefDeclaration extends ASTNode {
    public String name;
    public List<String> typeParameters;
    public TypeNode type;

    public TypedefDeclaration(String name, List<String> typeParameters, TypeNode type) {
        this.name = name;
        this.typeParameters = typeParameters != null ? typeParameters : new ArrayList<>();
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nTypedefDeclaration{" +
                "name='" + name + '\'' +
                (!typeParameters.isEmpty() ? ", typeParameters=" + typeParameters : "") +
                ", type=" + type +
                '}';
    }
}
