package AST;

public class NullCoalescingExpression extends Expression {
    public Expression left;
    public Expression right;

    public NullCoalescingExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " ?? " + right + ")";
    }
}
