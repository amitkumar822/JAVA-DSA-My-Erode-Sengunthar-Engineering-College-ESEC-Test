package CollegeTest;

import java.util.Scanner;

public class MatrixElementSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int row=sc.nextInt();
        System.out.println("Enter col:");
        int col = sc.nextInt();

        int[][] num = new int[row][col];
        System.out.println("Enter element : ");
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                num[i][j]= sc.nextInt();
            }
        }

        //output this code
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int el = num[i][j];
                int ans = el*el;
                System.out.print(ans+" ");
            }
        }
    }
}
