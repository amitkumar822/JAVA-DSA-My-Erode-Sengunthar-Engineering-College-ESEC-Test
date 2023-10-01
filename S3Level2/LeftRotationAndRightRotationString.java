package CollegeTest.S3Level2;

import java.util.Scanner;

public class LeftRotationAndRightRotationString {
    static String leftrotate(String str, int k){
        String ans = str.substring(k)+str.substring(0,k);
        return ans;
    }
    static String rightrotate(String str, int k){
        return leftrotate(str,str.length()-k);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter digit k time rotate : ");
        int k = sc.nextInt();

        String leftAns = leftrotate(str,k);
        String rightAns = rightrotate(str,k);
        System.out.println("Left Rotation:"+"\""+leftAns+"\"");
        System.out.println("Right Rotation:"+"\""+rightAns+"\"");
    }
}
/*
Enter String : srishakthi
Enter digit k time rotate : 2
output:
Left Rotation:"ishakthisr"
Right Rotation:"hisrishakt"
 */