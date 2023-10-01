package CollegeTest.A_NewPracticeTest.BestQuestion.Heard;

import java.util.*;

public class WordTransformation_Dictionary {
    public static List<String> findShortestTransformation(String start, String end, Set<String> dictionary) {
        if (!dictionary.contains(end)) {
            return null; // If end word is not in the dictionary, transformation is not possible
        }

        Queue<List<String>> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        List<String> initialPath = new ArrayList<>();
        initialPath.add(start);
        queue.offer(initialPath);
        visited.add(start);

        while (!queue.isEmpty()) {
            List<String> currentPath = queue.poll();
            String currentWord = currentPath.get(currentPath.size() - 1);

            if (currentWord.equals(end)) {
                return currentPath; // Found the shortest transformation sequence
            }

            for (int i = 0; i < currentWord.length(); i++) {
                char[] charArray = currentWord.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    charArray[i] = c;
                    String transformedWord = new String(charArray);

                    if (dictionary.contains(transformedWord) && !visited.contains(transformedWord)) {
                        visited.add(transformedWord);
                        List<String> newPath = new ArrayList<>(currentPath);
                        newPath.add(transformedWord);
                        queue.offer(newPath);
                    }
                }
            }
        }

        return null; // Transformation not possible
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.next();
        String end = scanner.next();
        Set<String> dictionary = new HashSet<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            dictionary.add(word);
        }

        List<String> transformationSequence = findShortestTransformation(start, end, dictionary);

        if (transformationSequence != null) {
            for (String word : transformationSequence) {
                System.out.print(word + " ");
            }
            System.out.println();
        } else {
            System.out.println("null");
        }
    }
}
