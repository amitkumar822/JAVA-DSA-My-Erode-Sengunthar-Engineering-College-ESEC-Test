package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class PrimeFibonacciAlternatingPrint2 {
    static boolean isPrime(int n){
        if(n < 2) return false;
        for (int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void alternative(int[] fibo, int[] pri){
        int len1 = fibo.length;
        int len2 = pri.length;
        int[] result = new int[len1+len2];
        int idx1 = 0;
        for (int i=0; i<len2; i++){
            result[idx1] = pri[i];
            idx1 +=2;
        }

        int idx2 = 1;
        for (int i=0; i<len2; i++){
            result[idx2] = fibo[i];
            idx2 +=2;
        }
        for (int res : result){
            System.out.print(res+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
//        int size = 7;
        //2 0 3 1 5 1 7 2 11 3 13 5 17 8

        //fibonacci
        int[] fibo = new int[size];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i=2; i<size; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        //prime
        int len = Integer.MAX_VALUE;
        int[] pri = new int[size];
        int count = 0;
        int idx = 0;
        for (int i=1; i<len; i++){
            if(isPrime(i)){
                count++;
                pri[idx++] = i;
                if(count==size) {
                    break;
                }
            }
        }
        alternative(fibo,pri);
    }
}

/*
Given a number print the first N prime numbers and the Fibonacci of the number.
Input Format
A number N.
Constraints
1
Output Format
A List of numbers where it is alternating between prime and fibonacci.
Sample Input O
7
Sample Output O
2031517 2 11 3 13 5 17 8
Explanation O
2, 3, 5, 7, 11, 13, 17 are the first 7 prime numbers 0,1,1,2,3,5,8 are the first Fibonacci numbers The output is alternatively
being printed as follows: 1 51 72 11 3 13 5 17 8
 */
