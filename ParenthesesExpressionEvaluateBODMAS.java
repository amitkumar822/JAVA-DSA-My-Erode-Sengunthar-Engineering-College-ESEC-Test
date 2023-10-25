import java.util.Scanner;
import java.util.Stack;

public class ParenthesesExpressionEvaluateBODMAS {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = solveExp(str);
        System.out.println(result);
    }

    public static int solveExp(String expression) {
        char[] arr_token = expression.toCharArray();
        Stack<Integer> int_value = new Stack<>();
        Stack<Character> opertor_value = new Stack<>();
        for(int i=0; i < arr_token.length; i++) {
            if(arr_token[i] == ' ')
                continue;
            if (Character.isDigit(arr_token[i])) {
                StringBuilder str = new StringBuilder();
                while (i < arr_token.length && Character.isDigit(arr_token[i])) {
                    str.append(arr_token[i]);
                    i++; // increment the index
                }
                i--; // decrement the index to ensure the correct character is processed
                int_value.push(Integer.parseInt(str.toString()));
            } else if (arr_token[i] == '(') {
                opertor_value.push(arr_token[i]);
            } else if (arr_token[i] == ')') {
                while (opertor_value.peek() != '(') {
                    int_value.push(applyOperation(opertor_value.pop(), int_value.pop(), int_value.pop()));
                }
                opertor_value.pop();
            } else if (arr_token[i] == '+' || arr_token[i] == '-' || arr_token[i] == '*' || arr_token[i] == '/') {
                while (!opertor_value.empty() && hasPrecedence(arr_token[i], opertor_value.peek())) {
                    int_value.push(applyOperation(opertor_value.pop(), int_value.pop(), int_value.pop()));
                }
                opertor_value.push(arr_token[i]);
            }
        }
        while (!opertor_value.empty()) {
            int_value.push(applyOperation(opertor_value.pop(), int_value.pop(), int_value.pop()));
        }
        return int_value.pop();
    }

    public static boolean hasPrecedence(char oper1, char oper2) {
        if (oper2 == '(' || oper2 == ')')
            return false;
        if ((oper1 == '/' || oper1 == '*') && (oper2 == '+' || oper2 == '-'))
            return false;
        return true;
    }

    public static int applyOperation(char oper, int var2, int var1) {
        switch (oper) {
            case '+':
                return var1 + var2;
            case '-':
                return var1 - var2;
            case '*':
                return var1 * var2;
            case '/':
                if (var2 == 0)
                    throw new ArithmeticException("Division by zero not possible!");
                return var1 / var2;
        }
        return 0;
    }
}

/*
Evaluate an expression represented by a String. Expression can contain parentheses, you can assume parentheses are well-matched.
Note:
Assume only binary operations +1 -, and /.
Sample Input
10 +2
Sample Output
22
For example:
Input
100* ( 2 + 12 )
Result
1400
 */
