package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class Find_StonesJewels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Jewels = sc.nextLine();
        String stone = sc.nextLine();
//        String Jewels = "aA";
//        String stone = "aAAbbbb"; //3
        int count = 0;
        for (int i=0; i<Jewels.length(); i++){
            for (int j=0; j<stone.length(); j++){
                if(Jewels.charAt(i)==stone.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/*
You're given strings J representing the types of stones that are jewels, and s representing the stones you have. Each
character in s is a type of stone you have. You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and s are letters. Letters are case sensitive, so "a" is
considered a different type of stone from "A".
Example 1:
Input: J = "aA", S
Output: 3
Example 2:
Input: J - "z", S
Output: 0
" aAAbbbb"
"ZZ"
Note:
•
s and J will consist of letters and have length at most 50.
The characters in J are distinct.
 */
