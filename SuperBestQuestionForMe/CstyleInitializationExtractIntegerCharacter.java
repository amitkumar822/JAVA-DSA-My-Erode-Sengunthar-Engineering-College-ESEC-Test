package CollegeTest.A_A_SuperBestQuestionForMe;

import java.util.Scanner;

public class CstyleInitializationExtractIntegerCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
//        String st = "int i,k=10;int a=-10;char b='c'";
        String str = st.replaceAll(",",";");
//        System.out.println(str);
        String[] wd = str.split(";");
        for (String sss : wd){
            boolean isEqual = false;
            for (char ch : sss.toCharArray()){
                if(ch=='='){
                    isEqual=true;
                    break;
                }
            }
            if(isEqual){// = match
                //k=10 or int a=-10
                String[] wk = sss.split(" ");
                for (String ss : wk) {
                    if (!(ss.equals("int"))) { //(!(ss.equals("int") || (ss.equals("char"))))
                        if(ss.equals("char")){
                            System.out.println("Characters");
                        }else {
                            System.out.println(ss);
                        }
                    }
                }
            }
            if (!isEqual){
                String[] wl = sss.split(" ");
                //int i
                for (String rs : wl){
                    if(rs.equals("int")){
                        System.out.println("Integers");
                    } else if (rs.equals("char")) {
                        System.out.println("Characters");
                    }else {
                        System.out.println(rs+"="+"junk");
                    }
                }
            }
        }

    }
}
/*
output:-
Integers
i=junk
k=10
a=-10
Characters
b='c'
 */

/*
Given a C style initialization statement find the variable types and values. Only int and char are allowed.
If a variable is not initialized it should be marked as "junk".
Sample Input 1
int s='a'
Sample Output 1
Integers
b=junk
a=1Ø
Characters
s='a
Sample Input 2
int b='c' ,
Sample Output 2
Integers
i —junk
k=le
a=-10
Characters
b='c'
 */