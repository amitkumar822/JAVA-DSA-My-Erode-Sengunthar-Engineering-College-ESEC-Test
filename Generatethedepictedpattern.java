package CollegeTest_BasicToIntermediate.S2_Lavel.Pattern;

import java.util.Scanner;

public class Generatethedepictedpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Generate the pattern
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int min = Math.min(Math.min(i, j), Math.min(2 * n - i, 2 * n - j));
                System.out.print((n - min)+1 + " ");
            }
            System.out.println();
        }
    }
}

/*
Develop the code to generate the depicted pattern below
Sample Input
5
 */
/*

Enter a number: 5
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
 */
