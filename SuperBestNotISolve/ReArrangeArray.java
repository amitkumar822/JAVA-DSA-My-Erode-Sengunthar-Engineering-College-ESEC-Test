package CollegeTest.SuperBestNotISolve;

import java.util.Arrays;
import java.util.Scanner;

public class ReArrangeArray {
    static void rearrangeArray(int[] num){
        Arrays.sort(num);
        int len = num.length;
        int[] result = new int[len];
        int left =0, right=len-1;

        for(int i=0; i<len; i++){
            if (i%2 == 0){
                result[i] = num[right];
                right--;
            }else {
                result[i] = num[left];
                left++;
            }
        }

        for (int i=0; i<len; i++){
            num[i] = result[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter "+size+" element : ");

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        rearrangeArray(num);
        for (int ans : num){
            System.out.print(ans+" ");
        }
    }
}
//input(size 5) 1 2 3 4 5 output 5 1 4 2 3
//input(size 7) 1 2 3 4 5 6 7  output 7 1 6 2 5 3 4