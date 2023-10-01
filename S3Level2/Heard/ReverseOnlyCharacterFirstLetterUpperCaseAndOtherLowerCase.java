package CollegeTest.S3Level2.Heard;

import java.util.Scanner;

public class ReverseOnlyCharacterFirstLetterUpperCaseAndOtherLowerCase {
    static String reversOnlyLetter(String str){
        char[] arr = str.toCharArray();
        int start =0,end=arr.length-1;
        while (start<end){
            if(!Character.isLetter(arr[start])) start++;
            else if(!Character.isLetter(arr[end])) end--;
            else{
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "I26i is not a digit 1234";  //output: I26i Si Ton A Tigid 1234

        String[] swd = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String st : swd){
            sb.append(reversOnlyLetter(st)+" ");
        }
        String sbStr = sb.toString();
        String[] wdSb = sbStr.split(" ");

        for (String rs : wdSb){
            int len = rs.length();
            String fs = String.valueOf(rs.charAt(0)).toUpperCase();
            System.out.print(fs);

            for(int i=1; i<len; i++){
                String result = String.valueOf(rs.charAt(i)).toLowerCase();
                System.out.print(result);
            }
            System.out.print(" ");
        }
    }
}

/*
Write a program to reverse the words in a sentence except the numeric.It should capitalize the first letter post reversal.

For example:

Input

Result

there are 26 alphabets in english Ereht Era 26 Stebahpla Ni Hsilgne

126t is not a digit 1234

T26i Si Ton A Tigid 1234

I
 */