package CollegeTest.Pattern_S3_L1.Best;

import java.util.Scanner;

public class barfiOrDiamond_Star_AtoZ_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        int n = 4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            char ch = 65;
            for (int j=1; j<=i; j++){
                System.out.print(ch+++" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int k=1;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            char ch = 65;
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}

/*
   A1
  AB12
 ABC123
ABCD1234
****1234
 ***567
  **89
   *10
 */