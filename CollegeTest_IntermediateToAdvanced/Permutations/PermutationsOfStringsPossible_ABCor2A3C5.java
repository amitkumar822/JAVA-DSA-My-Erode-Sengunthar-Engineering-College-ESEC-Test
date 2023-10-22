package CollegeTest_IntermediateToAdvanced.Permutations;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationsOfStringsPossible_ABCor2A3C5 {
    public static String[] permutation(String str){
        if(str.length()==0){
            String res[] = {""};
            return res;
        }
        String[] ans = permutation(str.substring(1));
        String[] output = new String[ans.length*str.length()];
        int k=0;
        for (int i=0; i<ans.length; i++){
            for (int j=0; j<=ans[i].length(); j++){
                output[k++] = ans[i].substring(0,j)+str.charAt(0)+ans[i].substring(j);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "2A3C5";
        String[] result = permutation(str);
        System.out.println(result.length);
        Arrays.sort(result);
        for (String ans : result){
            System.out.println(ans);
        }
    }
}

/*
Permutation
Write a program to print the number of permutations of strings possible and the strings.
None of the given characters should be repeated
Sample Input
ABC
Sample Output
6
ABC
ACB
BAC
BCA
CAB
CBA
 */
