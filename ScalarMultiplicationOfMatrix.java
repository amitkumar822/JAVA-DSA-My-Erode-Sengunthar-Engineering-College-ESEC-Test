package CollegeTest_BasicToIntermediate;

import java.util.Scanner;

public class ScalarMultiplicationOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] =  new int[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int mul = sc.nextInt();
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print((arr[i][j]*mul)+" ");
            }
            System.out.println();
        }
    }
}
/*
input:-
1 2 3
4 5 6
7 8 9
int mul =2
output:-
2 4 6
8 10 12
14 16 18
 */


/*
Write a program to read elements in a matrix and perform scalar multiplication of matrix.
Example
Input
Input elements of matrix A:
123
789
Input multiplier:
Output
8 10 12
14 16 18
Input 1
123
456
789
2
Output 1
8 10 12
14 16 18
2
 */
