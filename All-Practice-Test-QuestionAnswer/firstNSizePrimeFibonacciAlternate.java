package CollegeTest;

import java.util.Scanner;

public class firstNSizePrimeFibonacciAlternate {

    static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    //alternate program(marge)
    static void alternateMarge(int[] arr1,int[] arr2, int len1, int len2, int[] arr3){
        int i=0,j=0,k=0;

        //traverse both array
        while (i<len1 && j<len2){
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }

        //store remaining element of first array
        while (i<len1){
            arr3[k++]=arr1[i++];
        }

        //store remaining element of second array
        while (i<len2){
            arr3[k++]=arr2[i++];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.MAX_VALUE;
        System.out.println("Enter size :");
        int size = sc.nextInt();
        int[] num1 = new int[size];
        // prime program
        int count =0;
        int j=0;
        for (int i=1; i<num; i++){
            if (isPrime(i)){
                count++;
                num1[j] =i;
                j++;
                if(count==size){
                    break;
                }
            }
        }


        //fibonacci program
        System.out.println();
        int[] num2 = new int[size];
        int a=0,b=1;
        num2[0] = a;
        num2[1] = b;
        int ct =2;
        for(int i=2; i<num; i++){
            ct++;
            int c = a+b;
            num2[i]=c;
            if (ct == size){
                break;
            }
            a=b;
            b=c;
        }


        //Marge alternate
        int len1 = num1.length;
        int len2 = num2.length;
        int[] arr = new int[len1+len2];

        alternateMarge(num1,num2,len1,len2,arr);
        for (int ans : arr){
            System.out.print(ans+" ");
        }

    }
}

/*input(size)=7, output 2 0 3 1 5 1 7 2 11 3 13 5 17 8  */
/*input =5, output 2 0 3 1 5 7 2 11 3  */


/* Question:-
Given a number print the first N prime numbers and the Fibonacci of the number.

Input Format

A number N.

Constraints

1

Output Format

A List of numbers where it is alternating between prime and fibonacci.

Sample Input O

7

Sample Output 0

20 3 15 17 2 11 3 13 5 17 8

Explanation 0

2, 3, 5, 7, 11, 13, 17 are the first 7 prime numbers 0,1,1,2,3,5,8 are the first Fibonacci numbers The output is alternatively being printed follows: 20315172 113 13 5 178   */
