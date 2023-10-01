package CollegeTest.A_A_SuperBestQuestionForMe;

import java.util.Scanner;

public class Palindrome_SumNotAPalindromeRepeatTheProcedureUntil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int rev = reverseNumber(number);
        if(rev != number) {
            int steps = -1;
            while (!isPalindrome(number)) {
                int reversedNumber = reverseNumber(number);
                System.out.println(number+" + "+reversedNumber+" = "+(number+reversedNumber));

                number += reversedNumber;
                steps = number;
            }
            System.out.println(steps+" is a palindrome");
        }else {
            System.out.println("Given Number is already a palindrome");
            System.out.println(rev+" is a palindrome");
        }

        //System.out.println("Palindrome found after " + steps + " steps: " + number);
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}

/*
1421
1421+1241=2662
2662 is a palindrome
------------------

1221
Given Number is already a palindrome
1221 is a palindrome
 */

/*------------------------------------------------------------*/

/*
Take number from the user, reverse it and add it to itself. If the sum is not a palindrome then repeat the
procedure until you get a palindrome.
For example, If 7325 is input number, then
7325 (Input Number) + 5237 (Reverse Of Input Number)
12562 + 26521 = 39083
39083 + 38093 = 77176
77176 + 67177
= 144353
144353 + 353441 = 497794 (Palindrome)
= 12562
In this particular case, we got a palindrome (497794) after 5th addition. This method gives palindrome in
few steps for almost all of the integers.
Sample Input 1
1221
Sample Output 1
Given Number is already a palindrome
1221 is a palindrome
Sample Input 2
1421
Sample Output 2
1421 + 1241
= 2662
2662 is a palindrome
 */