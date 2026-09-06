package AST;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclarationStatement extends Statement {
    public boolean isFinal;
    public boolean isConst;
    public boolean isLate;
    public TypeNode type;
    public List<VariableDeclarator> declarators;

    public VariableDeclarationStatement(boolean isFinal, boolean isConst, boolean isLate, TypeNode type, List<VariableDeclarator> declarators) {
        this.isFinal = isFinal;
        this.isConst = isConst;
        this.isLate = isLate;
        this.type = type;
        this.declarators = declarators != null ? declarators : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nVariableDeclarationStatement{" +
                (isFinal ? "final " : "") +
                (isConst ? "const " : "") +
                (isLate ? "late " : "") +
                (type != null ? "type=" + type + ", " : "") +
                "declarators=" + declarators +
                '}';
    }
}
