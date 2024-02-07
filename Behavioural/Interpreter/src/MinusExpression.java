public class MinusExpression implements Expression{
    Expression left;
    Expression right;

    public MinusExpression(Expression right, Expression left) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
