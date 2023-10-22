package CollegeTest_IntermediateToAdvanced.Permutations.Permutation_Assessment;

import java.util.Scanner;

public class CoinChangeWays_ValuedCoins_infiniteSupply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of different valued coins (M)
        int M = scanner.nextInt();
        int[] coinValues = new int[M];

        // Input the different coin values
        for (int i = 0; i < M; i++) {
            coinValues[i] = scanner.nextInt();
        }

        // Input the target amount (N)
        int N = scanner.nextInt();

        // Create an array to store the number of ways to make change for each amount from 0 to N
        int[] dp = new int[N + 1];
        dp[0] = 1; // There is one way to make change for 0 cents (no coins)

        // Calculate the number of ways for each amount from 1 to N
        for (int coin : coinValues) {
            for (int amount = coin; amount <= N; amount++) {
                dp[amount] += dp[amount - coin];
            }
        }

        // The result is stored in dp[N]
        int ways = dp[N];

        // Print the number of ways to make change for the target amount
        System.out.println(ways);

        scanner.close();
    }
}

/*
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S
= { Sl, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins
doesn't matter.
Example,
For N = 4 and S = {1,2,3}, there are four solutions: ,3}. So output should be
4.
For N = 10 and S = (2, 5, 3, 6}, there are five solutions: and {5,5).
So the output should be 5.
Input Format
First Integer : M-number of different valued coins
Next N integers indicates M different coin values
Last Integer. Target Amount
Output Format
Single Integer value denoting number of ways to make the change
Sample Input
3
123
4
Sample Output
4
 */