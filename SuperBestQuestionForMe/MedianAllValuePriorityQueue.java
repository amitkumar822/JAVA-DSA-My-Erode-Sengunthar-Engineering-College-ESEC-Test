package CollegeTest.A_A_SuperBestQuestionForMe;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianAllValuePriorityQueue {
    public static void findMedianValue(int[] arr){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>  minHeap = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++){
            int num = arr[i];

            if(maxHeap.isEmpty() || num<= maxHeap.peek()){
                maxHeap.add(num);
            }else {
                minHeap.add(num);
            }

            if(maxHeap.size() > minHeap.size()+1){
                minHeap.add(maxHeap.poll());
            }

            if(minHeap.size() > minHeap.size()){
                maxHeap.add(minHeap.poll());
            }

            if(maxHeap.size() == minHeap.size()){
                int maxValue = maxHeap.peek();
                int minValue = minHeap.peek();
                System.out.print((maxValue+minValue)/2+" ");
            }else {
                System.out.print(maxHeap.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
//        int[] arr = {5,4,3,2,1}; //5 4 4 3 3
        int[] arr = {5,15,1,3}; // 5 10 5 4
        findMedianValue(arr);
    }
}
/*
5
5 4 3 2 1
Sample Output 2 :
5 4 4 3 3
 */