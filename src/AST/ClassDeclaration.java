package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration extends ASTNode {
    public String modifier;
    public String name;
    public List<String> typeParameters;
    public TypeNode superclass;
    public List<TypeNode> mixins;
    public List<TypeNode> interfaces;
    public List<ClassMember> members;

    public ClassDeclaration(String modifier, String name, List<String> typeParameters, TypeNode superclass, List<TypeNode> mixins, List<TypeNode> interfaces, List<ClassMember> members) {
        this.modifier = modifier;
        this.name = name;
        this.typeParameters = typeParameters != null ? typeParameters : new ArrayList<>();
        this.superclass = superclass;
        this.mixins = mixins != null ? mixins : new ArrayList<>();
        this.interfaces = interfaces != null ? interfaces : new ArrayList<>();
        this.members = members != null ? members : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nClassDeclaration{" +
                (modifier != null ? "modifier='" + modifier + "', " : "") +
                "name='" + name + '\'' +
                (!typeParameters.isEmpty() ? ", typeParameters=" + typeParameters : "") +
                (superclass != null ? ", extends=" + superclass : "") +
                (!mixins.isEmpty() ? ", with=" + mixins : "") +
                (!interfaces.isEmpty() ? ", implements=" + interfaces : "") +
                ",\n members=" + members +
                '}';
    }
}
