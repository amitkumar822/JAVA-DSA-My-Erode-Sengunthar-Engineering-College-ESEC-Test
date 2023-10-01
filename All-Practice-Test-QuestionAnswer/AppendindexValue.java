package CollegeTest;

import java.util.Scanner;

public class AppendindexValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        System.out.println("Enter all element");
        for (int i=0; i<size; i++){
            num[i]= sc.nextInt();
        }
        System.out.println("Enter idx");
        int idx=sc.nextInt();
        System.out.println("Enter idx value");
        int x=sc.nextInt();
        if(idx  <=size) {
            for (int i = 0; i < size; i++) {
                if (i == idx - 1) {
                    num[i] = x;
                    System.out.print(x + " ");
                } else {
                    System.out.print(num[i] + " ");
                }
            }
        }else {
            System.out.print("-1");
        }
    }
}
//input size=5 ,num(input) 10 20 30 40 50, idx=3,x=75 output-10 20 75 40 50
//input size=5 ,num(input) 10 20 30 40 50, idx=9,x=75 output--1

