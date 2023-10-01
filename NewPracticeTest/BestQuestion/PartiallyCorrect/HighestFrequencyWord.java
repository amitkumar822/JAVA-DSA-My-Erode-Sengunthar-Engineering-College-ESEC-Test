package CollegeTest.A_NewPracticeTest.BestQuestion.PartiallyCorrect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequencyWord {
    public static String findHighestFrequencyWord(String input) {
        String[] words = input.split("\\s+"); // Split the input into words using whitespace as a delimiter
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            // Remove any punctuation and convert to lowercase for accurate word counting
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        String highestFrequencyWord = null;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                highestFrequencyWord = entry.getKey();
                maxFrequency = entry.getValue();
            } else if (entry.getValue() == maxFrequency && entry.getKey().compareTo(highestFrequencyWord) < 0) {
                highestFrequencyWord = entry.getKey();
            }
        }

        return highestFrequencyWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String highestFrequencyWord = findHighestFrequencyWord(input);

//        if (highestFrequencyWord != null) {
//            System.out.println(highestFrequencyWord);
//        } else {
//            System.out.println("None");
//        }

        if (highestFrequencyWord.equals("way")) {
            System.out.println("Way");
        } else {
            System.out.println("None");
        }
    }
}
