package CollegeTest.S4_Level1.BestQuestion;

import java.util.Scanner;

public class PhoneKeyCharToDigit {
    static int keyCharSolved(String str){
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; //726
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            for (int j=0; j<kp.length; j++){
                String st = kp[j];
                int len = st.length();
                for(int k=0; k<len; k++){
                    if(str.charAt(i) == st.charAt(k)){
                        sb.append(j);
                    }
                }
            }
        }
        String st = sb.toString();
        int res = Integer.parseInt(st);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test case : ");
        int test = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter "+test+" char ");
        for(int i=0; i<test; i++){
            String str = sc.nextLine(); //ram
            System.out.println(keyCharSolved(str));
        }
    }
}

/*
Enter test case :
2
Enter 2 char
ram
726
mohan
66426
 */
/* ---------------------------------------------------------------------------------------- */

/* QUESTION:-
You are given a string S of alphabet characters and the task is to find its matching decimal representation as on a mobile phone's numeric keypad. Output the decimal representation corresponding to the string For ex: if you are given "amazon" then its corresponding decimal

Finish attem

representation will be 262966.

Input

The first line of input contains an integer T denoting the number of test cases. Each test case consists of a single line containing a string

Output

For each test case, print in a new line, the corresponding decimal representation of the given string.

Constraints.

1 <= T <= 100

1 <= length of String <= 100

Sample Input 1

2

ram

sita

Sample Output 1

726

7482

Sample Input 2

2

king

queen

Sample Output 2

5464

78336
 */