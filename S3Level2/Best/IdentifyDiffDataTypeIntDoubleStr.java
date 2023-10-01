package CollegeTest.S3Level2.Best;

import java.util.Scanner;

public class IdentifyDiffDataTypeIntDoubleStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String inputStr = scanner.nextLine();
        scanner.close();

        identifyDataTypes(inputStr);
    }

    public static void identifyDataTypes(String inputString) {
        String[] words = inputString.split(" ");
        int intCount = 0;
        int doubleCount = 0;
        int stringCount = 0;

        for (String word : words) {
            if (isInteger(word)) {
                intCount++;
            } else if (isDouble(word)) {
                doubleCount++;
            } else {
                stringCount++;
            }
        }

        System.out.println("Integer " + intCount);
        System.out.println("Double " + doubleCount);
        System.out.println("String " + stringCount);
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

/*
Enter the input string: Hello india 4 Bihar 4.3 3 f
Integer 2
Double 1
String 4
 */