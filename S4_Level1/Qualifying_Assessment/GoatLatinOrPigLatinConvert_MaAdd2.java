package CollegeTest.S4_Level1.Qualifying_Assessment;

import java.util.Scanner;

public class GoatLatinOrPigLatinConvert_MaAdd2 {
    static void CheckFirstCapitalAddMa(String str, int count){
        StringBuilder sb = new StringBuilder();
        char first = str.charAt(0);
        if (isVowel(first)) {
            sb.append(str+"ma");
        }else{
            String res = str.substring(1,str.length());
            sb.append(res+str.charAt(0)+"ma");
        }
        for (int i=0; i<count; i++){
            sb.append("a");
        }
        sb.append(" ");
        System.out.print(sb.toString());
    }
    static boolean isVowel(char ch){
        String vowel = "AEIOUaeiou";
        int len = vowel.length();
        for (int i=0; i<len; i++){
            if(vowel.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "I speak Goat Latin";
        // Imaa peaksmaaa oatGmaaaa atinLmaaaaa
        String str = sc.nextLine();
        int count=1;
        String[] wd = str.split(" +");
        for (String st : wd){
            CheckFirstCapitalAddMa(st,count++);
//            count++;
        }
    }
}
