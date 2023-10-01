package CollegeTest.A_NewPracticeTest.BestQuestion.Heard;

import java.util.Scanner;
public class MinimumNumberJumps {
    public static void main(String[] args) {
        /*
        input
        1
        11
        1 3 5 8 9 2 6 7 6 8 9
        output 3
         */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt(); // Size of the array
            int[] arr = new int[n]; // Array to store jump values
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int minJumps = findMinimumJumps(arr);

            if (minJumps != Integer.MAX_VALUE) {
                System.out.println(minJumps);
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
        scanner.close();
    }

    public static int findMinimumJumps(int[] arr) {
        int n = arr.length;
        int[] jumps = new int[n]; // Array to store minimum jumps

        // Initialize jumps array with a large value
        for (int i = 0; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
        }

        jumps[0] = 0; // Minimum jumps to reach the first element is 0

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Check if it's possible to reach element i from element j
                if (j + arr[j] >= i && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                }
            }
        }

        // If the last element is not reachable, return IMPOSSIBLE
        if (jumps[n - 1] == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return jumps[n - 1];
    }
}

/*
Given an array of integers where each element represents the max number of steps that can be made forward from that element. The task is to find the minimum
number of jumps to reach the end of the array (starting from the first element). If an element is O, then cannot move through that element.
Input:
The first line contains an integer T, depicting total number of test cases. Then following T lines contains a number n denoting the size of the array. Next line contains the
sequence of integers all a2, an.
Output:
For each testcase, in a new line, print the minimum number of jumps. If answer is not possible print 'I-I "(without quotes).
Constraints:
1 100
1 •g N s 107
O ai 107
Example:
Input:
11
13589267689
Output:
3
Explanation:
First jump from 1st element, and we jump to 2nd element with value 3. Now, from here we jump to Sh element with value 9. and from here we will jump to last.
Sample Input
1
6
143267
Sample Output
2
 */
