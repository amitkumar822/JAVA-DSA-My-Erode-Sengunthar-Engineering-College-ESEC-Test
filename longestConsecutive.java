package CollegeTest_BasicToIntermediate;

import java.util.HashMap;
import java.util.Scanner;

public class longestConsecutive {
    private static int findLength(HashMap<Integer,Boolean> map,int k){
        int ans = 0;
        while(map.containsKey(k)){
            ans++;
            k++;
        }
        return ans;
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],true);
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        int max = 0;
        for(Integer key : map.keySet()){
            if(map.get(key) == true){
                max = Math.max(max,findLength(map,key));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
//        int[] arr = new int[len];
//        for (int i=0; i<len; i++){
//            arr[i] = sc.nextInt();
//        }
        String str = sc.nextLine();
        String[] word = str.split(" +");
        int len = word.length;
        int[] arr = new int[len];
        int idx=0;
        for (String ss : word){
            int d = Integer.parseInt(ss);
            arr[idx++] = d;
        }
        int result = longestConsecutive(arr);
        System.out.println(result);
    }
}


/*
Write a program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
Sample array 1:
49, 1, 3, 200, 2, 4, 70, 5
The longest consecutive elements sequence is 1, 2, 3, 4, 5 therefore the program will return its length 5.
Output
5
Sample array 2:
56,
The longest consecutive elements sequence is therefore the program will return its length 3.
Output
3
For example:
Input
49 1 3 200
56 43
2 4 70 5
Result
5
3
 */
