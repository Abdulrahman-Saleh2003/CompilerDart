package AST;

public class CatchClause extends ASTNode {
    public TypeNode exceptionType;
    public String exceptionVar;
    public String stackTraceVar;
    public Block body;

    public CatchClause(TypeNode exceptionType, String exceptionVar, String stackTraceVar, Block body) {
        this.exceptionType = exceptionType;
        this.exceptionVar = exceptionVar;
        this.stackTraceVar = stackTraceVar;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nCatchClause{" +
                (exceptionType != null ? "on=" + exceptionType + ", " : "") +
                (exceptionVar != null ? "catch='" + exceptionVar + "', " : "") +
                (stackTraceVar != null ? "stackTrace='" + stackTraceVar + "', " : "") +
                "\n body=" + body +
                '}';
    }
}
