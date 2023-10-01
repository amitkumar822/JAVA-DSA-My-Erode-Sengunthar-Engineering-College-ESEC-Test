package CollegeTest.SuperBestNotISolve;

import java.util.Scanner;

public class RotateKTimeArray {
    public static void RotateKTimeArrays(int[] num,int k){
        int len = num.length;
        k = k%len;
        reverse(num,0,len-1);
        reverse(num,0,k-1);
        reverse(num,k,len-1);
    }
    private static void reverse(int[] num, int start, int end){
        while (start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter "+size+" element(digit): ");
        for (int i=0; i<size; i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter K time rotate number: ");
        int k=sc.nextInt();
        RotateKTimeArrays(num,k);

        for (int res : num){
            System.out.print(res+" ");
        }
    }
}

//size 6, el-12 13 14 15 16 17 , rotate(k time) 3 output :-15 16 17 12 13 14