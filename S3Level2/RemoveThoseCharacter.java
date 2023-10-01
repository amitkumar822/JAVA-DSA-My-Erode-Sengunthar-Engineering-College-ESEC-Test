package CollegeTest.S3Level2;

import java.util.Scanner;

public class RemoveThoseCharacter {
    static String removeThoseChar(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        for(char c : s1.toCharArray()){
            if(s2.indexOf(c) == -1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size How many element test : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter String : ");
        for (int i=0; i<n; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String result = removeThoseChar(s1,s2);
            System.out.println(result);
        }
    }
}
/*
Enter size How many element test :
2
Enter String :
s1:- itvaccodingteam
s2:- caw
output:- itvodingtem
s1:-removeccharaterfrom
s2:-string
output:-emovecchaaefom
 */