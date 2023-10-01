package CollegeTest.S2_Lavel.Qualifying_Assessment;

import java.util.Scanner;

public class MillitaryTime {
    static String ConvertTime(int h,int m,int sec,String am_pm){
        if(am_pm.equalsIgnoreCase("pm")&& h!=12){
            h +=12;
        } else if (am_pm.equalsIgnoreCase("am") && h == 12) {
            h =0;
        }
        return String.format("%02d:%02d:%02d",h,m,sec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int sec = sc.nextInt();
        String am_pm = sc.next();
        String res = ConvertTime(h,m,sec,am_pm);
        System.out.println(res);
    }
}
/*
10
55
16
pm
22:55:16
 */