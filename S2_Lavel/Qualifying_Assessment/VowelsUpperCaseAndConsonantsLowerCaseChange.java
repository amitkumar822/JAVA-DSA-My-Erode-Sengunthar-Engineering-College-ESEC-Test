package CollegeTest.S2_Lavel.Qualifying_Assessment;

import java.util.Scanner;

public class VowelsUpperCaseAndConsonantsLowerCaseChange {

    static void printUpToLow(String str){
        for(char ch : str.toCharArray()){
            if(isVowel(ch)){
                String st = String.valueOf(ch).toUpperCase();
                System.out.print(st);
            }else {
                String st = String.valueOf(ch).toLowerCase();

                System.out.print(st);
            }
        }
    }
    static boolean isVowel(char ch){
        String st = "AEIOUaeiou";
        for (int i=0; i<st.length(); i++){
            if(st.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String str = "Hi Welcome to the show !ye7(nI)";
        //int t = sc.nextInt();
        //sc.nextLine();
        //for(int i=0; i<t; i++){
            //String str = sc.nextLine();
            printUpToLow(str);
        //}
    }
}

/*
output :- hI wElcOmE tO thE shOw !yE7(nI)

 */