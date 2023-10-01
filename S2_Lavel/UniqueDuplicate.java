package CollegeTest.S2_Lavel;

import java.util.HashMap;

public class UniqueDuplicate {
    static void UniqueEle(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int unique =-1;
        for(int num : arr){
            if(map.get(num)==1){
                if(unique==-1 || num<unique){
                    unique=num;
                }
            }
        }
        if(unique!=-1){
            System.out.println(unique);
        }else {
            System.out.println("No unique elements");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,4,2,3};
        UniqueEle(arr);
    }
}

/*
There is an integer array with duplicate elements. Print the unique element which is not repeated. If more than one element is repeated it should the print least value.

Input Format

N-size of the array 'N' integer values

Constraints

No Constraints

Output Format

Single integer from the array which is the unique number

For example:

Input
1 2 3 1 2 3 4 2 3
Output 4
Input2
6

1 1 2 2 3 3
Output
No unique elements
 */
