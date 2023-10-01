package CollegeTest.A_NewPracticeTest.BestQuestion;

import java.util.Scanner;

public class NumberToRomanConvert {
    public static String intToRoman(int num) {
        int[] intCode = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL" , "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< intCode.length; i++){
            while(num >= intCode[i]){
                sb.append(code[i]);
                num -= intCode[i];
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<test; i++){
            int digit = sc.nextInt();
            if(digit <=10000) {
                String result = intToRoman(digit);
                System.out.println(result);
            }else{
                System.out.println("Invalid");
            }
        }
    }
}
