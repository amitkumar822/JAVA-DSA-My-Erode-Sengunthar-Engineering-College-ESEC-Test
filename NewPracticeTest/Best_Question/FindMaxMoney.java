package CollegeTest.Best_Question;

import java.util.Scanner;

public class FindMaxMoney {
    static void getMoney(int a, int b){
        int sum =0;
        for (int i=0; i<a; i=i+2){
            sum += b;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  size: ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            getMoney(a,b);
        }
        sc.close();
    }
}

/* This code question (S2-Level 2 Practices 4)
Find the Maximum money

Finish atten

Given street of houses (a row of houses), each house having some amount of money kept inside; now there is a thief who is going to steal this money but he has a constraint/rule that he cannot steal/rob two adjacent houses. Find the maximum money he can rob.

Input Format

The first line of input contains an integer T denoting the number of test cases.

The first line of each test case is N and money

Output Format

Print maximum money he can rob

Sample Input 0

2

5 10

212

Sample Output 0

30

12

Explanation:

5 houses have 10 each which is 10 10 10 10 10

If the adjacent houses cannot be robbed then the theif has to steal from A C and E houses which total to 30
*/