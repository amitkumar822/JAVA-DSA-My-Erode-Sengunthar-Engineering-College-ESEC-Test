package CollegeTest.Pattern_S3_L1;

import java.util.Scanner;

public class NumberSqDecreaseEveryLine443322type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            int num = n;
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print(num);
                if (i > 0 && j < i) {
                    num--;
                }
                if (j >= 2 * n - 2 - i) {
                    num++;
                }
            }
            System.out.println();
        }
    }
}

/*
Enter a number: 5
555555555
544444445
543333345
543222345
543212345
 */