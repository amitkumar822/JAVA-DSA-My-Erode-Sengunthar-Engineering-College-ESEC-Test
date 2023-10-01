package CollegeTest;

import java.util.Scanner;
public class MaximumSumOfKConsecutive {
    static int calMaxKTime(int[] arr, int k){
        int max=0;
        int sum =0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        for (int i=k; i<arr.length; i++){
            sum += arr[i]-arr[i-k];
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arr[] = {100,200,300,400}; //700
//        int size = arr.length;
//        int k=2;
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(len > k){
            int result = calMaxKTime(arr,k);
            System.out.print(result);
        }else {
            System.out.println("Invalid");
        }
    }
}
//some hidden test case not pass

/*
Given an array of integers of size 'n', Our aim is to calculate the maximum sum of 'k' consecutive
elements in the array.
nput : arro = {100, 200, 300, 400}, k = 2
Output : 700
Input : arro = {1, 4, 2, 10, 23, 3, 1, O, 20}, k = 4
Output : 39
We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
Input : arro = {2, 3}, k = 3
Output : Invalid
There is no subarray of size 3 as size of whole array is 2.
 */