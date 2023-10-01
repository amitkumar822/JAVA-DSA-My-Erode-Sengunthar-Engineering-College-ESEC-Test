package CollegeTest.S4_Level1.Pattern;

import java.util.Scanner;

public class PatternStarCharacterNumberThreeFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n=5;

        for(int i=1; i<=n; i++){
            char ch = (char)('A'+i-1);
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
        //reverse
        int k=1;
        for(int i=n; i>=1; i--){
            int nb = n;
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(nb--);
            }
            for(int j=1; j<=1; j++){
                System.out.print(" ");
            }
            int r=k;
            for (int j=1; j<=i; j++){
                System.out.print(r);
                r+=2;
            }
            k +=2;
            System.out.println();
        }
    }
}
/*
    * A
   ** BC
  *** CDE
 **** DEFG
***** EFGHI
54321 13579
 5432 3579
  543 579
   54 79
    5 9
 */