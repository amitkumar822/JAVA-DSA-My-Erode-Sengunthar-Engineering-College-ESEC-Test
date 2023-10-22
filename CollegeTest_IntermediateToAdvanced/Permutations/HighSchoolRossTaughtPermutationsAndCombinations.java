package CollegeTest_IntermediateToAdvanced.Permutations;

import java.util.Scanner;

public class HighSchoolRossTaughtPermutationsAndCombinations {
    public static double factorial(double n){
        double fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double num = sc.nextDouble();;
//        int n = 5; // 120
//        int m=2;//
//        int num = 1000000009; //10.0
        /*
           n!/(r!*(n-r)!)
         */
        double n1 = factorial(n);
        double r = factorial(m);
        double diff = factorial((n-m));
        double ans = (n1/(r*diff))%num;
        System.out.println(ans);
    }
}

/*
In his high school, Ross was taught permutations and combinations. He found it very difficult then but now, he has grown fond of it. He likes calculating the different ways of combining certain things, basically a permutation.
As he likes solving these mathematical questions, in each of the questions, he is faced with a challenge of finding out factorials of very large numbers and Ross does not like it.Hejust wants to be given values and solve the question. So he asked you for
help to find out the following:
• nCrwhere n and r are numbers given by Ross to you
nCr is defined as n! / (r! x (n-r)!)
Here, n! denotes the factorial of a number.Also, you have to calculate this number as modulo m.
Example 1:
inputl: 3
input2: 2
input3: 1000000009
Output : 3
Explanation:
so, 11-1.
so, ncr =
Example 2:
inputl: 5
input2: 2
input3: 1000000009
Output .
• 10
Explanation:
100 so, 31=6.
so, ncr =
Input Format
input I: The number n.
input 2: The number r.
input 3: The number m.
Output Format
The value of nCr%m
Sample Input
3
2
leeeeeeees
Semple Output
 */