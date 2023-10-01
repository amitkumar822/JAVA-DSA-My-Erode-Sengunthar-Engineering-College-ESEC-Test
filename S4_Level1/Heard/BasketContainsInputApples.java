package CollegeTest.S4_Level1.Heard;

import java.util.Scanner;

public class BasketContainsInputApples {
    static int minApplesMove(int[] arr){
        int len = arr.length;
        int sum = 0;
        for (int apple : arr){
            sum += apple;
        }
        int average = sum/len;
        int result =0;
        for(int apples : arr){
            result += Math.abs(average-apples);
        }
        return (result/2);
        // Divide by 2 since each move involves two apples
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input2 = {2849, 1620, 705, 1, 30};
//        int len = sc.nextInt();
//        int input2[] = new int[len];
//        for(int i=0; i<len; i++){
//            input2[i]=sc.nextInt();
//        }
        int result = minApplesMove(input2);
        System.out.println("No of moves = "+result);
    }
}
/*
There are N number of baskets, where the ith basket contains input2[i] apples. We want to move apples between baskets so that all baskets have the same number of apples. What is the minimum number of apples that must be moved?

Finish attempt

It is guaranteed that there exists a way to move apples so as to have an equal number of apples in each basket.

SampleInputo:

input1: 2

Input2: (1,3)

SampleOutput0:

Output: 1

Explanation:

There are 2 baskets with first containing 1 apple and second containing 3 apples. if we shift one apple from the second container to the first container then both will have 2 apples. So only one apple was required to move. Hence the output is 1.

SampleInputo:

Inputt: 5

Input2: (2849,1620,705,1,30)

SampleOutputo:

Output: 2387

Explanation:

There are 5 baskets containing 2849,1620,705,1 and 30 apples respectively. If we move 336 apples from the 1st container to 3rd container and 579 apples from the 2nd container to 5th container. Then each container will have 1041 apples. So, the total apple movement is 336+1040+432+579-2387. Hence the output is 2387.

Input Format

input1: N. denoting the Number of Baskets input2: array representing the number of apples in the basket.

Output Format

Output Specification. Return the minimum number of apples that must be moved so that all baskets have the same
 */