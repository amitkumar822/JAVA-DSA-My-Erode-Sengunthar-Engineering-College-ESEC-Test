package CollegeTest_BasicToIntermediate;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionPivotValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
//        int[] arr = {9,12,3,5,14,10,10}; // 9 5 3 10 10 14 12
//        int[] arr = {7,3,8,4,7,1}; //4 3 1 8 7 7
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i]= sc.nextInt();
        }
        int pivot = sc.nextInt();
//        int pivot = 5;
        Arrays.sort(arr);
        StringBuilder pivLes = new StringBuilder();
        StringBuilder pivEqual = new StringBuilder();
        StringBuilder pivGre = new StringBuilder();
        for (int i=0; i<arr.length; i++){
            if(arr[i] < pivot){
                pivLes.append(arr[i]+" ");
            } else if (arr[i] == pivot) {
                pivEqual.append(arr[i]+" ");
            }else if (arr[i] > pivot){
                pivGre.append(arr[i]+" ");
            }
        }
//        System.out.println(pivLes+" : "+pivEqual+" : "+pivGre);

        int lenLes = pivLes.toString().trim().length(); //1 3 4
        int lenEq = pivEqual.toString().trim().length();//""
        int lenGr = pivGre.toString().trim().length(); //7 7 8

//        System.out.println(lenLes+" "+lenEq+" "+lenGr);

        if(lenLes>0){
            String[] ch = pivLes.toString().split(" +");
            for (int i=ch.length-1; i>=0 ; i--){
                System.out.print(ch[i]+" ");
            }
        }

        if(lenEq>0){
            String[] ch = pivEqual.toString().split(" +");
            for (int i=ch.length-1; i>=0 ; i--){
                System.out.print(ch[i]+" ");
            }
        }

        if(lenGr>0){
            String[] ch = pivGre.toString().split(" +");
            for (int i=ch.length-1; i>=0 ; i--){
                System.out.print(ch[i]+" ");
            }
        }
    }
}


/*
Partition the given array based on a pivot value.
Given a pivot x, and a list 1st, partition the list into three parts. The first part contains all elements in 1st that are less than x. The second part contains all elements in 1st that are equal to x. The third
part contains all elements in 1st that are larger than x Ordering within a part can be arbitrary. The algorithm should result in minimum swaps.
For example, given x = 10 and 1st = [9, 12, 3, 5, 14, 10, 10], one partition may be [9, 5, 3, 10, 10, 14, 12].
NOTE: Overall sorting and printing will not be the right answer since it does not take minimum swaps.
Input Format
First line of the input is an integer N which is the number of elements in the input array arr[].
Next N lines of input each contains an integer representing the elements arr[i].
Last line of input is a single integer which corresponds to the pivot value.
Output Format
Single line consisting of N space separated integers.
Constraints :
1 < = N <= 100
O < = arr[i) < = 10000
Sample Input
7
9
12
3
5
14
10
10
10
Sample Output
9 5 3 10 10 14 12
 */