package CollegeTest;

import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8,9}; // 4 5

        HashSet<Integer> set = new HashSet<>();

        for(int val : arr1){
            set.add(val);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int val : arr2){
            if(set.contains(val)){
                set2.add(val);
            }
        }

        Iterator itr = set2.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
