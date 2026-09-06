package AST;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression extends Expression {
    public List<Parameter> parameters;
    public boolean isAsync;
    public Block body;
    public Expression arrowBody;

    public LambdaExpression(List<Parameter> parameters, boolean isAsync, Block body, Expression arrowBody) {
        this.parameters = parameters != null ? parameters : new ArrayList<>();
        this.isAsync = isAsync;
        this.body = body;
        this.arrowBody = arrowBody;
    }

    @Override
    public String toString() {
        return "(" + parameters + ")" + (isAsync ? " async" : "") + (arrowBody != null ? " => " + arrowBody : " " + body);
    }
}
