package CollegeTest;

import java.util.Scanner;

public class Array_Assessment2_StocBuySellMaxProfit {
    public static void main(String[] args) {
        // zero index not working 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter Element array : ");

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        int max=0, buy=0,sell=0;  //201 230 100 235 665 23 400
        int min=num[0]; //201

        for(int i=1; i<size; i++){
            if (num[i] < min){ //23 <100
                min=num[i];
                buy=i+1;  //5
            }
        }

        System.out.println("Day of buying : "+buy);
        for (int i=buy; i<size; i++){
            if (num[i] > max){
                max=num[i];
                sell=i+1;
            }
        }
        System.out.println("Day of Selling : "+sell);
    }
}
