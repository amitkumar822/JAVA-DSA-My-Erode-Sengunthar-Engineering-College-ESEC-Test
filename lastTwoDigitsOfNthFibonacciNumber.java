package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class lastTwoDigitsOfNthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 12;//233 //33
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n; i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        String digit = String.valueOf(dp[n]);
        int len = digit.length();
        if(len>=2){
            int l = digit.charAt(len-1)-'0';
            int sl = digit.charAt(len-2)-'0';
            System.out.print(sl+""+l);
        }else {
            int f = digit.charAt(len-1)-'0';
            if(f==2){
                System.out.print(f);
            }else {
                System.out.print("0"+f);
            }
        }
    }
}

/*
Given a number N. Find the last two digits of the Nth fibonacci number.
Note: If the last two digits are 02, return 2.
Example 1:
Input :
N = 13
Output :
33
Explanation :
The 13th Fibonacci number is 233.
So last two digits are 3 and 3.
For example:
Input Result:-
13
12
6
output:-
33
44
08
 */
