package CollegeTest.A_NewPracticeTest.BestQuestion.Heard;
import java.util.Scanner;
public class MatrixSearchBiggerNM_matrixAndSmallerMM_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the larger NxN matrix
        System.out.print("Enter the size of the larger NxN matrix (N): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Input the larger NxN matrix
        System.out.println("Enter the larger NxN matrix:");
        int[][] largerMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                largerMatrix[i][j] = scanner.nextInt();
            }
        }

        // Input the size of the smaller MxM matrix
        System.out.print("Enter the size of the smaller MxM matrix (M): ");
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Input the smaller MxM matrix
        System.out.println("Enter the smaller MxM matrix:");
        int[][] smallerMatrix = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                smallerMatrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the smaller matrix can be found in the larger matrix
        boolean found = findMatrix(largerMatrix, smallerMatrix, n, m);

        if (found){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        scanner.close();
    }

    public static boolean findMatrix(int[][] largerMatrix, int[][] smallerMatrix, int n, int m) {
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j <= n - m; j++) {
                if (isSubMatrix(largerMatrix, smallerMatrix, i, j, m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSubMatrix(int[][] largerMatrix, int[][] smallerMatrix, int row, int col, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (largerMatrix[row + i][col + j] != smallerMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


/*
Given bigger NXN matrix and a smaller MxM matrix print TRUE if the smaller matrix can be found in the bigger matrix else print FALSE
Input Format
An NXN Matrix
An MxM Matrix
Output Format
true - if MxM is in NXN
false - if MxM not in NXN
Constraints
Sample Input 1
3
1
2
3
2
1
2
1
2
Sample Output 1
True
 */