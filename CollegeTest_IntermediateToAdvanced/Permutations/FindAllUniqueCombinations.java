package CollegeTest_IntermediateToAdvanced.Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllUniqueCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline character

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Size of array
            int[] A = new int[N]; // Array of integers
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            int B = scanner.nextInt(); // Target sum
            scanner.nextLine(); // Consume the newline character

            List<List<Integer>> result = combinationSum(A, B);
            if (result.isEmpty()) {
                System.out.println("Empty");
            } else {
                for (List<Integer> combination : result) {
                    System.out.print("(");
                    for (int i = 0; i < combination.size(); i++) {
                        System.out.print(combination.get(i));
                        if (i < combination.size() - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print(")");
                }
                System.out.println();
            }
        }

        scanner.close();
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
        } else if (remain < 0) {
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue; // Skip duplicates
                }
                tempList.add(candidates[i]);
                backtrack(result, tempList, candidates, remain - candidates[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}



/*
Given an array of integers A and a sum B, find all unique combinations in A where the sum is equal to 8. Each number in A may only be used once in the combination.
Note:
All numbers will be positive integers.
Elements in a combination (al, a2, ... , ak) must be in non-descending order. (ie, a1 a2 ...
The combinations themselves must be sorted in ascending order.
If there is no combination possible the print "Empty" (without qoutes).
Example,
Given A = and B(sum) 8,
A solution set is:
Input Format
First is T , no of test cases. 1
Every test case has three lines.
First line is N, size of array.
Second line contains N space seperated integers(x). 1
Third line is the sum B. =30.
Output Format
ak).
One line per test case, every subset enclosed in 0 and in every set intergers should be space seperated.
intput
1
7
10 1 2 7 6 1 5
8
output
(1 1 6)(1 2 5)(1 7)(2 6)
 */