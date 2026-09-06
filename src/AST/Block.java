package AST;

import java.util.ArrayList;
import java.util.List;

public class Block extends Statement {
    public List<Statement> statements;

    public Block(List<Statement> statements) {
        this.statements = statements != null ? statements : new ArrayList<>();
    }

    public Block() {
        this(new ArrayList<>());
    }

    @Override
    public String toString() {
        return "\nBlock{" +
                "\nstatements=" + statements +
                '}';
    }
}
