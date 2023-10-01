package CollegeTest.S2_Lavel.Qualifying_Assessment;

import java.util.Scanner;

public class SwapFirstAndLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        sc.close();

        int ans = swapFirstAndLastDigits(number);
        System.out.println("Output: " + ans);
    }

    public static int swapFirstAndLastDigits(int num) {
        String numString = String.valueOf(num);
        if (numString.length() <= 1) {
            return num; // If the number has only one digit, no need to swap
        }

        char firstDigit = numString.charAt(0);
        char lastDigit = numString.charAt(numString.length() - 1);

        // Swap the first and last digits
        StringBuilder swappedNumString = new StringBuilder(numString);
        swappedNumString.setCharAt(0, lastDigit);
        swappedNumString.setCharAt(numString.length() - 1, firstDigit);

        return Integer.parseInt(swappedNumString.toString());
    }
}
