package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class MiddleNumberDivisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int mid = len/2;
        char[] arr = str.toCharArray();
        if ((arr[mid]-'0')%5==0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

/*
Check if the middle number of a given 3 digit number is divisible by 5
For example:
Input Result
353 Yes
372 No
 */
