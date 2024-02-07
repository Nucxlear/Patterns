public class PlusExpression implements Expression{
    Expression left;
    Expression right;

    public PlusExpression(Expression right, Expression left) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
