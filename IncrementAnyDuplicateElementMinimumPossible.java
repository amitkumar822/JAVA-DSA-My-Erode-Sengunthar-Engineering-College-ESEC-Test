package CollegeTest_BasicToIntermediate;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class IncrementAnyDuplicateElementMinimumPossible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array elements
        System.out.println("Enter the array elements separated by space:");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Calculate and print the minimum possible sum
        int minSum = getMinimumUniqueSum(arr);
        System.out.println("Minimum possible sum: " + minSum);

        scanner.close();
    }

    private static int getMinimumUniqueSum(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        int minSum = 0;

        for (int num : arr) {
            while (uniqueElements.contains(num)) {
                num++; // Increment duplicate elements
            }

            uniqueElements.add(num);
            minSum += num;
        }

        return minSum;
    }
}


/*
Given an array,increment any duplicate elements until all elements are unique. The array sum must be minimum possible and print the
minimum possible sum as output.
Explanation:
Minimum arr
and its element sum to the minimum value of 3+2+1+4+7=17.

input:
3 2 1 4 7
output 17
 */