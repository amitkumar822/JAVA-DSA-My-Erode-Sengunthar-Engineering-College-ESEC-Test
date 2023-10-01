package CollegeTest.S3Level2.Heard;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionTheArrayPivotValue {
    static void calPivot(int[] arr,int pivot){ //{9,12,3,5,14,10,10};//12 10 10 9 5 3 14  p13
        int len = arr.length;
        int[] result = new int[len];
        int idx=0;
        StringBuilder sb1 = new StringBuilder(); // 9 12 3 5 10 10
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder(); // 12 14
        for (int res : arr) {   //9,12,3,5,14,10,10
            if(res < pivot) // < 13
//                result[idx++]=res;
                sb1.append(res+" ");
        }
        for(int res : arr){
            if(res == pivot) //  ==13
//                result[idx++] = res;
                sb2.append(res+" ");
        }
        for (int res : arr){  //14
            if (res>pivot) // >13
//                result[idx++] = res;
                sb3.append(res+" ");
        }
        //9 3 5 - 9 5 3   q2 // 9 12 3 5 10 10
        //10 10           q2 // no
        //12 14 - 14 12   q2 // 14
        //result : 12 10 10 9 5 3 14

        //<pivot


        String str1 = sb1.toString();  //9 12 3 5 10 10

        String[] wd = str1.split(" +"); // 3 5 9 10 10 12 short form
        int count =0;
        for(String tt : wd){
            count++;
        }
        String[] word = new String[count]; //9 12 3 5 10 10
        int j=0;
        for(String kt : wd){ //
            word[j++] = kt;
        }
        int[] num = new int[count];
        for (int i=0; i<word.length; i++){
            int d = Integer.parseInt(word[i]);
            num[i] = d;
        }
        Arrays.sort(num);
        for(int i= num.length-1; i>=0; i--){
            System.out.println(num[i]);
        }



        // == pivot
        String eq = sb2.toString();
        if(eq.length() >0) {
            String[] Eq = eq.split(" ");
            for (String Et : Eq) {
                int d = Integer.parseInt(Et);
                System.out.println(d);
            }
        }


        //> pivot

        String str3 = sb3.toString();  //9 12 3 5 10 10

        String[] wd3 = str3.split(" +"); // 3 5 9 10 10 12 short form
        int count3 =0;
        for(String tt : wd3){
            count3++;
        }
        String[] word3 = new String[count3]; //9 12 3 5 10 10
        j=0;
        for(String kt : wd3){ //
            word3[j++] = kt;
        }
        int[] num3 = new int[count3];
        for (int i=0; i<word3.length; i++){
            int d = Integer.parseInt(word3[i]);
            num3[i] = d;
        }

        Arrays.sort(num3);
        for(int i=count3-1; i>=0; i--){
            System.out.println(num3[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {9,12,3,5,14,10,10,13,15,17,13};//12 10 10 9 5 3 13 13 17 15 14
//        int pivot =13;
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int pivot=sc.nextInt();
        calPivot(arr,pivot);
    }
}
/*
size: 7
output : 9 12 3 5 14 10 10
K: 13
output: 12 10 10 9 5 3 14
 */