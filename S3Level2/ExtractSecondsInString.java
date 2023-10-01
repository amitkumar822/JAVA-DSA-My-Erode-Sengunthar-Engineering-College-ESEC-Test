package CollegeTest.S3Level2;

import java.util.Scanner;

public class ExtractSecondsInString {
    public static void main(String[] args) {
        String str = "Today is time 09:11:34 kdc ldf"; // 33
        //char[] c = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            int d = str.charAt(i)-'0';
            if(d>=0 && d<=9){
                sb.append(d);
            }
        }
        int l = sb.charAt(sb.length()-1)-'0';
        int s = sb.charAt(sb.length()-2)-'0';
        System.out.print(s+""+l);
    }

    public static class AlterAccenDecenSwapElement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size: ");
            int size = sc.nextInt();
            int[] num = new int[size];
            for (int i=0; i<size; i++){
                num[i]= i+1;
            }
    //        int[] num = new int[size];
    //        for (int i=0; i<size; i++){
    //            num[i] = sc.nextInt();
    //        }
    //        int[] num = {1,2,3,4,5};
            int len = num.length;

            int[] res = new int[len*2];
            int i=0,k=0;
            while (i<len){ // 1 0 2 0 3 0 4 0 5 0
                res[k] = num[i];
                i++;
                k +=2;
            }

            int t=1; //1,2,3,4,5
            for (int j=num.length-1; j>=0; j--){ // 1 0 2 0 3 0 4 0 5 0
                res[t] = num[j]; //1 5 2 4 3 3 4 2 5 1
                t +=2;
            }
            //res->1 5 2 4 3 3 4 2 5 1
            System.out.println("Final Swap Element Result : ");
            for (int ans : res){
                System.out.print(ans+" ");
            }
        }
    }
}
