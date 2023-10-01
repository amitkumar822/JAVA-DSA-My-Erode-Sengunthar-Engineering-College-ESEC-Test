package CollegeTest;

import java.util.Scanner;

public class MatrixDiagonalFinde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size : ");
        int row = sc.nextInt();
        System.out.println("Enter col size : ");
        int col = sc.nextInt();

        int [][] num = new int[row][col];
        System.out.println("Enter array element : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                num[i][j]=sc.nextInt();
            }
        }

        //output array
        System.out.println("Principal Diagonal : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (i==j){
                    System.out.print(num[i][j]+" ");
                }
            }
        }

        System.out.println();
        System.out.println("Anti Diagonal : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (i+j==row-1){
                    System.out.print(num[i][j]+" ");
                }
            }
        }
    }
}
