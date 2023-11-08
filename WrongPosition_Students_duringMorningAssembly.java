package CodingNinja;

import java.util.Arrays;
import java.util.Scanner;

public class WrongPosition_Students_duringMorningAssembly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
//        int[] arr = new int[len];
//        for (int i=0; i<len; i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {100,146,140,150,160}; //2
        int[] copy = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(arr);

        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] != copy[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
There are 'n' students standing in a straight line during morning assembly. They were required to stand in ascending
order of their height. But they are standing in a random fashion.
Find the number of students who are standing in wrong position.
All of them have distinct heights.
Input Format
First line consists of a single integer - n.
Next line contains Inl space separated integers - height of ith student standing in the line.
Output Format
Single integer - Answer to the problem.
Constraints
1 S n 200
1 height 200
Explanation
Students with height 146 and 140 are standing in wrong positions.
For example:
Input
5
100 146
140
150
Result
2
160
 */
