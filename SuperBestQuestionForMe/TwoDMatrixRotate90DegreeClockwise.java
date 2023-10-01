package CollegeTest.A_A_SuperBestQuestionForMe;

import java.util.Scanner;

public class TwoDMatrixRotate90DegreeClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "[[5,1,9,11], [2,4,8,10], [13, 3, 6, 7], [15, 14, 12, 16]]";
//        String str = sc.nextLine();
        String st[] = str.split("]");
        int row=0;
        for (String rr : st){
            String[] cm = rr.split(",");
            for (String cn : cm){
                row++;
            }
            break;
        }

        String rp = str.replaceAll("[\\[\\]\\,]"," ").trim();
        String[] word = rp.split(" +");
        int len = word.length;
        int[] arr = new int[len];
        int idx=0;
        for(String rs:word){
            int d = Integer.parseInt(rs);
            arr[idx++]= d;
        }
        int[][] matrix = new int[row][row];
        idx=0;
        for(int i=0; i<row; i++){
            for (int j=0; j<row; j++){
                matrix[i][j]=arr[idx++];
            }
        }
        rotate(matrix);

        System.out.print("[");
        for (int i=0; i<row; i++){
            System.out.print("[");
            for (int j=0; j<row; j++){
                System.out.print(matrix[i][j]);
                if(j!=row-1){
                    System.out.print(",");
                }
            }
            if(i!=row-1){
                System.out.print("],");
            }else {
                System.out.print("]");
            }
        }
        System.out.print("]");
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}


/*
input:matrix=
[[5,1,9,11], [2,4,8,10], [13, 3, 6, 7], [15, 14, 12, 16]]
output:
[ [15, 13, 2, 5], [14,3,4,1],[12,6,8,9],[16, 7, 10, 11]]
 */