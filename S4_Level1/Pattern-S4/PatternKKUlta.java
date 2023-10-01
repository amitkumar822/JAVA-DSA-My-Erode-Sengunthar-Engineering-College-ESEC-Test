package CollegeTest.S4_Level1.Pattern;

import java.util.Scanner;

public class PatternKKUlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 5;

        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*ZZ_StartingTimePr.Pattern Output:-
 ***** *****
 ****   ****
 ***     ***
 **       **
 *         *
 *         *
 **       **
 ***     ***
 ****   ****
 ***** *****
 */
