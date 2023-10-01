package CollegeTest.S4_Level1;

public class LargestAmongArrayPreviousAndNextElementProductMaximum {
    public static void main(String[] args) {
        int[] num = {12,5,42,16,34,7}; // result=16
//        int[] num = {4,8};
        int len = num.length;
        if(len>2) {
            int[] res = new int[len];
            res[0] = (num[len - 1] * num[1]);
            res[len - 1] = (num[0] * num[len - 2]);
            int idx = 1;
            for (int i = 1; i < len - 1; i++) {
                int mul = (num[i - 1] * num[i + 1]);
                res[idx++] = mul;
            }
            int max = 0, index = -1;
            for (int i = 0; i < len; i++) {
                if (res[i] > max) {
                    max = res[i];
                    index = i;
                }
            }
            System.out.println(num[index]);
        }else {
            System.out.println(-1);
        }
    }
}
/*
Given an array arr[] of N integers, the task is to print the largest element among the array such that its previous and next element product is maximum.

Explanation:

Input: arr[]= {5, 6, 4, 3, 2}

Output: 6

The product of the next and the previous elements for every element of the given array are:

5->2* 6 =12

6->5 *4 =20

4-> 6*3=18

3-> 4 *2= 8

2->3* 5= 15

Out of these 20 is the maximum.

Hence, 6 is the answer.

Run

For example:

Input

Size :-6

12 5 42 16 34 7
Output 16
 */