package CollegeTest.A_A_SuperBestQuestionForMe;

import java.util.Scanner;

public class Spiral2DMatrix_AntiClockWise {
    public static void anticlockwiseSpiral(int[][] metrix, int startRow,
                                           int startCol, int endRow, int endCol, int element)
    {
        // Top to bottom direction
        for (int i = startRow; i <= endRow &&
                element > 0; ++i, element--)
        {
            System.out.print("  " + metrix[i][startRow]);
        }
        // Left to right direction
        for (int i = startRow + 1; i <= endCol &&
                element > 0; ++i, element--)
        {
            System.out.print("  " + metrix[endRow][i]);
        }
        // Bottomt to top direction
        for (int i = endRow - 1; i > startRow &&
                element > 0; --i, element--)
        {
            System.out.print("  " + metrix[i][endCol]);
        }
        // Bottom to top direction
        for (int i = endCol; i > startCol &&
                element > 0; --i, element--)
        {
            System.out.print("  " + metrix[startRow][i]);
        }
        if (startRow + 1 <= endRow - 1 && element > 0)
        {
            // Recursive call
            anticlockwiseSpiral(metrix, startRow + 1, startCol + 1,
                    endRow - 1, endCol - 1, element);
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        int[][] matrix = new int[row][col];
//
//        for(int i=0; i<row; i++){
//            for (int j=0; j<col; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }

//         Matrix elements
        int [][]matrix = {
                {1 ,  2 ,  3 ,  4 ,  5 ,  6} ,
                {22 , 23 , 24 , 25 , 26 , 7} ,
                {21 , 36 , 37 , 38 , 27 , 8} ,
                {20 , 35 , 42 , 39 , 28 , 9} ,
                {19 , 34 , 41 , 40 , 29 , 10} ,
                {18 , 33 , 32 , 31 , 30 , 11} ,
                {17 , 16 , 15 , 14 , 13 , 12} ,
        };
//         Get the size of matrix element
        int row = matrix.length;
        int col = matrix[0].length;
        // Get number of element
        int element = row * col;
        // Print result
        anticlockwiseSpiral(matrix, 0, 0,
                row - 1, col - 1, element);
    }
}
