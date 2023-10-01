package CollegeTest.Best_Question;

import java.util.Scanner;

public class MiniDiffPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t time number : ");
        int t = sc.nextInt();
        System.out.println("Enter size : ");
        int len = sc.nextInt();
        System.out.println("Enter "+len+" element: ");
        int n[] = new int[len];
        for (int j=1; j<=t; j++) {
            for (int i = 0; i < len; i++) {
                n[i] = sc.nextInt();
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                int a = n[i];
                int b = n[j];
                int sub = b-a;
                if(a !=0 && b !=0) {
                    if (sub < min) {
                        min = sub;
                    }
                }
            }
        }
        System.out.println("Final Result : ");
        if(min >0){
            System.out.print(min);
        }else {
            System.out.print("Invalid");
        }
    }
}
/*
Enter t time number :
1
Enter size :
5
Enter 5 element:
2 4 5 7 9
Final Result : 1

second input:
Enter t time number :
1
Enter size :
7
Enter 7 element:
1 5 0 0 1 2 3
Final Result : Invalid
 */