package CollegeTest.A_A_SuperBestQuestionForMe;

import java.util.Arrays;

public class LargestPossibleInteger_ArrangesOrder {
    public static void main(String[] args) {
        int[] numbers = {76, 415, 10, 7};
        String largestNumber = arrangeLargestNumber(numbers);
        System.out.println(largestNumber);
    }

    public static String arrangeLargestNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "0";
        }

        // Convert the integers to strings for comparison
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // Sort the strings based on a custom comparison rule
        Arrays.sort(strNumbers, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });

        // Handle leading zeros
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String str : strNumbers) {
            result.append(str);
        }

        return result.toString();
    }
}
