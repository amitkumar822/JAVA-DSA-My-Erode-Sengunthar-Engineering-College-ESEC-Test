package CollegeTest.SuperBestNotISolve;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianAllValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");

        int n = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            insertIntoHeap(x, minHeap, maxHeap);
            int median = calculateMedian(minHeap, maxHeap);
            System.out.println(median);
        }
    }

    public static void insertIntoHeap(int x, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if (minHeap.isEmpty() || x >= minHeap.peek()) {
            minHeap.offer(x);
        } else {
            maxHeap.offer(x);
        }

        if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.offer(minHeap.poll());
        } else if (maxHeap.size() > minHeap.size()) {
            minHeap.offer(maxHeap.poll());
        }
    }

    public static int calculateMedian(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if (minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() + maxHeap.peek()) / 2;
        } else {
            return minHeap.peek();
        }
    }
}

//size 4
// element-> 5 15 1 3
//output-> 5 10 5 4