package CollegeTest.S3Level2;

import java.util.Scanner;

public class MatrixMNArraytoConvert {

    public static void printMatrix(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(matrix[i][j]);
                if(j<n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "{{3,2,1,5},{9,1,3,0}}";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter(digit) the matrix in this form of {{a,b,c..},{d,e,f..},..");
//        String str = sc.nextLine();

        String[] rows = str.split("},\\s*\\{");
        int m = rows.length;
        int n = rows[0].split(",").length;

        int[][] matrix = new int[m][n];
        for (int i=0; i<m; i++){
            String[] rowValues = rows[i].replaceAll("[{\\s}]","").split(",");
            for (int j=0; j<n; j++){
                matrix[i][j] = Integer.parseInt(rowValues[j]);
            }
        }
        printMatrix(matrix);
    }
}
