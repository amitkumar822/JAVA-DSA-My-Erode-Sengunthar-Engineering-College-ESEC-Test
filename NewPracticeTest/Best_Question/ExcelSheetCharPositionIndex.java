package CollegeTest.Best_Question;

import java.util.Scanner;

public class ExcelSheetCharPositionIndex {
    public static int findColumnNumber(String str){
        int len = str.length();
        int ans =0, pow =0;
        for (int i=len-1; i>=0; i--){
            char ch = str.charAt(i);
            int digit = (int)ch-65+1;
            ans += digit*Math.pow(26,pow);
            pow++;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Caps Alpha bet(A-Z) : ");
        String str = sc.nextLine();
        int ans = findColumnNumber(str);
        System.out.println(ans);

    }
}
