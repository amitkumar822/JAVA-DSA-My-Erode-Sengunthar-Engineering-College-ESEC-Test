package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class UniqueElementProblemsMaximize {
    public static void uniqueElel(int[] arr){
        int len = arr.length;
        int add = arr[len-2];
        int k = 1;
        int first = arr[len-1]*k+add;
        int sum = 0;
        for (int i=0; i<len-1; i++){
            k++;
            sum += (arr[i]*k+add);
        }
        int result = (first+(sum));
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<t; i++){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int j=0; j<len; j++){
                arr[j] = sc.nextInt();
            }
            uniqueElel(arr);
        }
    }
}

/*
Unique element problems
You are given an array Array of size N.
Perform the following operations to delete the array so that you can maximize the value of a unique array element:
For any turn i(ls is either of the end elements.
Before deleting the array element at index K, it contributes the value to the unique value where turnr is the number of the turn in which you are performing the operation
SVi is a sustaining value that is the value of the maximum element present in the array before the ithturn is made
Write a program to print the maximum unique value that can be obtained after the array ids completely deleted
INPUT FORMAT:
The first line:T denoting the number of test cases, followed by size of array and elements of array
Constraints:
ISTSIO
1 S Arris 106
Explanation:
INPUT:
1
5
54362
OUTPUT:
96
The order we follow to detroy the given array is:
Now 8+16+18+18+36=96
 */
