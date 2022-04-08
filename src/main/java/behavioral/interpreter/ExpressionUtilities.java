package behavioral.interpreter;

public class ExpressionUtilities {
    public static boolean isOperator(String operator) {
        return (operator.equals("+") || operator.equals("-") || operator.equals("*"));
    }

    public static Expression getOperator(String operator, Expression leftExpression, Expression rightExpression) {
        switch (operator) {
            case "+":
                return new Add(leftExpression, rightExpression);
            case "-":
                return new Substract(leftExpression, rightExpression);
            case "*":
                return new Multiply(leftExpression, rightExpression);
            default:
                return null;
        }

    }
}
