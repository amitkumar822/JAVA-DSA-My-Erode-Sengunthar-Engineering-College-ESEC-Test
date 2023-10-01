package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class PasswordPIN {
    static void pSum(int nums){
        int num = repr(nums);
        int s =0;
        while (num > 0){
            int rd = num%10;
            s += rd;
            num /=10;
        }
        if(s%2==0){
            System.out.print(s);
        }else {
            String[] alp = {"a","b","c","d","e","f","g","h","i"};
            for (int i=0; i< alp.length; i++){
                if(s==i+1){
                    System.out.print(alp[i]);
                }
            }
        }
    }
    static int repr(int ns){
        int n = againSum(ns);
        int sm = 0;
        while (n>0){
            int rd = n%10;
            sm +=rd;
            n /=10;
        }
        return sm;
    }

    static int againSum(int n){
        int sm = 0;
        while (n>0){
            int rd = n%10;
            sm +=rd;
            n /=10;
        }
        return sm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        int len = word.length;
        int[] num = new int[len];
        int idx=0;
        for (String wd : word){
            num[idx++] = Integer.parseInt(wd);
        }

        for (int i=0; i<len; i++){
            pSum(num[i]);
        }
    }
}
