package CollegeTest.A_NewPracticeTest.BestQuestion.Heard;
import java.util.Scanner;
public class TrappingRainWater_TrappedHeightOfBlocks {
    public static void main(String[] args) {
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

        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (heights[left] < heights[right]) {
                if (heights[left] > leftMax) {
                    leftMax = heights[left];
                } else {
                    trappedWater += leftMax - heights[left];
                }
                left++;
            } else {
                if (heights[right] > rightMax) {
                    rightMax = heights[right];
                } else {
                    trappedWater += rightMax - heights[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
}

/*
Given an array arr[] of N non-negative integers representing height of blocks at index i as Ai where the width of each block is 1. Compute
how much water can be trapped in between blocks after raining.
Structure is like below:
We can trap 2 units of water in the middle gap.
Input Format
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. Each test case contains
an integer N denoting the size of the array, followed by N space separated numbers to be stored in array.
Output Format
Output the total unit of water trapped in between the blocks.
I < = T < = 100
3<= N <=10^7
O <=Ai<=10^8
Sample Input 1
2
4
3
7 4 0 9
3
6 9 9
Sample Output 1
10
0
 */