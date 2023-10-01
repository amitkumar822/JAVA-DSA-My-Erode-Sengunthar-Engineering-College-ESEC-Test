package CollegeTest.S2_Lavel;

import java.util.Scanner;

public class RotateArrayKTime {
    public static void rotateArray(int[] num,int k){
        k = k% num.length;
        reverse(num,0,num.length-1);
        reverse(num,0,k-1);
        reverse(num,k,num.length-1);
    }

    private static void reverse(int[] num,int st,int end){
        while (st<end){
            int temp = num[st];
            num[st] = num[end];
            num[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] num = {1,2,3,4}; // 2 3 4 1
        int k=3;
        rotateArray(num,k);
        for (int res : num){
            System.out.print(res+" ");
        }
    }
}
