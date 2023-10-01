package CollegeTest.Best_Question;
import java.util.Scanner;
public class TwoBinaryNumberToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two binary numbers as strings
        String binary1 = scanner.next();
        String binary2 = scanner.next();

        // Call the function to add binary numbers
        String result = addBinary(binary1, binary2);

        // Print the result
        System.out.println(result);
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the least significant bit of the sum to the result
            result.insert(0, sum % 2);

            // Update the carry for the next iteration
            carry = sum / 2;
        }

        return result.toString();
    }
}

/*Input:-
1010
11001
output:-
100011
 */
/*---------------------------------*/
/*
Given two binary numbers add the two numbers in binary form without converting them to decimal value.
Constraints
1<=N1,N2<=10000000
input format
1010  11001
output format
100011
 */