package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class BinaryNumberDisplayed_correspondingDigitsEquivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
        String str1 = "6932";
        String str2 = "6832";
        String res = "";
        for (int i=0; i<str2.length(); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(c1==c2){
                res +=0;
            }else {
                res +=1;
            }
        }

        int decimal = Integer.parseInt(res,2);
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
    }
}

/*
Take input as two numbers. If the corresponding digits are equal answer should be 0 else the answer should be 1. Finally
the decimal equivalent of the binary number should be displayed
Input:
6932
6832
Output:
4
Explanation:
6 and 6 - the first digits are same - So it is 0
9 and 8 - the second digits are different - So it is 1
3 and 3 - 3rd digits are the same - So it is 0
2 and 2 - 4th digits are same - So it is 0
So 0100 is the digit - this in decimal is 4
Input:
932
821
Output:
7
 */
