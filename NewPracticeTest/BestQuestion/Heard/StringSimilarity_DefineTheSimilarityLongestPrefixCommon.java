package CollegeTest.A_NewPracticeTest.BestQuestion.Heard;
import java.util.*;

public class StringSimilarity_DefineTheSimilarityLongestPrefixCommon {
    public static void main(String[] args) {
        /*
        2
        ababaa
        aa
        output
        11
        3
         */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        // Process each test case
        for (int i = 0; i < t; i++) {
            String s = scanner.next(); // Input string
            int result = calculateSimilarity(s);
            System.out.println(result);
        }
        scanner.close();
    }

    public static int calculateSimilarity(String s) {
        int similaritySum = 0;
        int n = s.length();

        // Calculate the similarity for each suffix of the string
        for (int i = 0; i < n; i++) {
            int similarity = 0;

            // Compare characters of the suffix and the original string
            while (i + similarity < n && s.charAt(i + similarity) == s.charAt(similarity)) {
                similarity++;
            }

            similaritySum += similarity;
        }

        return similaritySum;
    }
}

/* QUESTION:-

For two strings A and B, we define the similarity of the strings to be the length of the longest prefix
common to both strings. For example, the similarity of strings "abc" and "abd" is 2, while the similarity
of strings "aaa" and "aaab" is 3.
Calculate the sum of similarities of a string S with each of it's suffixes.
Input Format
The first line contains the number of test cases t.
Each of the next t lines contains a string to process, s.
Output Format
Output t lines, each containing the answer for the corresponding test case.
Sample Input
2
ababaa
aa
Sample Output
11
3
Explanation
For the first case, the suffixes of the string are "ababaa", "babaa", "abaa", "baa", "aa" and "a". The
similarities of these strings with the string "ababaa" are 1, & 1 respectively. Thus, the answer is 6
+0+3+0+1 +1=11
For the second case, the answer is 2 + 1 = 3.
 */