package CollegeTest_BasicToIntermediate.A_A_SuperBestQuestionForMe;

import java.util.Scanner;

public class BinaryMatrix0sand1s_LargestRectangle {
    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    private static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            left[i] = i;
            while (left[i] > 0 && heights[i] <= heights[left[i] - 1]) {
                left[i] = left[left[i] - 1];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            right[i] = i;
            while (right[i] < n - 1 && heights[i] <= heights[right[i] + 1]) {
                right[i] = right[right[i] + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] + 1));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //[["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]] //result 6
        String[] Cwd = str.split("]");
        int col = Cwd.length; // 4
        String[] Rwd = Cwd[0].split(",");
        int row = Rwd.length;//5

        //t result = str. replace(/[^0-9]/g,"");
        String ss = str.replaceAll("[\\[\\,\\]]","").replaceAll("[\"\"]"," ").trim();
        String[] DWd = ss.split(" +");
        int idx = 0;
        char[] arr = new char[col*row];
        for (String D : DWd){
            char ch = D.charAt(0);
//            int digit = Integer.parseInt(D);
            arr[idx++] = ch;
        }
        idx =0;
        char[][] matrix = new char[col][row];
        for (int i=0; i<col; i++){
            for (int j=0; j<row; j++){
                matrix[i][j] = arr[idx++];
            }
        }

        int result = maximalRectangle(matrix);
        System.out.println("Largest rectangle containing only '1's area: " + result);
    }
}

/*
Given a rows
cols binary matrix filled with e's and I's, find the largest rectangle containing only
and return its areo.
Example 1:
Input: matrix =[["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
output : 6
 */