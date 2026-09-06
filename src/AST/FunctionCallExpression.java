package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallExpression extends Expression {
    public Expression callee;
    public List<Argument> arguments;

    public FunctionCallExpression(Expression callee, List<Argument> arguments) {
        this.callee = callee;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
    }

    @Override
    public String toString() {
        return callee + "(" + arguments + ")";
    }
}
