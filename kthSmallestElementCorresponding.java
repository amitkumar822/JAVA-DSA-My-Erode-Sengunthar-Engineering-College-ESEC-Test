package CollegeTest_BasicToIntermediate;

import java.util.Arrays;
import java.util.Scanner;

public class kthSmallestElementCorresponding {
    static int kthSmallestEl(int[] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthSmallestEl(arr,k));
    }
}

/*
Find the k-th smallest element
find kth smallest element in an unsorted array. You are given an unsorted array of numbers and k, you need to nd the kth smallest number in
the array.
Sample input 6 7 104 3 20 15
3
Sample output 6
Input Format
N - size of the array 'N' integer values k - smallest number corresponding to the index in ascending order.
Constraints
Output Format
Single integer from the array which is the unique number
Sample Input O
6
7 10 4 3 20 15
3
Sample Output O
7
 */