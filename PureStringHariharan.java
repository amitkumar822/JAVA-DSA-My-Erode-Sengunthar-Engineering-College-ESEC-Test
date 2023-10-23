package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class PureStringHariharan {
    static boolean isVowels(char ch){
        String str = "aeiou";
        return str.indexOf(ch) !=-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "abcaac";//3
        String str = sc.nextLine();//0
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()){
            if(isVowels(ch)){
                sb.append(ch);
            }
        }
        int len = sb.length();
        System.out.println(len);
    }
}

/*
Professor gave him a string s. He taught about pure string. Professor assigned an assignment to Hariharan. The
assignment is Hariharan needs to determine the length of the highest pure string which is a substring of s.
Note: Pure String is a string that only consists of vowels.
Input format
The input contains a string s.
Output format
The output prints an integer denoting the length of the highest pure substring, that is substring comprises only vowels.
For example:
Input
abcaac
bcd
Result
3
0
 */
