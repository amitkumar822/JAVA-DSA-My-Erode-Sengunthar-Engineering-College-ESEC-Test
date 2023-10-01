package CollegeTest.S2_Lavel.Qualifying_Assessment;

import java.util.Scanner;

public class ThreeDigits_IncreasingDecreasingOrder {
    public static boolean hasConsecutiveThreeDigits(int num) {
        String numStr = Integer.toString(num);
        int length = numStr.length();

        for (int i = 0; i < length - 2; i++) {
            int digit1 = Character.getNumericValue(numStr.charAt(i));
            int digit2 = Character.getNumericValue(numStr.charAt(i + 1));
            int digit3 = Character.getNumericValue(numStr.charAt(i + 2));

            // Check for increasing order: digit1 < digit2 < digit3
            if (digit1 + 1 == digit2 && digit2 + 1 == digit3) {
                return true;
            }

            // Check for decreasing order: digit1 > digit2 > digit3
            if (digit1 - 1 == digit2 && digit2 - 1 == digit3) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (hasConsecutiveThreeDigits(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
