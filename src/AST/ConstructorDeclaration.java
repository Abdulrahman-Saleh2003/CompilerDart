package AST;

import java.util.ArrayList;
import java.util.List;

public class ConstructorDeclaration extends ClassMember {
    public boolean isConst;
    public boolean isFactory;
    public String name;
    public List<Parameter> parameters;
    public List<ConstructorInitializer> initializers;
    public Block body;

    public ConstructorDeclaration(boolean isConst, boolean isFactory, String name, List<Parameter> parameters, List<ConstructorInitializer> initializers, Block body) {
        this.isConst = isConst;
        this.isFactory = isFactory;
        this.name = name;
        this.parameters = parameters != null ? parameters : new ArrayList<>();
        this.initializers = initializers != null ? initializers : new ArrayList<>();
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nConstructorDeclaration{" +
                (isConst ? "const " : "") +
                (isFactory ? "factory " : "") +
                "name='" + name + '\'' +
                ",\n parameters=" + parameters +
                (!initializers.isEmpty() ? ",\n initializers=" + initializers : "") +
                (body != null ? ",\n body=" + body : "") +
                '}';
    }
}
