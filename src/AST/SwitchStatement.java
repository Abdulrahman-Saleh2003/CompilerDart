package AST;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatement extends Statement {
    public Expression expression;
    public List<SwitchCase> cases;
    public List<Statement> defaultStatements;

    public SwitchStatement(Expression expression, List<SwitchCase> cases, List<Statement> defaultStatements) {
        this.expression = expression;
        this.cases = cases != null ? cases : new ArrayList<>();
        this.defaultStatements = defaultStatements != null ? defaultStatements : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nSwitchStatement{" +
                "\nexpression=" + expression +
                ",\n cases=" + cases +
                (!defaultStatements.isEmpty() ? ",\n default=" + defaultStatements : "") +
                '}';
    }
}
