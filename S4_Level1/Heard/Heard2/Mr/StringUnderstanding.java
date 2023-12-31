package CollegeTest.S4_Level1.Heard.Heard2.Mr;
import java.util.*;
public class StringUnderstanding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        String[] numTextual = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen", "twenty"
        };

        int vowelsCount = 0;
        for (int num : numbers) {
            String numText = numTextual[num];
            for (char ch : numText.toCharArray()) {
                if (isVowel(ch)) {
                    vowelsCount++;
                }
            }
        }

        int D = vowelsCount;
        int pairCount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (numbers[i] + numbers[j] == D) {
                    pairCount++;
                }
            }
        }

        String[] numTextualOutput = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen", "twenty"
        };

        String result = (pairCount > 100) ? "greater 100" : numTextualOutput[pairCount];
        System.out.println(result);
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
/*input:-
5
1 2 3 4 5
one
 */

/*-----------------------------------------------*/
/*
Problem Description

One person hands over the list of digits to Mr. String, But Mr. String understands only strings. Within strings also he understands only vowels. Mr. String needs your help to find the total number of pairs which add up to a certain digit D. The rules to calculate digit D are as follow Take all digits and convert them into their textual representation Next, sum up the number of vowels i.e. (a, e, i, o, u) from all textual representation This sum is digit D Now, once digit D is known find out all unordered pairs of numbers in input whose sum is equal to D. Refer example section for better understanding

Constraints 1 <= N <= 100 1 <= value of each element in second line of input <= 100 Number 100, if and when it

appears in input should be converted to textual representation as hundred and not as one hundred. Hence number of vowels in number 100 should be 2 and not 4

Input

First line contains an integer N which represents number of elements to be processed as input Second line contains N

numbers separated by space

Output

Lower case representation of textual representation of number of pairs in input that sum up to digit D Note:- (If the count exceeds 100 print "greater 100")

Example 1

Input 5 1 2 3 4 5

Output one

Explanation

1-> one > 0, e

2-> two-> 0

3-> three-e, e

4-> four -> o, u

5-> five->1, e

Thus, count of vowels in textual representation of numbers in input = (2+1+2+2+2)=9. Number 9 is the digit D referred to in section above. Now from given list of number (1,2,3,4,5)-> find all pairs that sum up to 9. Upon processing this we know that only a single unordered pair (4, 5) sum up to 9. Hence the answer is 1. However, output specification requires you to print textual representation of number 1 which is one. Hence output is one. Note: - Pairs (4, 5) or (5, 4) both sum up to 9. But since we are asking to count only unordered pair, the number of unordered pair is this combination is only one.

Example 2

Input 37 42

Output zero

Explanation

7-> seven-> e, e

4-> four →→ o, u

2-> two-> 0

Thus, count of vowels in textual representation of numbers in Input = (2+2+1)=5. Number 5 is the digit D referred to in section above. Since no pairs add up to 5, the answer is 0. Textual representation of 0 is zero. Hence output is zero.

Sample Input
5
1 2 3 4 5

Sample Output one

For example:

Input

5
1 2 3 4 5
Result one
Input2
3
7 4 2
Result2
zero
 */