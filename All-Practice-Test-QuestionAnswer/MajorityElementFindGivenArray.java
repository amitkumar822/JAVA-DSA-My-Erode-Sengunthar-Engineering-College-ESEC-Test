package CollegeTest.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElementFindGivenArray {
    public static int findMajorityElement(int[] nums){
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num) > len/2) return num;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" element: ");
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int result = findMajorityElement(nums);
        System.out.println(result);
    }
}
