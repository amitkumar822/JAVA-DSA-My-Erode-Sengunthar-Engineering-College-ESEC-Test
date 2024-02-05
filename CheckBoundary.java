package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class CheckBoundary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=17 && num<=33){
            if(num==17 || num==33){
                System.out.println("boundary");
            }else {
                System.out.println("YES");
            }
        }else {
            System.out.println("NO");
        }
    }
}

/*
Write a prohram to Check if the given number is between 17 and 33 (both inclusive)
For example:
Input Result
17
22
50
boundary
YES
NO
 */