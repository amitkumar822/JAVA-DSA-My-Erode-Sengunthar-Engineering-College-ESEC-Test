package CollegeTest;

import java.util.Scanner;

public class Array_Assessment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        System.out.println("Enter arr element: ");
        int[] num = new int[size];
        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Enter index value remove element: ");
        int position=sc.nextInt();
        int pos=position-1;
        for (int i=0; i<size; i++){
            if (position < size){
                if(i==pos){
                    //skip position index and move next
                }else {
                    System.out.print(num[i] + ", ");
                }
            }else {
                System.out.print(" not");
                break;
            }
        }
    }
}

//given input size =5, arr=10 20 30 40 50, pos = 2 , output - 10 30 40 50
//given input size =5, arr=10 20 30 40 50, pos = 7 , output - Element Not Found(OutOfBound)