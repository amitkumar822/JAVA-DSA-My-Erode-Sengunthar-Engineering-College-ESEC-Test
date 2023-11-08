package CollegeTest_BasicToIntermediate.S4_Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLexicographicalString {
    public static char[] lexo_small(int n, int k)
    {
        char arr[] = new char[n];

        Arrays.fill(arr, 'a');

        // Iteration from the last position
        // in the array
        for (int i = n - 1; i >= 0; i--) {

            k -= i;

            // If k is a positive integer
            if (k >= 0) {

                // 'z' needs to be inserted
                if (k >= 26) {
                    arr[i] = 'z';
                    k -= 26;
                }

                // Add the required character
                else {
                    arr[i] = (char)(k + 97 - 1);
                    k -= arr[i] - 'a' + 1;
                }
            }

            else
                break;

            k += i;
        }

        return arr;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();

            char arr[] = lexo_small(n, k);

            System.out.println(new String(arr));
        }
    }
}

/*
Given two numbers n and k, find a string s of lowercase alphabets such that sum of values of all the elements in the string is equal to k. If there exist many such strings, find the one
which is lexicographically the smallest.
The value of ith lowercase alphabet is i, for example, value of a is 1, b is 2, and so on.
Input format:
First line of input contain a single integer t, denoting number of test cases. t lines follows each containing two space-separated integers n and k.
Output format:
Print the lexicographically smallest string of length n and having string sum value equal to k. Constraints:
1 50
1 n 2*10A5
n k <= 26*n
Sample Input:
2
5 42
325
Sample Output:
aaamz
aaw
Explanation:
string value of aaamz is 42 also, it is smallest lexicographical string such that it contains 5 characters and has string value 42.
For example:
Input Result
2
5 42
3 25
output
aaamz
aaw

 */