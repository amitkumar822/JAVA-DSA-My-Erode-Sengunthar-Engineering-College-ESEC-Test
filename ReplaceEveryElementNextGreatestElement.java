package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class ReplaceEveryElementNextGreatestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Modify the array
        modifyArray(arr);

        // Display the modified array
        System.out.println("The modified array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        scanner.close();
    }

    private static void modifyArray(int[] arr) {
        int n = arr.length;

        // Replace each element with the next greatest element on its right side
        for (int i = 0; i < n - 1; i++) {
            int nextGreatest = arr[i + 1];
            for (int j = i + 2; j < n; j++) {
                if (arr[j] > nextGreatest) {
                    nextGreatest = arr[j];
                }
            }
            arr[i] = nextGreatest;
        }

        // Replace the last element with -1
        arr[n - 1] = -1;
    }
}

/*
Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array. Since there
is no element next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5,
Sample Input
4
1
2
3
4
Sample Output
The modified array:
444 -1
 */