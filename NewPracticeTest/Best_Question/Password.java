package CollegeTest.Best_Question;

import java.util.Scanner;

public class Password {
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
//        int[] num = {1,22,123,4242,45,56}; //1 4 6 3 9 2
        System.out.println("Enter size");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter element : ");
        int[] num = new int[len];
        for (int i=0; i<len; i++){
            num[i]=sc.nextInt();
        }

        for (int i=0; i<len; i++){
            pSum(num[i]);
        }
    }
}

/*
size 6;
element : 1 22 123 4242 45 56
output : a46ci2
 */