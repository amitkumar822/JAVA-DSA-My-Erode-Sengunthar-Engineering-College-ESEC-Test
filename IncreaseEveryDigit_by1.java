package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class IncreaseEveryDigit_by1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "abc103rad95ddkg3";
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (char ch : arr){
            if(Character.isDigit(ch)){
                int d = (ch-'0')+1;
                System.out.print(d);
            }else {
                System.out.print(ch);
            }
        }
    }
}

/*
Write a program to increase every digit by 1 in a given string. If it is not a digit then the character should not be modified
Input Format
abcl 23ddee456
Output Format
abc234ddee567
Sample Input O
Sample Output O
Illaaa22222bbbxxx111
 */
