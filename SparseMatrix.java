package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int count=0;
        int[][] a = new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int size = rows * cols;

        //Count all zero element present in matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(a[i][j] == 0)
                    count++;
            }
        }

        if(count > (size/2))
            System.out.println("The given matrix is Sparse matrix");
        else
            System.out.println("The given matrix is not a Sparse matrix");
    }
}

/*
Write a program to read elements in a matrix and check whether matrix is Sparse matrix or not.
To check whether a matrix is sparse matrix we only need to check the total number of elements that are equal to zero.
The matrix is sparse matrix if T 2 ((m * n) / 2 ); where T defines total number of zero elements.
Example
Input
Input elements in matrix:
103
600
Output
The given matrix is Sparse matrix
sample
Input 1
33
103
600
Output 1
The given matrix is Sparse matrix
 */
