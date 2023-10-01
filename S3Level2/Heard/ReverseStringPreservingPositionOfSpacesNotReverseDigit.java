package CollegeTest.S3Level2.Heard;

import java.util.Scanner;

public class ReverseStringPreservingPositionOfSpacesNotReverseDigit {
    static String reverseOnlyLetter(String str){
        char[] arr = str.toCharArray();
        int start=0,end= arr.length-1;

        while (start < end){
            if(!Character.isLetter(arr[start])) start++;
            else if(!Character.isLetter(arr[end])) end--;
            else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "I* Am Not String"; //output: g* ni rtS toNmAI
        String result = reverseOnlyLetter(str);
        System.out.println(result);
    }
}
//input : work while you work , output : krow uoyel ihw krow

/* QUESTION:-
Write a program to reverse a string with preserving the position of spaces. For example, if "I Am Not String" is the given string then the reverse of this string with preserving the position of spaces is "g ni rts toNmAl"

Input Format

3 work while you work ITVAC ROCKS Never believe a stranger

Output Format

krow uoyel ihw krow SKCOR CAVTI regna rtsaeve i lebreveN

Sample Input 0

3

work while you work

ITVAC ROCKS
 Nevers believe a stranger

Sample Output 0

know uoyel ihw know

SKCOR CAVTI

regnas rtsaeve i lebrevet


For example:

Input:

I* Am Not String
work while you work
g* ni rts toNmAI
krow uoyel thw know
 */