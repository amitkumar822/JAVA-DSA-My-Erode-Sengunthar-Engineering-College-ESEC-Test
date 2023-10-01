package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class LeftAndRightRotateAlternative {
    public static String leftRotate(String str,int k){
        return str.substring(k)+str.substring(0,k);
    }

    public static String rightRotate(String str,int k){
        return leftRotate(str,str.length()-k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<testCase; i++){
            String str = sc.nextLine();
            int k = sc.nextInt();
            if(i%2==0){
                String result = leftRotate(str,k);
                System.out.println(result);
            }else{
                String result = rightRotate(str,k);
                System.out.println(result);
            }
            sc.nextLine();
        }
    }
}
/*
input:-
3
Hello
1
They
2
Tricker
0
-------
output:
elloH
eyTh
Tricker
 */
/*=======================================================*/
/*
Given a set of strings you should alternatively rotate left and right. Men a string is rotated left the left most character shifts to the rightmost position. When a string is shifted right the right most character gets shifted to the first position. Alternate rows
should be shifted left and right. First row shifts left, second row shifts right, third row shifts left, fourth row shifts right. The number of characters to shift is given in the immediate next line. The very first row has a number N which represents the number of test
cases. The 2nd row has the first string, third row has the number of characters to shift left the 4th row has the second string, fifth row has the number of characters to shift right
Refer to sample input and output for more details.
5
1
Hello
1
ITVAC
2
ITVAC
2
Mencel
In the above, the first row indicates the number of test cases.
The second row gives the string in index O, third row gives the number of positions the string has to shifted left
The fourth row gives the string in index 1, fifth row gives the number of positions the string has to shifted right
Note the integer given after the string determines the number of shifts to be made
Hello when shifted once to the left becomes elloH. The H from first position moves to the last and every other element moves one position to the left.
Hello when shifted once to the right becomes cHeII. The o from last position moves to the first and every other element moves one position to the right.
The left and right shift happens alternatively.
Sample Input
S
1
Hello
1
ITVAC
2
ITVAC
2
Mercel
Sample Output
e110H
OHe11
VACIT
ACITV
Mercel
 */