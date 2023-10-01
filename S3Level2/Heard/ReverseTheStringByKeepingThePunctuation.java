package CollegeTest.S3Level2.Heard;
import java.util.Scanner;
public class ReverseTheStringByKeepingThePunctuation {
    public static void reverseStringWithPunctuation(StringBuilder str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Find the first non-punctuation character from the left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            // Find the first non-punctuation character from the right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Swap the characters at the left and right positions
            char temp = str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(right, temp);

            // Move the pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String inputString = scanner.nextLine();
        String inputString = "A man,int the boat says: I see 1-2-3 in the sky";

        StringBuilder input = new StringBuilder(inputString);
        reverseStringWithPunctuation(input);

        System.out.println("Reversed String: " + input.toString());

        scanner.close();
    }
}

/*
Enter a string: A man,int the boat says: I see 1-2-3 in the sky
Reversed String: y kse,htn i32 1ees Isya: s tao b-e-h tt nin amA
 */