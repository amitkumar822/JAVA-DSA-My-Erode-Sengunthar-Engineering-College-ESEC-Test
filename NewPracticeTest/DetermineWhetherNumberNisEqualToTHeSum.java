package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class DetermineWhetherNumberNisEqualToTHeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int r=0;r<test; r++) {
            int sum=0;
            int n = sc.nextInt(); // yes
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if(sum==n){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}

/*
That is Perfection
Write a program to determine whether a number N is equal to the sum of its proper positive divisors(excluding the number itself).
Input format:
First line number of test cases followed by the inputs(N).
Output format:
Print YES rif N is equal to the sum of its proper positive divisors else print NO.
Constraints:
100
Sample Input
3
6
5
28
Sample output:
YES
NO
YES
Explanation:
6=1+2+3,so it is perfect
5=1,so it is not perfect
28=1 +2+4+7+ 14,so it is perfect
 */
