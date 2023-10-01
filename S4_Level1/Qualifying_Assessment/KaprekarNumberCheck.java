package CollegeTest.S4_Level1.Qualifying_Assessment;

import java.util.Scanner;

public class KaprekarNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n,sum=0;
        if(n>0){
            double sq = Math.pow(temp,2);
            while (sq >0){
                double dig = sq%100;
                sum += dig;
                sq /=100;
            }
            if(sum==temp){
                System.out.println("Kaprekar Number");
            }else {
                System.out.println("Not a Kaprekar Number");
            }
        }else {
            System.out.println(-1);
        }
    }
}
/*
45
Not a Kaprekar Number
 */
/*
13
Not a Kaprekar Number
 */
/*
-65
-1
 */