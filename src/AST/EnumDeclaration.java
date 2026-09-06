package AST;

import java.util.ArrayList;
import java.util.List;

public class EnumDeclaration extends ASTNode {
    public String name;
    public List<String> typeParameters;
    public List<TypeNode> interfaces;
    public List<EnumEntry> entries;
    public List<ClassMember> members;

    public EnumDeclaration(String name, List<String> typeParameters, List<TypeNode> interfaces, List<EnumEntry> entries, List<ClassMember> members) {
        this.name = name;
        this.typeParameters = typeParameters != null ? typeParameters : new ArrayList<>();
        this.interfaces = interfaces != null ? interfaces : new ArrayList<>();
        this.entries = entries != null ? entries : new ArrayList<>();
        this.members = members != null ? members : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nEnumDeclaration{" +
                "name='" + name + '\'' +
                (!typeParameters.isEmpty() ? ", typeParameters=" + typeParameters : "") +
                (!interfaces.isEmpty() ? ", implements=" + interfaces : "") +
                ",\n entries=" + entries +
                (!members.isEmpty() ? ",\n members=" + members : "") +
                '}';
    }
}
