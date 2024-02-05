package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class KrishnaLovesCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, k = 0, sum = 0, s1 = 0, t, temp = 0, j;
        long c[] = new long[1000009];
        long s[] = new long[100009];
        t = sc.nextInt();
        for (int l = 0; l < t; l++)
        {
            n = sc.nextInt();
            for (i = 0; i < n; i++)
                c[i] = sc.nextLong();
            for (i = 0; i < n; i++) {
                for (j = i + 1; j < n; j++) { if (c[i] > c[j])
                {
                    temp = (int) c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
                }
            }
            sum = 0;
            k = 0;
            for (i = 0; i < n; i++)
            {
                sum = (int) (sum + c[i]);
                s[k] = sum;
                k++;
            }
            s1 = 0;
            for (i = 1; i < k; i++)
                s1 = (int) (s1 + s[i]);
            System.out.println(s1);
        }
    }
}


/*
* Krishna loves candies a lot, so whenever he gets them, he stores them so that he can eat them later whenever he wants to.
He has recently received N boxes of candies each containing Ci candies where Ci represents the total number of candies in the ith box. Krishna wants to store them in a single box. The only constraint is that he can
choose any two boxes and store their joint contents in an empty box only. Assume that there are infinite number of empty boxes available.
At a time he can pick up any two boxes for transferring and if both the boxes say contain X and Y number of candies respectively, then it takes him exactly X+Y seconds of time. As he is to eager to collect all of them
he has approached you to tell him the minimum time in which all the candies can be collected.
Sample Input 1
4
1234
Sample Output 1 :
19
Explanation
4 boxes, each containing 1, 2, 3 and 4 candies respectively.Adding 1 + 2 in a new box takes 3 seconds.Adding 3 + 3 in a new box takes 6 seconds.Adding 4 + 6 in a new box takes IO seconds.Hence total time taken is
19 seconds. There could be other combinations also, but overall time does not go below 19 seconds.
Input Format
• The first line of input is the number of test case T
• Each test case is comprised of two inputs
• The first input of a test case is the number of boxes N
• The second input is N integers delimited by whitespace denoting the number of candies in each box
Output Format
Print minimum time required, in seconds, for each of the test cases. Print each output on a new line.
Constraints
• 1 ? N? 10000
1 ? [Candies in each box] ? 100009
Sample Input
1
4
1 2 3 4
Sample Output
19
* */
