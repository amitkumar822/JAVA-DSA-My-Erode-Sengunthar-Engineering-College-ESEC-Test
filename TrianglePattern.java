import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k=0; k<t; k++) {
            int n = sc.nextInt();
            if(n!=0) {
                int max = Integer.MIN_VALUE;
                k = 1;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        max = Math.max(max, k++);
                    }
                }
                for (int i = n - 1; i >= 0; i--) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(max-- + " ");
                    }
                    System.out.println();
                }
            }else {
                System.out.println("Invalid Input");
            }
        }
    }
}

/*
1
3
output:-
6 5 4
3 2
1

 */
/*
Print the inverted triangle pattern.
Input Format
The first line of input is the integer T, denoting number of test cases. The first line of each test case is a number of rows
N.
Constraints
Output Format
For each test case, there is an output which generates the given pattern with the given number of rows.
Sample Input O
1
3
Sample Output O
654
32
1
Sample Input 1
1
Sample Output 1
Invalid Input
 */
