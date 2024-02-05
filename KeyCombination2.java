package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class KeyCombination2 {
    static void combination(String digit,String[] kp,String res){
        if(digit.length() == 0){
            System.out.print(res+" ");
            return;
        }
        int currNum = digit.charAt(0)-'0';
        String currChoice = kp[currNum];
        for(int i=0; i<currChoice.length(); i++){
            combination(digit.substring(1),kp,res+currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String digit = "23";
        String digit = sc.next();
        int d = Integer.parseInt(digit);
        if(d !=1) {
            String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            combination(digit, kp, "");
        }else {
            System.out.println("No Combination of Strings");
        }
    }
}


/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
