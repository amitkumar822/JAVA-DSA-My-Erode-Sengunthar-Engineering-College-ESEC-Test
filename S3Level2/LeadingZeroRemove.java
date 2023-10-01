package CollegeTest.S3Level2;

import java.util.Scanner;

public class LeadingZeroRemove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "0000021350460";
        String newStr = "";
        int idx =0;
        for (int i=0; i<str.length(); i++){
            char p = str.charAt(i);
            if (p !='0'){
                idx =i;
                break;
            }
        }
        newStr = str.substring(idx,str.length());
        System.out.println(newStr);
    }
}

//output : 21350460