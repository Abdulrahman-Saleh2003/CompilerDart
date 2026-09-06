package AST;

public class SetterDeclaration extends ClassMember {
    public boolean isStatic;
    public String name;
    public Parameter parameter;
    public Block body;
    public Expression arrowBody;

    public SetterDeclaration(boolean isStatic, String name, Parameter parameter, Block body, Expression arrowBody) {
        this.isStatic = isStatic;
        this.name = name;
        this.parameter = parameter;
        this.body = body;
        this.arrowBody = arrowBody;
    }

    @Override
    public String toString() {
        return "\nSetterDeclaration{" +
                (isStatic ? "static " : "") +
                "name='" + name + '\'' +
                ", parameter=" + parameter +
                (body != null ? ",\n body=" + body : "") +
                (arrowBody != null ? ",\n arrowBody=" + arrowBody : "") +
                '}';
    }
}
