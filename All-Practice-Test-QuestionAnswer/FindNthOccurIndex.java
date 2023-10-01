package CollegeTest;

import java.util.Scanner;

public class FindNthOccurIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to find: ");
        char targetChar = scanner.next().charAt(0);

        System.out.print("Enter the occurrence number (n): ");
        int n = scanner.nextInt();

        int occurrence = findNthOccurrence(inputString, targetChar, n);
        System.out.println("Output: " + occurrence);
    }

    public static int findNthOccurrence(String inputString, char targetChar, int n) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1;
    }
}
