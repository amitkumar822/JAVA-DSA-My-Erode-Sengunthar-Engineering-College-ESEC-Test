package CollegeTest.S4_Level1;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionIsClosestToDestination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int target = sc.nextInt();
        int[] array = new int[T];

        for (int i = 0; i < T; i++) {
            array[i] = sc.nextInt();
        }

        int closestSum = findClosestSum(array, target);
        System.out.println(closestSum);
    }

    public static int findClosestSum(int[] array, int target) {
        Arrays.sort(array);
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int sum = array[i] + array[left] + array[right];
                int diff = Math.abs(sum - target);

                if (diff < minDiff || (diff == minDiff && sum > closestSum)) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
}
/*input1:
6 2
-7 9 8 3 1 1
2
 */

/*
4 13
5 2 7 6
13
 */