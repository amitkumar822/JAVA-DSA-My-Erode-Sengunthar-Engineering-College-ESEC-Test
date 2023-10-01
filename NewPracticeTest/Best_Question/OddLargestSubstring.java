package CollegeTest.Best_Question;

import java.util.Scanner;

public class OddLargestSubstring {
    static String findLargestSubstring(String num){
        String largestOdd = "Odd number doesn't exits";
        int maxLength =0;

        for(int i=0; i<num.length(); i++){
            for (int j=i+1; j<num.length(); j++){
                String substring = num.substring(i,j);
                int value = Integer.parseInt(substring);

                if (value % 2 == 1 && substring.length()>maxLength){
                    largestOdd = substring;
                    maxLength = substring.length();
                }
            }
        }
        return largestOdd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit : ");
        String str = sc.nextLine();
        String ans = findLargestSubstring(str);
        System.out.println(ans);
    }
}

//input : 58926
//output : 589