package CollegeTest.S4_Level1.Heard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class licensePlateChatGpt {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        // Convert licensePlate to lowercase and remove non-alphabet characters
        String license = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Create a map to store the character frequencies in the licensePlate
        Map<Character, Integer> map = new HashMap<>();
        for (char c : license.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String shortestWord = null;
        int minLength = Integer.MAX_VALUE;

        for (String word : words) {
            // Check if the word contains all the required characters
            if (containsAllCharacters(map, word)) {
                if (word.length() < minLength) {
                    minLength = word.length();
                    shortestWord = word;
                }
            }
        }

        return shortestWord;
    }

    private static boolean containsAllCharacters(Map<Character, Integer> charFrequencies, String word) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : charFrequencies.keySet()) {
            if (!map.containsKey(c) || map.get(c) < charFrequencies.get(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String licensePlate = sc.nextLine();
//        String licensePlate = "1s3 PSt";
//        String[] words = {"step", "steps", "stripe", "stepple"};
        String pl = sc.nextLine();
        String[] wd = pl.split(" +");
        int len = wd.length;
        String[] words = new String[len];
        int idx=0;
        for (String rs:wd){
            System.out.print(rs+" ");
            words[idx++] = rs;
        }

        String result = shortestCompletingWord(licensePlate, words);
        System.out.println("Shortest completing word: " + result);
    }
}

/*
1s3 PSt
step steps stripe stepple
 */
