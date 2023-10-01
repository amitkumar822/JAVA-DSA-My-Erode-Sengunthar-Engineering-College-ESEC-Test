package CollegeTest.S4_Level1;

import java.util.Scanner;

public class ReverseOnlyVowels {
    static boolean isVowel(char ch){
        String str = "AEIOUaeiou";
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "hello"; //holle
//        String str = "test";
//        String str = "itvac";//atvic
        String str = sc.nextLine();
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++){
            if(isVowel(str.charAt(i))){
                sb.append(i);
            }
        }


        if(sb.length()>1){
            int f = sb.charAt(0)-'0';
            int l = sb.charAt(1)-'0';
            char[] arr = str.toCharArray();

            char temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;

            for (char ch : arr){
                System.out.print(ch);
            }
        }else {
            System.out.print(str);
        }
    }
}
