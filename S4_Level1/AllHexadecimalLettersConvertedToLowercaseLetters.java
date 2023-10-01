package CollegeTest.S4_Level1;
import java.util.*;
public class AllHexadecimalLettersConvertedToLowercaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String S = scanner.nextLine();
        String S = "aaaaaaaaaaa"; //ba
        scanner.close();

        String encryptedString = encryptString(S);
        System.out.println(encryptedString);
    }

    public static String encryptString(String input) {
        StringBuilder encrypted = new StringBuilder();

        int count = 1;
        char prevChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == prevChar) {
                count++;
            } else {
                encrypted.append(prevChar);
                encrypted.append(Integer.toHexString(count));

                prevChar = currentChar;
                count = 1;
            }
        }

        encrypted.append(prevChar);
        encrypted.append(Integer.toHexString(count));

        String hexString = encrypted.toString();
        String reversed = new StringBuilder(hexString).reverse().toString();
        return reversed;
    }
}
