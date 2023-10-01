package CollegeTest;

import java.util.Scanner;

public class Array_Assessment2_StocBuySellMaxProfit2 {
    public static void findsk(int[] stock){
        int len = stock.length;
        int min=0,max=0,buy=0,sel=0;
        for(int i=1; i<len; i++){
            if (stock[i] < stock[min]){
                min=i;
            }
            int currPr = stock[i]-stock[min];
            if (currPr > max){
                max =currPr;
                buy=min+1;
                sel=i+1;
            }
        }
        System.out.println("Day of buying : "+buy);
        System.out.println("Day of selling : "+sel);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int[] stock = new int[size];
        System.out.println("Enter Stock element : ");
        for(int i=0; i<size; i++){
            stock[i]= sc.nextInt();
        }
        findsk(stock);
    }
}
