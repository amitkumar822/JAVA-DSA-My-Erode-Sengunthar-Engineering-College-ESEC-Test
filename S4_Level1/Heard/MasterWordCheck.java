package CollegeTest.S4_Level1.Heard;

import java.util.Scanner;

public class MasterWordCheck {
    private static boolean isMasterWord(String str){
        int len = str.length();
        if(len < 7) return false;

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char lastChar = str.charAt(len-1);

        if(Character.isDigit(firstChar) || isVowel(secondChar) || !isBracket(lastChar)){
            return false;
        }

        int idxN1 = 2;
        while (idxN1 < len && Character.isDigit(str.charAt(idxN1))){
            idxN1++;
        }
        if(idxN1 == 2){
            return false;
        }

        int CoutVow =0;
        while (idxN1 < len && isVowel(str.charAt(idxN1))){
            CoutVow++;
            idxN1++;
        }

        if(CoutVow == 0){
            return false;
        }

        int idx2N = idxN1;
        while (idx2N < len && Character.isDigit(str.charAt(idx2N))){
            idx2N++;
        }

        if(idx2N == idxN1){
            return false;
        }
        if(idx2N != len-1) {
            return false;
        }
        return true;
    }

    private static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    private static boolean isBracket(char c){
        return "[{]}".indexOf(c) != -1;
    }

    private static int extractNum1(String str){
        int idx =2;
        while (idx < str.length() && Character.isDigit(str.charAt(idx))){
            idx++;
        }
        return Integer.parseInt(str.substring(2,idx));
    }

    private static int extractNum2(String str){
        int idx = str.length()-2;
        while (idx>=0 && Character.isDigit(str.charAt(idx))){
            idx--;
        }
        return Integer.parseInt(str.substring(idx+1,str.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word like:- KW2343E2342[");
        String str = sc.nextLine();
        sc.close();
        int num1 = extractNum1(str);
        int num2 = extractNum2(str);

        if(isMasterWord(str)){
            System.out.println("YES "+(num1+num2));
        }else {
            System.out.println("NO "+(num1-num2));
        }
    }
}
/*
input :- KW2343E2342[
output:- YES 4685

 */

/*-------------------------------------------------------------- */
/*QUESTION:-

For a given word check if it is a MASTER word

A master word is a word which follows the following rules:

First character is not a digit

Second character is not a vowel

Next there is a number which could be one or more digits (NUM1)

Next is one or more upper case VOWELS

Next is a number which has one more digits (NUM2)

Last character is a [ or {or} or ]

If it matches the above rules print

YES followed by NUM1+NUM2

If it does not match any of the above rules print

NO followed by NUM1-NUM2

For example:

Input

Result

KW2343E2342

YES 4685

KE2343E2342 NO 1

3K23E234

NO -211

KW17EAT01(

YES 18
 */