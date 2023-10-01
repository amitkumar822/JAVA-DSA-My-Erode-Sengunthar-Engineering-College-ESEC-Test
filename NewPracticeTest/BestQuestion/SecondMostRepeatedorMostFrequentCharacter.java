package CollegeTest.A_NewPracticeTest.BestQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SecondMostRepeatedorMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "aabababa";// b
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        int count=0;
        for(var key : map.entrySet()){
            int v = key.getValue();
            //for(int i=0; i<2; i++){
            if(v>=2){
                count++;
            }
            //}
        }
        String ans = "";
        if(count>=2){
            for (var key : map.entrySet()){
                int c=0;
                if(key.getValue()>=2){
                    c++;
//                    System.out.println(key.getKey());
                    char res = key.getKey();
                    ans = String.valueOf(res);
                    if(c==2){
                        break;
                    }
                }
            }
            System.out.println("Second most frequent character is "+ans);
        }else{
            System.out.println("No Second most frequent character ");
        }

    }
}

/*
Given a string, find the second most frequent character in it.lf it does not have any second most
repeated character then return "No Second most frequent character".
Input Format
A string.
Constraints
It should be a string.
Output Format
Second most frequent character.
Sample Input O
aabababa
Sample Output O
Second most frequent character is b
 */