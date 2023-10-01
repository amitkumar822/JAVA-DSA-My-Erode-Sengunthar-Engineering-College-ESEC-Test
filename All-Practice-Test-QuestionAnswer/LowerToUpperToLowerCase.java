package CollegeTest;

import java.util.Scanner;

public class LowerToUpperToLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.nextLine();

        StringBuffer newStr = new StringBuffer(str);

        for (int i=0; i<str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                newStr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            } else if (Character.isUpperCase(str.charAt(i))) {
                newStr.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(n);
        System.out.println(newStr);
    }
}
