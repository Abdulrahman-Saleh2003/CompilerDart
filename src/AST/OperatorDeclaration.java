package AST;

import java.util.ArrayList;
import java.util.List;

public class OperatorDeclaration extends ClassMember {
    public TypeNode returnType;
    public String operator;
    public List<Parameter> parameters;
    public Block body;
    public Expression arrowBody;

    public OperatorDeclaration(TypeNode returnType, String operator, List<Parameter> parameters, Block body, Expression arrowBody) {
        this.returnType = returnType;
        this.operator = operator;
        this.parameters = parameters != null ? parameters : new ArrayList<>();
        this.body = body;
        this.arrowBody = arrowBody;
    }

    @Override
    public String toString() {
        return "\nOperatorDeclaration{" +
                (returnType != null ? "returnType=" + returnType + ", " : "") +
                "operator='" + operator + '\'' +
                ",\n parameters=" + parameters +
                (body != null ? ",\n body=" + body : "") +
                (arrowBody != null ? ",\n arrowBody=" + arrowBody : "") +
                '}';
    }
}
