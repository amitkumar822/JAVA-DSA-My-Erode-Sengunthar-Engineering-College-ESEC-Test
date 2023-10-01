package CollegeTest.A_NewPracticeTest;
import java.util.Scanner;
public class FindNumberDoubleString_identifyTheDifferentDataTypePresent {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string containing a mix of strings, integers, and doubles:");
//        String input = scanner.nextLine();
//        scanner.close();
        String input = "can you give me 10 bucks puff in 7.5 or 7";

        // Split the input string by one or more spaces
        String[] tokens = input.split("\\s+");

        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;

        for (String token : tokens) {
            // Try to parse the token as an Integer
            try {
                Integer.parseInt(token);
                integerCount++;
            } catch (NumberFormatException e) {
                // If parsing as an Integer fails, try to parse as a Double
                try {
                    Double.parseDouble(token);
                    doubleCount++;
                } catch (NumberFormatException ex) {
                    // If parsing as both Integer and Double fails, consider it a String
                    stringCount++;
                }
            }
        }

        // Print the results
        System.out.println("string " + stringCount);
        System.out.println("integer " + integerCount);
        System.out.println("double " + doubleCount);
    }
}