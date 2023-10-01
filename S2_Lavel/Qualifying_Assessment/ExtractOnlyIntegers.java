package CollegeTest.S2_Lavel.Qualifying_Assessment;

import java.util.Scanner;

public class ExtractOnlyIntegers {
    static String extract(String str){
        StringBuilder sb = new StringBuilder();
        boolean nbStr = false;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
                nbStr=true;
            } else if (nbStr) {
                sb.append(" ");
                nbStr=false;
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            String ans = extract(str);
            System.out.println(ans);
        }
    }
}
