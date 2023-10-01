package CollegeTest.Pattern_S3_L1;

import java.util.Scanner;

public class CharReverse_J_to_A_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        char ch = 65;

        String[][] num = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = " ";
            }
            for (int j = n - 1; j >= i; j--) {
                String st = String.valueOf(ch);
                num[i][j] = st;
                ch++;
            }
        }
        System.out.println(num.length);

        for (int i = n - 1; i >= 0; i--) {  // Fix the loop variable here
            for (int j = 0; j < n; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
          U
        T S
      R Q P
    O N M L
  K J I H G
F E D C B A
 */