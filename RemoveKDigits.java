package CollegeTest_BasicToIntermediate;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public static String removeKDigits(String num, int k) {
        if (k <= 0) {
            return num;
        }

        Stack<Character> stack = new Stack<>();
        int n = num.length();

        for (int i = 0; i < n; i++) {
            char digit = num.charAt(i);

            // Remove digits that are greater than the next digit
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // If there are remaining digits to be removed, remove them from the end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Construct the result string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        // Remove leading zeros
        int startIndex = 0;
        while (startIndex < result.length() - 1 && result.charAt(startIndex) == '0') {
            startIndex++;
        }

        return result.substring(startIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String num = "1432219";
//        int k = 3;
        String num = sc.nextLine();
        int k = sc.nextInt();
        String result = removeKDigits(num, k);
        System.out.println(result);
    }
}

/*
Given a non-negative integer number represented as a string, remove K digits from the number so that the new number
is the smallest possible.
Note:
The output must not contain leading zeroes.
If the digits are removed and its left with nothing, then display as 0.
Example:
Input :
1432219
3
Output :
1219
Explanation:
Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Sample Input
1432219
3
Sample Output
1219
 */