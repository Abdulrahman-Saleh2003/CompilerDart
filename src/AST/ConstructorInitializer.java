package AST;

import java.util.ArrayList;
import java.util.List;

public class ConstructorInitializer extends ASTNode {
    public String kind; // "super", "this", "field", "assert"
    public String target;
    public List<Argument> arguments;
    public Expression expression;

    public ConstructorInitializer(String kind, String target, List<Argument> arguments, Expression expression) {
        this.kind = kind;
        this.target = target;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nConstructorInitializer{" +
                "kind='" + kind + '\'' +
                (target != null ? ", target='" + target + '\'' : "") +
                (!arguments.isEmpty() ? ", arguments=" + arguments : "") +
                (expression != null ? ", expr=" + expression : "") +
                '}';
    }
}
