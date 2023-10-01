package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class MaximumSumOfTriplet {
    public static int findMaxTripletSum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int j = 1; j < n - 1; j++) {
            int maxLeft = Integer.MIN_VALUE;
            int maxRight = Integer.MIN_VALUE;

            for (int i = 0; i < j; i++) {
                if (arr[i] < arr[j]) {
                    maxLeft = Math.max(maxLeft, arr[i]);
                }
            }

            for (int k = j + 1; k < n; k++) {
                if (arr[j] < arr[k]) {
                    maxRight = Math.max(maxRight, arr[k]);
                }
            }

            if (maxLeft != Integer.MIN_VALUE && maxRight != Integer.MIN_VALUE) {
                int currentSum = maxLeft + arr[j] + maxRight;
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the positive integers in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxTripletSum = findMaxTripletSum(arr);
        System.out.println("Maximum triplet sum: " + maxTripletSum);

        scanner.close();
    }
}
