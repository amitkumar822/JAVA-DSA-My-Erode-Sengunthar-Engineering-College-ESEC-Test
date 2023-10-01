package CollegeTest.A_NewPracticeTest.Test;

import java.util.Scanner;

public class MountainDefinitelyArray {
    static int findMountainPeak(int[] arr){
        int left =0;
        int right = arr.length-1;

        while (left<right){
            int mid = left+(right-left)/2;

            if(arr[mid] < arr[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
//        int[] arr= {0,1,0}; //1
//        int[] arr = {1,2,3,4,5,3,2}; //4
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        int peekIndex = findMountainPeak(arr);
        System.out.println(peekIndex);
    }
}
