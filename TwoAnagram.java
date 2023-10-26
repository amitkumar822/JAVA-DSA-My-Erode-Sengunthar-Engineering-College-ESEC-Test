package CollegeTest_BasicToIntermediate;

import java.util.HashMap;
import java.util.Scanner;

public class TwoAnagram {
    static HashMap<Character,Integer> Freq(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        return map;
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = Freq(s);
        for(char ch : t.toCharArray()){
            if(!mp.containsKey(ch)) return false;
            mp.put(ch,mp.get(ch)-1);
        }
        for(Integer d : mp.values()){
            if(d !=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i =0; i<t; i++) {
            String str = sc.nextLine();
            String[] wd = str.split(" +");
            String first = wd[0];
            String second = wd[1];
            if (isAnagram(first,second)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}

/*
2
Hello hello
False
hello hello
True
 */

/*
Check if two given strings are anagrams of each other
For example:
Input
3
Hello hello
HELLO hello
hello hello
Result
False
False
True
 */
