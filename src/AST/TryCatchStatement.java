package AST;

import java.util.ArrayList;
import java.util.List;

public class TryCatchStatement extends Statement {
    public Block tryBlock;
    public List<CatchClause> catchClauses;
    public Block finallyBlock;

    public TryCatchStatement(Block tryBlock, List<CatchClause> catchClauses, Block finallyBlock) {
        this.tryBlock = tryBlock;
        this.catchClauses = catchClauses != null ? catchClauses : new ArrayList<>();
        this.finallyBlock = finallyBlock;
    }

    @Override
    public String toString() {
        return "\nTryCatchStatement{" +
                "\ntryBlock=" + tryBlock +
                (!catchClauses.isEmpty() ? ",\n catchClauses=" + catchClauses : "") +
                (finallyBlock != null ? ",\n finallyBlock=" + finallyBlock : "") +
                '}';
    }
}
