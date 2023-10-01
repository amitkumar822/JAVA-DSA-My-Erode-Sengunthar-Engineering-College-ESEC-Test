package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class FibonacciLastTwoDigitsFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 12; // 233-> 33
        int n = sc.nextInt();
        int a=0,b=1;
        int sum =1;
        int count = 1;
        for(int i=2; i<n*2; i++){
            count++;
            int c = a+b;
            sum = c;
            if(count==n){
                break;
            }
            a=b;
            b=c;
        }
        int d = sum%100;
        if(d>=0 && d<=9){
            System.out.print("0"+d);
        }else {
            System.out.print(d);
        }
    }
}

/*
input:    output:
  13        33
  12        44
  6         08
 */

/*
Given a number N. Find the last two digits of the Nth fibonacci number.
Note: If the last two digits are 02, return 2.
Example 1:
Input :
N = 13
Output :
33
Explanation
The 13th Fibonacci number is 233.
So last two digits are 3 and 3.

 */