package CollegeTest.S2_Lavel;
import java.util.*;
public class FindThreeArraysEqualCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sizes of arrays
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        // Input elements of arrays
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        // Find and print common elements
        int i = 0, j = 0, k = 0;
        boolean foundCommon = false;

        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                foundCommon = true;
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        if (!foundCommon) {
            System.out.print("NO Elements");
        }

        sc.close();
    }
}

/*
size1:-6
arr1:- 1 5 10 20 40 80
size2:- 5
arr2:- 6 7 20 80 100
size3:- 8
arr3:- 3 4 15 20 30 70 80 120
result :- 20 80
 */