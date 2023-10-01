package CollegeTest.Best_Question;

import java.util.Scanner;
import java.util.Stack;

public class TemperaturesRepresentsTheDaily {
    public static int[] dailyTemperature(int[] temp){
        int len = temp.length;
        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<len; i++){
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int idx = stack.pop();
                result[idx] = i-idx;
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
//        int[] temp = new int[len];
//        for (int i=0; i<len; i++){
//            temp[i]=sc.nextInt();
//        }
        int[] temp = {73,74,75,71,69,72,76,73}; //1,1,4,2,1,1,0,0
        int[] result = dailyTemperature(temp);

        for (int i=0; i< result.length; i++){
            if(i < temp.length-1){
                System.out.print(result[i]+",");
            }else {
                System.out.print(result[i]);
            }
        }
    }
}

/*
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == e instead.

For example:

Result

Input

8

73

74

75

71

69

72

76

73
Output. 1,1,4,2,1,1,0,0
 */
