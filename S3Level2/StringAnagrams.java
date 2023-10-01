package CollegeTest.S3Level2;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {
    static boolean isAnagrams(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String str = sc.nextLine();
            String[] word = str.split(" ");
            if(isAnagrams(word[0],word[1])){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
        sc.close();
    }
}
/*
1
SILENT LISTEN
True
 */