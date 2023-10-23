package CollegeTest_BasicToIntermediate;

import java.util.Scanner;
public class ThreeConsecutiveDigits2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (hasConsecutiveDigits(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean hasConsecutiveDigits(int number) {
        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length() - 2; i++) {
            int digit1 = Character.getNumericValue(numberString.charAt(i));
            int digit2 = Character.getNumericValue(numberString.charAt(i + 1));
            int digit3 = Character.getNumericValue(numberString.charAt(i + 2));

            if (digit1 + 1 == digit2 && digit2 + 1 == digit3) {
                return true; // Increasing order
            } else if (digit1 - 1 == digit2 && digit2 - 1 == digit3) {
                return true; // Decreasing order
            }
        }

        return false;
    }
}

/*
Write a program to check if a given number has consecutive 3 digits - Either increasing/decreasing order
INPUT:
8760
Output:
Yes
Explanation: In the above, 8, 7 and 6 are consecutive numbers
Input:
0789
Output:
Yes
Explanation: 7, 8 and 9 are in increasing order
INPUT:
1780
Output:
No
Input:
1237
Output:
Yes
Explanation: In the above, 8, 7 and 6 are consecutive numbers
 */