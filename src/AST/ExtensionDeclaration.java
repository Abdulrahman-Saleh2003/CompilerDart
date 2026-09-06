package AST;

import java.util.ArrayList;
import java.util.List;

public class ExtensionDeclaration extends ASTNode {
    public String name;
    public List<String> typeParameters;
    public TypeNode onType;
    public List<ClassMember> members;

    public ExtensionDeclaration(String name, List<String> typeParameters, TypeNode onType, List<ClassMember> members) {
        this.name = name;
        this.typeParameters = typeParameters != null ? typeParameters : new ArrayList<>();
        this.onType = onType;
        this.members = members != null ? members : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nExtensionDeclaration{" +
                (name != null ? "name='" + name + "', " : "") +
                (!typeParameters.isEmpty() ? "typeParameters=" + typeParameters + ", " : "") +
                "on=" + onType +
                ",\n members=" + members +
                '}';
    }
}
