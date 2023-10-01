package CollegeTest.A_NewPracticeTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStringS2andS2RemoveThoseCharacter {
    static void unique(String str,String tr){
        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ck : tr.toCharArray()) {
            set.add(ck);
        }

        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(ch[i])) {
                System.out.print(ch[i]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
//        String str = "itvaccodingteam";
//        String tr = "caw"; // itvodingtem

//        String str = "removechharaterfrom";
//        String tr = "string"; //emovechaaefom
        sc.nextLine();
        for(int r=0; r<test; r++) {
            String str = sc.nextLine();
            String tr = sc.nextLine();
            unique(str,tr);
        }
    }
}
