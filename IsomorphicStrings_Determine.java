package CollegeTest_BasicToIntermediate;
import java.util.*;
public class IsomorphicStrings_Determine {
    static boolean ismorphic(String s,String t){
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            if(mp.containsKey(sCh)){
                if(mp.get(sCh) != tCh) return false;
            }else if(mp.containsValue(tCh)){
                return false;
            }else{
                mp.put(sCh,tCh);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = "egg";
//        String t = "add";
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(ismorphic(s,t));

    }
}
