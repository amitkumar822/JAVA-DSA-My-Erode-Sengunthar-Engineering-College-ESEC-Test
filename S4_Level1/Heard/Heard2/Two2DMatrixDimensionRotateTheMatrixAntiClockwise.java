package CollegeTest.S4_Level1.Heard.Heard2;
import java.util.*;
public class Two2DMatrixDimensionRotateTheMatrixAntiClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int R = sc.nextInt();

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[][] rotatedMatrix = rotateMatrix(matrix, M, N, R);
        printMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrix(int[][] matrix, int M, int N, int R) {
        int minDim = Math.min(M, N);
        int layers = minDim / 2;

        int[][] rotatedMatrix = new int[M][N];

        for (int layer = 0; layer < layers; layer++) {
            int effectiveRotations = R % (2 * (M + N - 4 * layer) - 4);

            int totalElements = 2 * (M - 2 * layer) + 2 * (N - 2 * layer) - 4;
            effectiveRotations = effectiveRotations % totalElements;

            int[] elements = new int[totalElements];
            int index = 0;

            // Copy top row
            for (int j = layer; j < N - layer; j++) {
                elements[index++] = matrix[layer][j];
            }

            // Copy right column
            for (int i = layer + 1; i < M - layer; i++) {
                elements[index++] = matrix[i][N - layer - 1];
            }

            // Copy bottom row
            for (int j = N - layer - 2; j >= layer; j--) {
                elements[index++] = matrix[M - layer - 1][j];
            }

            // Copy left column
            for (int i = M - layer - 2; i > layer; i--) {
                elements[index++] = matrix[i][layer];
            }

            index = 0;

            // Update the rotated matrix
            // Copy top row
            for (int j = layer; j < N - layer; j++) {
                rotatedMatrix[layer][j] = elements[(index + effectiveRotations) % totalElements];
                index++;
            }

            // Copy right column
            for (int i = layer + 1; i < M - layer; i++) {
                rotatedMatrix[i][N - layer - 1] = elements[(index + effectiveRotations) % totalElements];
                index++;
            }

            // Copy bottom row
            for (int j = N - layer - 2; j >= layer; j--) {
                rotatedMatrix[M - layer - 1][j] = elements[(index + effectiveRotations) % totalElements];
                index++;
            }

            // Copy left column
            for (int i = M - layer - 2; i > layer; i--) {
                rotatedMatrix[i][layer] = elements[(index + effectiveRotations) % totalElements];
                index++;
            }
        }

        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
You are given a 2D matrix, a, of dimension MXN and a positive integer R. You have to rotate the matrix R times and print the resultant matrix. Rotation should be in anti-clockwise direction. Rotation of a 4x5 matrix is represented by the following figure. Note that in one rotation, you have to

shift elements by one step only (refer sample tests for more clarity).

a11-a12-a13-a14-a15

a21 a22-a23-a24 a25

a31 a32-a33-a34 a35

a41-a42-a43-a44-a45

Example:

First line contains three space separated integers, M,N and R, where M is the number of rows, N is the number of columns in matrix, and R is the number of times the matrix has to be rotated. Then M lines follow, where each line contains N space separated positive integers. These M lines represent the matix.In output print rotated matrix. Sample:

Input:

2 3 2

1 2 3

4 5 6

Output:

3 6 5

2 1 4

For example:

Input

4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Result
2 3 4 8

1 7 11 12

5 6 10 16

9 13 14 15
 */