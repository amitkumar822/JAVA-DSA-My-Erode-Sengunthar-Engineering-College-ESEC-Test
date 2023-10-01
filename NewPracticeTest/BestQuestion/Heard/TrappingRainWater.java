package CollegeTest.A_NewPracticeTest.BestQuestion.Heard;

import java.util.*;

public class TrappingRainWater {
    public static void main(String[] args) {
        /*
        2
        4
        7 4 0 9
        3
        6 9 9
        output:
        10
        0
         */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Size of the array
            int[] heights = new int[N]; // Array elements

            for (int i = 0; i < N; i++) {
                heights[i] = scanner.nextInt();
            }

            int result = trap(heights);
            System.out.println(result);
        }

        scanner.close();
    }

    public static int trap(int[] heights) {
        int n = heights.length;
        if (n <= 2) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int waterTrapped = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] > heights[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = i - stack.peek() - 1;
                int boundedHeight = Math.min(heights[i], heights[stack.peek()]) - heights[top];
                waterTrapped += distance * boundedHeight;
            }
            stack.push(i);
        }

        return waterTrapped;
    }
}


/*
Given an array arro of N nan-negative integers representing height of blocks at index i as Ai where the width of each block is 1. Compute how much water can be trapped in between blocks after
raining.
Structure is like below:
LI
We can trap 2 units of water in the middle gap.
Input Format
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. Each test case contains an integer N denoting the size of the array, followed by
N space separated numbers to be stored in array.
Output Format
Output the total unit of water trapped in between the blocks.
1 100
3 107
O 108
Sample Input 1
2
4
3
699
Sample Output 1
10
 */