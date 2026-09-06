package AST;

public class GetterDeclaration extends ClassMember {
    public boolean isStatic;
    public TypeNode returnType;
    public String name;
    public Block body;
    public Expression arrowBody;

    public GetterDeclaration(boolean isStatic, TypeNode returnType, String name, Block body, Expression arrowBody) {
        this.isStatic = isStatic;
        this.returnType = returnType;
        this.name = name;
        this.body = body;
        this.arrowBody = arrowBody;
    }

    @Override
    public String toString() {
        return "\nGetterDeclaration{" +
                (isStatic ? "static " : "") +
                (returnType != null ? "returnType=" + returnType + ", " : "") +
                "name='" + name + '\'' +
                (body != null ? ",\n body=" + body : "") +
                (arrowBody != null ? ",\n arrowBody=" + arrowBody : "") +
                '}';
    }
}
