package CollegeTest.SuperBestNotISolve;

import java.util.Scanner;

public class AdditivePrime {
    public static void printAdditivePrime(int[] num){
        for (int arr : num){
            if (isPrime(arr) && isPrime(SumOfDigit(arr))){
                System.out.print(arr+" ");
            }
        }
    }

    public static boolean isPrime(int num){
        if (num <=1) return false;
        for (int i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    static int SumOfDigit(int num){
        int sum =0;
        while (num>0){
            sum += num%10;
            num /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        printAdditivePrime(num);
    }
}

//size 9 , input : 2 4 6 11 18 19 31 7 13 , output : 2 11 7