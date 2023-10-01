package CollegeTest;

import java.util.Scanner;

public class FindSameUnicNumber {
    /*
          Find unic
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you size : ");
        int size1 = sc.nextInt();
        int[] num1 = new int[size1];
        System.out.println("Enter 1st " +
                "ZZ_StartingTimePr.Array "+size1+" number : ");
        for(int i=0; i<size1; i++){
            num1[i] = sc.nextInt();
        }

        System.out.println("Enter 2nd size : ");
        int size2 = sc.nextInt();
        System.out.println("Enter 1st ZZ_StartingTimePr.Array "+size1+" number : ");
        int[] num2 = new int[size2];
        for (int i=0; i<size2; i++){
            num2[i] = sc.nextInt();
        }

        System.out.println("Final Result here : ");
        boolean check = true;
        for (int i=0; i<size1; i++){
            for (int j=0; j<size2; j++){
                if (num1[i] == num2[j]){
                    System.out.println(num1[i]);
                    check = false;
                    break;
                }
            }
        }
        if (check){
            System.out.println("No");
        }
    }
}
