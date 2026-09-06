package AST;

public class Parameter extends ASTNode {
    public TypeNode type;
    public String name;
    public boolean isRequired;
    public boolean isNamed;
    public boolean isOptionalPositional;
    public boolean isThis;
    public boolean isSuper;
    public Expression defaultValue;

    public Parameter(TypeNode type, String name, boolean isRequired, boolean isNamed, boolean isOptionalPositional, boolean isThis, boolean isSuper, Expression defaultValue) {
        this.type = type;
        this.name = name;
        this.isRequired = isRequired;
        this.isNamed = isNamed;
        this.isOptionalPositional = isOptionalPositional;
        this.isThis = isThis;
        this.isSuper = isSuper;
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "\nParameter{" +
                (isRequired ? "required " : "") +
                (isThis ? "this." : "") +
                (isSuper ? "super." : "") +
                (type != null ? "type=" + type + ", " : "") +
                "name='" + name + '\'' +
                (defaultValue != null ? ", defaultValue=" + defaultValue : "") +
                '}';
    }
}
