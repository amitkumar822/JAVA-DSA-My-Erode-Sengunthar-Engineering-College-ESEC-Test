package CollegeTest.Pattern_S3_L1.Best;

import java.util.Scanner;
public class TrignolReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n=4;
        int p=1;
        int[][] num = new int[n][n];
        for(int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                num[i][j] = p;
                p++;
            }
        }

        //upper part
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        //lower part
        for (int i=n-1; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
1
2 3
4 5 6
7 8 9 10
7 8 9 10
4 5 6
2 3
1
 */