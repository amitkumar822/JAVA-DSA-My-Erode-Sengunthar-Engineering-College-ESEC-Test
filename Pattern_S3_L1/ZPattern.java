package CollegeTest.Pattern_S3_L1;

import java.util.Scanner;

public class ZPattern {
    public static void main(String[] args) {
        //Note only 3 & 4 z pattern logic not apply other i think
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if(i==1 || i==n){
                    System.out.print("* ");
                } else if (j==n-i+1 && n==3) {
                    System.out.print("*  ");
                } else if (i == 2 && n == 3) {
                    System.out.print("  ");
                } else if (n == 4 && i == 2 && j == n - i + 1) {
                    System.out.print(" * ");
                } else if (n == 4 && j == 3) {
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
