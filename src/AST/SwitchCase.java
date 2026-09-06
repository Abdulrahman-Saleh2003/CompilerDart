package AST;

import java.util.ArrayList;
import java.util.List;

public class SwitchCase extends ASTNode {
    public Expression pattern;
    public Expression guard;
    public List<Statement> statements;

    public SwitchCase(Expression pattern, Expression guard, List<Statement> statements) {
        this.pattern = pattern;
        this.guard = guard;
        this.statements = statements != null ? statements : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nSwitchCase{" +
                "\npattern=" + pattern +
                (guard != null ? ", guard=" + guard : "") +
                ",\n statements=" + statements +
                '}';
    }
}
