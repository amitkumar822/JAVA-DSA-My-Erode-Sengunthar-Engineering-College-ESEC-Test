package CollegeTest.A_NewPracticeTest.BestQuestion.PartiallyCorrect;

import java.util.*;

public class MonicaHeadChefinCentralPerkCafeCoffeeFlavors {

    public static void main(String[] args) {
        int N = 5;
        int K = 2;
        int result = countCoffeeFlavors(N, K);
        System.out.println(result);
    }

    public static int countCoffeeFlavors(int N, int K) {
        int MOD = 10000;
        int[][] memo = new int[N + 1][K + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        int result = countFlavors(N, K, memo) % MOD;
        return result;
    }

    public static int countFlavors(int N, int K, int[][] memo) {
        if (K == 0) {
            return 1;
        }
        if (N == 0) {
            return 0;
        }
        if (memo[N][K] != -1) {
            return memo[N][K];
        }
        int ways = countFlavors(N - 1, K, memo) + countFlavors(N, K - 1, memo);
        memo[N][K] = ways;
        return ways;
    }
}


/*
Monica is head chef in the Central Perk cafe, She wants to serve her customer v,ith as many as flavours of coffee but she has coffee seeds of only N different flavours. But she knows a trick to get new flavours from the existing flavours.
The trick is as follows:-
A combination of thw or more of the original flavours gives a new flavour (amount of the original flavor does not matter),
A combination of K or less different flavours is a good flavour and all the original flavours are good , where K is a non-negative integer.
Joey is Monica's very good friend and also a talented coder. In order to help Monica, he finds the total number of different and good flavours of coffee, say T, that Monica can serve to her customers. His final task is to find T.
Example 1:
inputl: 5
input2: 2
output: 15
Explanation:
Let the flavors be numbered from I to 5, Therefore the combinations are:
Example 2:
inputl: 2
input2:
output: 2
Explanation:
Let the flavors be numbered from 1 to 2. Therefore the combinations are:
Input Format
inputl: N, denoting the number of different flavors/
input2: K, denoting the maximum number of flavors that can be used.
Output Format
Your function should the total number of different flavors mod 10000. i.e T mod 10000, where mod is an arithmetic operator represented by %
Sample Input
5
2
Sample Output
15
For example:
input2:
10
1
output:
10
 */