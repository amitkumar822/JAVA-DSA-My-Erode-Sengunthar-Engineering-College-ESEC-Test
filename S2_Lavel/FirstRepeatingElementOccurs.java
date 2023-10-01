package CollegeTest.S2_Lavel;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingElementOccurs {
    static int findFirstRepeEl(int[] arr){//6 10 3 10 2 9 5 2 6 //1 2 3 4 5
        HashMap<Integer,Integer> map = new HashMap<>(); //1 2 3 4 5 (1)
        int firstRpMin=Integer.MAX_VALUE; //0

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){ // 6 10 2 //las updated
                int currIdx = map.get(arr[i]); //1 4 0
                firstRpMin = Math.min(firstRpMin,currIdx); //1 1 0
            }else{
                map.put(arr[i],i);
            }
        }
        if(firstRpMin == Integer.MAX_VALUE){
            return -1;
        }else {
            return arr[firstRpMin];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int result = findFirstRepeEl(arr);
        if(result !=-1){
            System.out.println(result);
        }else {
            System.out.println("No repeating elements");
        }
    }
}
/*
size:- 9
element:- 6 10 3 10 2 9 5 2 6
result:- 6
 */