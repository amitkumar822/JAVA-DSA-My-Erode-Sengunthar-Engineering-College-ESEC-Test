package CollegeTest.A_NewPracticeTest;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
//        String str = "lovecodinglife";//3
//        String str ="itvac";//1
        String str = "aabb";//-1

        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        int idx=0,ans=-1;
        for (char ch : str.toCharArray()){
            if (map.containsKey(ch)){
                idx++;
                if (map.get(ch)==1){
                    ans=idx;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
