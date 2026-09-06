package AST;

import java.util.ArrayList;
import java.util.List;

public class ForStatement extends Statement {
    public Statement init;
    public Expression condition;
    public List<Expression> updates;
    public Statement body;

    public ForStatement(Statement init, Expression condition, List<Expression> updates, Statement body) {
        this.init = init;
        this.condition = condition;
        this.updates = updates != null ? updates : new ArrayList<>();
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nForStatement{" +
                (init != null ? "\ninit=" + init : "") +
                (condition != null ? ",\n condition=" + condition : "") +
                (!updates.isEmpty() ? ",\n updates=" + updates : "") +
                ",\n body=" + body +
                '}';
    }
}
