package CollegeTest;

import java.util.HashMap;
import java.util.Scanner;

public class HappyString2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        boolean isHappy = isHappyString(str);
        if (isHappy) {
            System.out.println("Output: HAPPY");
        } else {
            System.out.println("Output: NOT HAPPY");
        }
    }

    public static boolean isHappyString(String inputString) {
        HashMap<Character, Integer> map = new HashMap<>(); //vmap.put('a', 0);
        map.put('a',0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);

        for (char c : inputString.toCharArray()) {
            if (map.containsKey(Character.toLowerCase(c))) {
                map.put(Character.toLowerCase(c), map.get(Character.toLowerCase(c)) + 1);
            }
        }

        for (int count : map.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
