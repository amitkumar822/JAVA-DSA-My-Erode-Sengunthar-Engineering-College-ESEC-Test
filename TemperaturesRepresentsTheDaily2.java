package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class TemperaturesRepresentsTheDaily2 {
    public static void main(String[] args) {
//        int[] arr = {73,74,75,71,69,72,76,73};//1,1,4,2,1,1,0,0
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length; i++){
            int count = 0;
            int fist = arr[i]; //73
            for (int j=i+1; j<arr.length; j++){

                if(fist < arr[j]){ // 73 < 74
                    count++;
                    break;
                }else {
                    if( i== arr.length-2 || fist < arr[j]) {
                        count = 0;
                    }else {
                        count++;
                    }
                }
            }
            if(i== arr.length-1) {
                System.out.print(count);
            }else {
                System.out.print(count + ",");
            }
        }
    }
}


/*
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is
the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this
is possible, keep answer[i]
o instead.
For example:
Input Result
8
73
74
75
71
69
72
76
73
output:-
1,1,4,2,1,1,0,0
 */