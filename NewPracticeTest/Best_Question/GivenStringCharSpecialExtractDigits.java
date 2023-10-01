package CollegeTest.Best_Question;

import java.util.Scanner;

public class GivenStringCharSpecialExtractDigits {
    static String extractInteger(String str){
        StringBuilder sb = new StringBuilder();
        boolean nbStr = false;

        for (char c : str.toCharArray()){
            if (Character.isDigit(c)){
                sb.append(c);
                nbStr = true;
            } else if (nbStr) {
                sb.append(" ");
                nbStr = false;
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter "+size+" String: ");
        for (int i=0; i<size; i++){
            String str = sc.nextLine();
            String result = extractInteger(str);
            System.out.println(result);
        }

    }
}
/*
Enter size: 1
Enter 1 String: 1a56b__c35ddgshse 99fgh, dd11
output : 1 56 35 99 11
 */