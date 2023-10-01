package CollegeTest.A_NewPracticeTest.BestQuestion.Heard;

import java.util.*;
public class FindWordsAfterPattern_TwoStringsFirstAndSecondOccurrencesImmediately {
    public static String[] findWordsAfterPattern(String text, String first, String second) {
        List<String> resultList = new ArrayList<>();
        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                resultList.add(words[i + 2]);
            }
        }

        return resultList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String text = "alice is a good girl she is a good student";
//        String first = "a";
//        String second = "good";
        String text = sc.nextLine();
        String first = sc.nextLine();
        String second = sc.nextLine();

        // Find and print words "third" after "first second"
        String[] result = findWordsAfterPattern(text, first, second);
        for (String word : result) {
            System.out.println(word);
        }
    }
}
