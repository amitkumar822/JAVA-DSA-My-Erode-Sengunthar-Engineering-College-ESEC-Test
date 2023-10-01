package CollegeTest.A_NewPracticeTest.Test;

import java.util.Scanner;

public class ExtractTheSecondsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "Today the time is 09:11:33: check it out";
        StringBuilder sb = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        int last = sb.charAt(sb.length()-1)-'0';
        int second = sb.charAt(sb.length()-2)-'0';
        System.out.println(second+""+last);
    }
}
