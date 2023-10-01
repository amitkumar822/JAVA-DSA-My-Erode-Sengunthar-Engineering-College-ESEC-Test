package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class TripletsSumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
//        int[] arr = {-1,1,0,2,-2};
        //-1 1 0,,0 2 -2
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        boolean isFound = true;
        for(int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                for (int k=j+1; k<len; k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("Elements are "+arr[i]+" "+arr[j]+" "+arr[k]);
                        isFound = false;
                    }
                }
            }
        }

        if(isFound){
            System.out.println("No Elements Found");
        }
    }
}
