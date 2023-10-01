package CollegeTest.A_NewPracticeTest.BestQuestion;
import java.util.Scanner;
public class StringRotation_RotatedVersion {
    public static void main(String[] args) {
        /*input:-
        1
        abcde
        cdeab
        output: true
         */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            String A = scanner.next(); // First string
            String B = scanner.next(); // Second string

            boolean isRotation = isRotation(A, B);

            if (isRotation) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        scanner.close();
    }

    public static boolean isRotation(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        String concatenated = A + A; // Concatenate A with itself

        // Check if B is a substring of the concatenated string
        if (concatenated.contains(B)) {
            return true;
        }

        return false;
    }
}

/*
Write a program to find if a string is the rotated version of another string. Given two strings A
and B, Check whether A can be shifted some number of times to get B or not. For example, if A is
'abcde' and B is 'cdeab', print true.
Input Format
First line of input is T, no of test cases First line of each case is string A. Second line of each case
is another string B.
Constraints
I ISI 100
Output Format
Single line - "true" if it is possible to get string B upon rotating string A by 'n' times otherwise
"false".
Sample Input O
1
abcde
cdeab
Sample Output O
true
 */