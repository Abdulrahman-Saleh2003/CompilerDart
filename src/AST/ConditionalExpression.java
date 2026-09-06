package AST;

public class ConditionalExpression extends Expression {
    public Expression condition;
    public Expression thenExpr;
    public Expression elseExpr;

    public ConditionalExpression(Expression condition, Expression thenExpr, Expression elseExpr) {
        this.condition = condition;
        this.thenExpr = thenExpr;
        this.elseExpr = elseExpr;
    }

    @Override
    public String toString() {
        return "(" + condition + " ? " + thenExpr + " : " + elseExpr + ")";
    }
}
