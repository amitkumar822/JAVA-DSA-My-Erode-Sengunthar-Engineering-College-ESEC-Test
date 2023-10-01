package CollegeTest.A_NewPracticeTest.BestQuestion;

import java.util.Scanner;
import java.util.Stack;

public class CheckIsValidParenthesis {
    static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else {
                if(st.empty()){
                    return false;
                } else if (c == '}' && st.peek() == '{') {
                    st.pop();
                }else if (c == ')' && st.peek() == '(') {
                    st.pop();
                }else if (c == ']' && st.peek() == '[') {
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<test; i++){
            String str = sc.nextLine();
            if(isValid(str)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}
