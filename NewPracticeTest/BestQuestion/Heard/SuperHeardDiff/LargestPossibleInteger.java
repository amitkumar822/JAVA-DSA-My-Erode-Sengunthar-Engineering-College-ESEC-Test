package CollegeTest.A_NewPracticeTest.BestQuestion.Heard.SuperHeardDiff;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestPossibleInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] numbers = new int[len];
//        int[] numbers = {1, 2, 3, 4};
        for(int i=0; i<len; i++){
            numbers[i] = sc.nextInt();
        }
        String largestNumber = arrangeLargestNumber(numbers);
        System.out.println(largestNumber);
    }

    public static String arrangeLargestNumber(int[] numbers) {
        // Convert integers to strings for custom sorting
        String[] numStrs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrs[i] = Integer.toString(numbers[i]);
        }

        // Sort the strings using a custom comparator
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String order1 = s1 + s2;
                String order2 = s2 + s1;
                // Compare in descending order to get the largest possible integer
                return order2.compareTo(order1);
            }
        });

        // Concatenate sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String numStr : numStrs) {
            result.append(numStr);
        }

        return result.toString();
    }
}


/*
Given a list of numbers, create an algorithm that arranges them in order to form the largest possible
integer.
NOTE:
The digits cannot be split.
Example: 79 cannot be split as 9 first and 7 second.
Input Format
N - size of the array
'N' integer values
Output Format
Single integer
Sample Input 1
4
Sample Output 1
4321
 */