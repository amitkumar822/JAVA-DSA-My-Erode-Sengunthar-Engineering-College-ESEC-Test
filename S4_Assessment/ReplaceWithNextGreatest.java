package CollegeTest_BasicToIntermediate.S4_Assessment;

import java.util.Scanner;

public class ReplaceWithNextGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Replace elements with the next greatest element
        int maxRight = -1;  // Initialize the maximum element on the right to -1

        for (int i = n - 1; i >= 0; i--) {
            int currentElement = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, currentElement);
        }

        System.out.println("The modified array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}

/*
Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in
the array. Since there is no element next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5,
2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
Sample Input
4
1
2
3
4
Sample Output
The modified array:
4 4 4  -1
For example:
Input Result
4
1
2
3
4
The modified array:
4 4 4 -1
 */