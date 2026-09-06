package AST;

import java.util.ArrayList;
import java.util.List;

public class CascadeExpression extends Expression {
    public Expression target;
    public List<Expression> cascadeSections;

    public CascadeExpression(Expression target, List<Expression> cascadeSections) {
        this.target = target;
        this.cascadeSections = cascadeSections != null ? cascadeSections : new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(target);
        for (Expression section : cascadeSections) {
            sb.append("..").append(section);
        }
        return sb.toString();
    }
}
