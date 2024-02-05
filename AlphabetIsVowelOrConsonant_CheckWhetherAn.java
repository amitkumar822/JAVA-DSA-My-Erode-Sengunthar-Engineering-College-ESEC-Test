package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class AlphabetIsVowelOrConsonant_CheckWhetherAn {
    public static boolean isVowels(char ch){
        String str = "aeiouAEIOU";
        return str.indexOf(ch) != -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(isVowels(ch)){
            System.out.print(ch+" is a Vowel");
        }else {
            System.out.print(ch+" is a Consonant");
        }
    }
}

/*
Write a Program to check whether an alphabet t is vowel or consonant.
Sample Inputl:
Sample Output 1:
A is a Vowel
Sample Input 2:
x
Sample Output 2:
X is a Consonant
Sample Input3:
Sample Output3:
e is a Vowel
 */
