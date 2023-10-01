package CollegeTest.A_NewPracticeTest.BestQuestion;

import java.util.Scanner;

public class OrdinalValues_ZeroIndexed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // Read the input as a single line
        str = str.substring(1, str.length() - 1); // Remove brackets
        String[] s = str.split(","); // Split the strings

        int m = sc.nextInt(); // Exponent

        long tVal = 0; //Total value

        for (String st : s) {
            long stVal = 1;

            for (char c : st.toCharArray()) {
                int charValue = (int) c;
                stVal *= powerWithMod(charValue, m);
                stVal %= 2; // Calculate modulo 2 to keep the result small
            }

            tVal += stVal;
            tVal %= 2; // Calculate modulo 2 for the total value as well
        }

        if (tVal == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        sc.close();
    }

    private static long powerWithMod(long base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % 2;
            }
            base = (base * base) % 2;
            exponent /= 2;
        }
        return result;
    }
}

/*
input: ['abcdefghijklmnopqrstuvwxyz','pqrs','ops']
input: 12
output: EVEN

------
input1:
['ace','oqs','oqs']
5
output1: ODD
input2:
['dg','pqs']
3
output2: EVEN
 */


/*------------------------QUESTION-------------------------------
We have an array of strings. Consider each string as a zero-indexed array of characters. All of the
characters will be in the range ascii [a-z] which have decimal values in the range[97-122]. These
decimal values are called ordinal values and will be referred toa s ord[a] (for example).
Given an array of strings and an integer m, we calculate a value of each s[i] of
length len(s[i]) as:
value[i] = power m x power m x ...ord[s[i][len(s-l)] power m.
Perform the calculataion on each string, sum them up and determine whether the sum is ODD or EVEN.
For example, your array it has k=2 strings. Rewritten as 2D array of decimal ordinals, we
have
If our exponent is m = 2, we perform the following:
a = 97 9409
b = 98 9604
c = 99 9801
s[0] = 'abc' and value of s[0] = 9409 x 9604 x 9801 = 885657916836
'abcd' and value of s[l] = 9409 x 9604 x 9801 x 10000 = 8856579168360000
Adding so and s[l] answer is 8857464826276840
Which is even
If answer is even print EVEN else print ODD
Similarly
with results in an integer 13347265726444778181738809565993
which is ODD
 */