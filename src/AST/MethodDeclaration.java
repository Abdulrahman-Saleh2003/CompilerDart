package AST;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclaration extends ClassMember {
    public boolean isStatic;
    public TypeNode returnType;
    public String name;
    public List<Parameter> parameters;
    public boolean isAsync;
    public Block body;
    public Expression arrowBody;

    public MethodDeclaration(boolean isStatic, TypeNode returnType, String name, List<Parameter> parameters, boolean isAsync, Block body, Expression arrowBody) {
        this.isStatic = isStatic;
        this.returnType = returnType;
        this.name = name;
        this.parameters = parameters != null ? parameters : new ArrayList<>();
        this.isAsync = isAsync;
        this.body = body;
        this.arrowBody = arrowBody;
    }

    @Override
    public String toString() {
        return "\nMethodDeclaration{" +
                (isStatic ? "static " : "") +
                (returnType != null ? "returnType=" + returnType + ", " : "") +
                "name='" + name + '\'' +
                (isAsync ? ", async" : "") +
                ",\n parameters=" + parameters +
                (body != null ? ",\n body=" + body : "") +
                (arrowBody != null ? ",\n arrowBody=" + arrowBody : "") +
                '}';
    }
}
