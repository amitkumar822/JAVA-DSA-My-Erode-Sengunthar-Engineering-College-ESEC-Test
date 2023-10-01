package CollegeTest.S3Level2.Best;

import java.util.Arrays;
import java.util.Scanner;

public class longestCommonPrefixStringAmongst {
    static String commonPre(String[] arr){
        Arrays.sort(arr);
        String left = arr[0];
        String right = arr[arr.length-1];
        int idx=0;
        while (idx<left.length() && idx<right.length()){
            if(left.charAt(idx) == right.charAt(idx)){
                idx++;
            }else{
                break;
            }
        }
        return left.substring(0,idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        String[] wd = str.split(" +");
        int len = wd.length;
        String[] arr = new String[len];
        int idx=0;
        for(String rW : wd){
            arr[idx++] = rW;
        }
        String result = commonPre(arr);
        System.out.println(result);
    }
}

/*
inpur:- flower flag flight
output:- fl
 */
