package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class FindThreeIntegersinTheArrayDestination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 6
        int tr = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==tr){
                        System.out.print(tr);
                        break;
                    }
                }
            }
        }
    }
}
