package CollegeTest.A_NewPracticeTest.BestQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class SorttheWordsSentenceJoined {
    public static void main(String[] args) {
//        String str = "hello,how are you today?";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" +");
        Arrays.sort(words);
        String result = String.join(" ",words);
        System.out.println(result);
    }
}
