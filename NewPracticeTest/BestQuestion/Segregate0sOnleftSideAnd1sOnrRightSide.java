package CollegeTest.A_NewPracticeTest.BestQuestion;
import java.util.Scanner;
public class Segregate0sOnleftSideAnd1sOnrRightSide {
    public static void segregateZerosOnes(int[] arr) {
        int left = 0; // Pointer for 0s
        int right = arr.length - 1; // Pointer for 1s

        while (left < right) {
            // Move the left pointer to the right until a 1 is found
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move the right pointer to the left until a 0 is found
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // Swap arr[left] and arr[right] to segregate 0s and 1s
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (0 or 1):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] != 0 && arr[i] != 1) {
                System.out.println("Invalid Input");
                return;
            }
        }

        segregateZerosOnes(arr);

        System.out.println("Array in left-right arrangement:");
        for (int num : arr) {
            System.out.print(num);
        }

        scanner.close();
    }
}



/* Question:-
You are given an array of 0s and Is in random order. Segregate Os on left side and Is on right side of
the array. Traverse array only once.
Input Format
N - size of the array 'N' integers(0 or 1)
Constraints
First line- N, array length Next N inputs- array elements(only 0's and 1 's)
Output Format
Input array in left-right arrangement
Sample Input O
5
01201
Sample Output O
Invalid Input
 */