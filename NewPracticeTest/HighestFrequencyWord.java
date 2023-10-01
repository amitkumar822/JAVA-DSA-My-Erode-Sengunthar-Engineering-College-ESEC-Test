package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class HighestFrequencyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "Way to Way. I said Way to go!";
//        String str = "What is this?";
        String str = sc.nextLine();
        String[] word = str.split(" +");
        int len = word.length;
        String[] arr = new String[len];
        int idx=0;
        for(String wd : word){
            arr[idx++]=wd;
        }
        boolean isNotFound = true;
        for(int i=0; i<len; i++){
            boolean isF=false;
            for (int j=i+1; j<len; j++){
                if(arr[i].equals(arr[j])){
                    isNotFound=false;
                    isF=true;
                    System.out.println(arr[j]);
                    break;
                }
            }
            if(isF){
                break;
            }
        }
        if (isNotFound){
            System.out.println("None");
        }
    }
}

/*
Find the Highest Frequency Word
Input:
Way to Way. I said Way to go!
Output:
way
Input:
Return to the base. Right now. Return
Output
Return
Input:
What is this?
Output
None
 */