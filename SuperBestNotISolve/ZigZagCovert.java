package CollegeTest.SuperBestNotISolve;

import java.util.Scanner;

public class ZigZagCovert {
    static void printZigZaz(int[] num, int size){
        for(int i=0; i<size-1; i++){
            if(i%2==0){
                if(num[i] > num[i+1]){
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
            }else if(num[i] < num[i+1]){
                int temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" element : ");
        int[] num = new int[size];
        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        printZigZaz(num,size);
        System.out.print("[");
        for (int i=0; i<size; i++){
            if(i%2==0){
                System.out.print(num[i]);
                if(i != size-1){
                    System.out.print(", ");
                }
            }else {
                System.out.print(num[i]);
                if(i != size-1){
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");
    }
}

//input size 5
//element 31 32 33 34 35
//output [31, 33, 32, 35, 34]