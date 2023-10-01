package CollegeTest.S4_Level1;

import java.util.Scanner;

public class ReverseStringKeepingPunctuation {
    static String reversePunctuation(String str){
        char[] arr = str.toCharArray();
        int left =0;
        int right = arr.length-1;
        while (left<right){
            while (left<right && !Character.isLetterOrDigit(arr[left])){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "A man, in the boat says: I see 1-2-3 in the sky";
        String str = sc.nextLine();
        String res = reversePunctuation(str);
        System.out.println(res);
    }
}

