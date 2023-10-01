package CollegeTest;

import java.util.Scanner;

public class CoffeeDrink {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int size1 = size+1;
        int[] num = new int[size1];
        for (int i=0; i<size1; i++){
            num[i] = sc.nextInt();
        }

        int first = num[0];
        int fd = first;
        int last = num[num.length-1];

        int ans = -1;
        for (int i=0; i<last-1; i++){
            fd /=2;
            ans = fd;
        }
        System.out.println(ans);
    }
}

//input size =1;
// element 10 3
// ans 2, (10/2=5, 5/2=2(ans))


/*
Question
Geek loves to drink cold coffee after coding for long hours. One fine day a Geek went to his favorite coffee shop in the town and asked for a cup of cold coffee. The shopkeeper told him that he is their lucky customer and had an offer for the Geek. The offer was that for an amount of N they will fill Geek's cup with N units of cold coffee and after consuming initial N units of coffee the shopkeeper will again refill his cup with half the amount of coffee that Geek consumed in previous refill, and will keep on refilling his cup by half of the previous cycle till the amount to refill becomes nil i.e. 0 (Assume Geek can consume infinite amount of coffee and shop also has infinite amount coffee). Now Geek is curious to know that how many units of coffee will Geek get for Mth refill Being Geek's friend help him out.

Input Format

The first line of the input contains an integer T, denoting the number of test cases. The T test case follow. The only line of each test case contains two space separated integers N and M respectively.

Constraints

1<=T<=104 1<=N<=109 1<=M<=103

Output Format

For each test case output a single integer on a new line denoting the required answer.

Sample Input O

1

18 3

Sample Output 0

2

Explanation 0

1st Fill: Geek will get 10 units of Coffee 2nd Fill: 10/2 = 5 units 3rd Fill: 5/2 = 2 units
 */
