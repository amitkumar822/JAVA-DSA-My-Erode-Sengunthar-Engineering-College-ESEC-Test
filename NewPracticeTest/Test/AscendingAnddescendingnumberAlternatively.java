package CollegeTest.A_NewPracticeTest.Test;

import java.util.Scanner;

public class AscendingAnddescendingnumberAlternatively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n*2];
        int k=1;
        for(int i=0; i<n*2; i+=2){
            arr[i]=k++;
        }
        k=n;
        for (int i=1; i<n*2; i+=2){
            arr[i] = k--;
        }
        for (int res : arr){
            System.out.print(res+" ");
        }
    }
}

/*
7
1 7 2 6 3 5 4 4 5 3 6 2 7 1
 */