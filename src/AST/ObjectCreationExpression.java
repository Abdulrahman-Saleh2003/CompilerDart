package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectCreationExpression extends Expression {
    public boolean isConst;
    public TypeNode type;
    public String constructorName;
    public List<Argument> arguments;

    public ObjectCreationExpression(boolean isConst, TypeNode type, String constructorName, List<Argument> arguments) {
        this.isConst = isConst;
        this.type = type;
        this.constructorName = constructorName;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
    }

    @Override
    public String toString() {
        return (isConst ? "const " : "") + type + (constructorName != null ? "." + constructorName : "") + "(" + arguments + ")";
    }
}
