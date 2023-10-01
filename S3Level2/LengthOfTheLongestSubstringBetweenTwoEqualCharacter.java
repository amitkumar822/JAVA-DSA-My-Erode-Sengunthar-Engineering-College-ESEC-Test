package CollegeTest.S3Level2;

import java.util.HashMap;
import java.util.Scanner;

public class LengthOfTheLongestSubstringBetweenTwoEqualCharacter {
//    static int lenLongSub(String str){
//        int res = -1;
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if(map.containsKey(ch)){
//                res = Math.max(res,i-map.get(ch)-1);
//            }else{
//                map.put(ch,i);
//            }
//        }
//        return res;
//    }


    //2nd method

    static int lenLongSub(String str){
        int res =-1;
        for(int i=0; i<str.length(); i++){
            for (int j=str.length()-1; j>=0; j--){
                if(str.charAt(i)==str.charAt(j)) {
                    res = Math.max(res, (i - j) - 1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "dsbdsfebuy";
        String str = "dcd";
        int result = lenLongSub(str);
        System.out.println(result);
    }
}
