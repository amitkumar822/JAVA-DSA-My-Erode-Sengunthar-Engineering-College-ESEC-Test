package CollegeTest_BasicToIntermediate.A_NewPracticeTest;

import java.util.Scanner;

public class FindThreeIntegersinTheArrayDestination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 6
        int tr = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==tr){
                        System.out.print(tr);
                        break;
                    }
                }
            }
        }
    }
}

/*
Given an array of T integers and another integer destination, find three integers in the array such that the addition is closest to destination.
Your task is to identify the addition of the three integers.
Note:
If they exist over one answer, then display maximum sum
Input Format
The first line of input contains T and target. Next line contains Array elements
Output Format
Display sum of three integers
Sample input:
62
-798311
Output:
2
Explanation
which is the closest to the expected input. So this is the output
 */
