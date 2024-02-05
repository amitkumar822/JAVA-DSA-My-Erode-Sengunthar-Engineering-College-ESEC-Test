package CollegeTest_BasicToIntermediate;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KrishnaLovesCandies2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int T = scanner.nextInt();

        while (T-- > 0) {
            // Number of boxes
            int N = scanner.nextInt();

            // Array to store the number of candies in each box
            int[] candies = new int[N];

            // Input the number of candies in each box
            for (int i = 0; i < N; i++) {
                candies[i] = scanner.nextInt();
            }

            // Solve the problem and print the result
            int result = minimumTimeToCollectCandies(N, candies);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int minimumTimeToCollectCandies(int N, int[] candies) {
        // Use a priority queue to efficiently find the minimum values
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all the candies to the priority queue
        for (int i = 0; i < N; i++) {
            minHeap.add(candies[i]);
        }

        int totalTime = 0;

        // Combine the candies until there is only one box left
        while (minHeap.size() > 1) {
            // Extract the two boxes with the least number of candies
            int box1 = minHeap.poll();
            int box2 = minHeap.poll();

            // Combine the candies and put them back in the priority queue
            int newBox = box1 + box2;
            totalTime += newBox;
            minHeap.add(newBox);
        }

        return totalTime;
    }
}




/*
* Krishna loves candies a lot, so whenever he gets them, he stores them so that he can eat them later whenever he wants to.
He has recently received N boxes of candies each containing Ci candies where Ci represents the total number of candies in the ith box. Krishna wants to store them in a single box. The only constraint is that he can
choose any two boxes and store their joint contents in an empty box only. Assume that there are infinite number of empty boxes available.
At a time he can pick up any two boxes for transferring and if both the boxes say contain X and Y number of candies respectively, then it takes him exactly X+Y seconds of time. As he is to eager to collect all of them
he has approached you to tell him the minimum time in which all the candies can be collected.
Sample Input 1
4
1234
Sample Output 1 :
19
Explanation
4 boxes, each containing 1, 2, 3 and 4 candies respectively.Adding 1 + 2 in a new box takes 3 seconds.Adding 3 + 3 in a new box takes 6 seconds.Adding 4 + 6 in a new box takes IO seconds.Hence total time taken is
19 seconds. There could be other combinations also, but overall time does not go below 19 seconds.
Input Format
• The first line of input is the number of test case T
• Each test case is comprised of two inputs
• The first input of a test case is the number of boxes N
• The second input is N integers delimited by whitespace denoting the number of candies in each box
Output Format
Print minimum time required, in seconds, for each of the test cases. Print each output on a new line.
Constraints
• 1 ? N? 10000
1 ? [Candies in each box] ? 100009
Sample Input
1
4
1 2 3 4
Sample Output
19
* */
