package behavioral.interpreter;

import java.util.Stack;

public class TestIntepreter {
    public static void main(String[] args) {
        String ERROR = "Formati i stringes se dhene nuk eshte i sakte!";
        String tokenString = "7 - 3 + 1 - 1 +2";

        String[] tokenArray = tokenString.split(" ");
        if (tokenArray.length % 2 == 0) {
            System.out.println(ERROR);
            return;
        }
        Expression leftExpression = new TerminalNumber(Integer.parseInt(tokenArray[0]));
        Expression rightExpression = null;
        int result = 0;
        for (int i = 1; i < tokenArray.length; i = i + 2) {
            if (!ExpressionUtilities.isOperator(tokenArray[i])) {
                System.out.println(ERROR);
                return;
            }
            try {
                rightExpression = new TerminalNumber(Integer.parseInt(tokenArray[i + 1]));
            } catch (NumberFormatException exception) {
                System.out.println(ERROR);
                return;
            }
            Expression operator = ExpressionUtilities.getOperator(tokenArray[i], leftExpression, rightExpression);
            result = operator.interpret();
            leftExpression = new TerminalNumber(result);
        }
        System.out.println(result);
    }
}
