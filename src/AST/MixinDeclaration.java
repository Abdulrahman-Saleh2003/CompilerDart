package AST;

import java.util.ArrayList;
import java.util.List;

public class MixinDeclaration extends ASTNode {
    public String name;
    public List<String> typeParameters;
    public List<TypeNode> onTypes;
    public List<TypeNode> interfaces;
    public List<ClassMember> members;

    public MixinDeclaration(String name, List<String> typeParameters, List<TypeNode> onTypes, List<TypeNode> interfaces, List<ClassMember> members) {
        this.name = name;
        this.typeParameters = typeParameters != null ? typeParameters : new ArrayList<>();
        this.onTypes = onTypes != null ? onTypes : new ArrayList<>();
        this.interfaces = interfaces != null ? interfaces : new ArrayList<>();
        this.members = members != null ? members : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nMixinDeclaration{" +
                "name='" + name + '\'' +
                (!typeParameters.isEmpty() ? ", typeParameters=" + typeParameters : "") +
                (!onTypes.isEmpty() ? ", on=" + onTypes : "") +
                (!interfaces.isEmpty() ? ", implements=" + interfaces : "") +
                ",\n members=" + members +
                '}';
    }
}
