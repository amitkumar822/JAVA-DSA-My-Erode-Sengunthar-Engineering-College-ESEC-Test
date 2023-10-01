package CollegeTest;

import java.util.Scanner;

public class DecimalToBinary {
    static void binaryDec(int nb){
        String rs = Integer.toBinaryString(nb);
        System.out.print(rs+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter element");
        for (int i=0; i< num.length; i++){
            num[i]=sc.nextInt();
        }
        for (int rs : num){
            for (int i=1; i<=rs; i++){
                binaryDec(i);
            }
        }
    }
}

/*
Enter size
2
Enter element
2 5
output 1 10 1 10 11 100 101
 */