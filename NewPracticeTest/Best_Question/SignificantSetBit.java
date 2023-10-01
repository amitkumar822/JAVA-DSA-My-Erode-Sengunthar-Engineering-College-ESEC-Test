package CollegeTest.Best_Question;

import java.util.Scanner;

public class SignificantSetBit {

    public static String findBitwiseInfo(int N) {
        // Find the number of bits (set bits) in N
        int count = 0;
        int last = -1;
        int Most = -1;

        for (int i = 0; i < 32; i++) {
            if ((N & (1 << i)) > 0) {
                count++;
                if (last == -1) {
                    last = i;
                }
                Most = i;
            }
        }

        // Build the output string
        String result = count + "#" + last + "#" + Most;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int N = sc.nextInt();
        String output1 = findBitwiseInfo(N);

        System.out.println("Output: " + output1);
    }
}

/*input n=10  output: 2#1#3 */
/* input n=1 output: 1#0#0 */

/* Given an integer say N.You need to find the following:

1.The number of bits (bits that are 1 in the bitwise representation) in N.

2.The position of the least significant set bit

3.The position of the most significant set bit

The output should be a string of the form a#b#c,where a,b,c are answers for the above three queries respectively.

Example 1:

Input: 10

Output: 2#1#3

Explanation:

The Bitwise Representation of 10 is 1010(indexing is 3,2,1,0)

Total count of set bit (ie. 1) is 2.So a=2

the position of least significant set bit is 1,50 b=1

the position of most significant set bit is 3,so c=3

The output is returned in the form a#b#c, hence the output is 2#1#3

Example 2:

Input: 1

Output: 1#0#0

Explanation:

The Bitwise Representation of 1 is 1(indexing is 0)

Total count of set bit (i.e. 1) is 1.So a=1

the nec of least significant cot bit in Oca h
*/