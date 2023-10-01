package CollegeTest.S4_Level1.Pattern;

import java.util.Scanner;

public class BestPat_PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n=5;
        System.out.println("** Printing the pattern.. **");
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i+1;j++){
                System.out.print(" ");
            }
            int nb = 1;
            for (int j=0; j<=i; j++){
                System.out.print(nb+" ");
                nb = nb*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
/*
** Printing the pattern.. **
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 */