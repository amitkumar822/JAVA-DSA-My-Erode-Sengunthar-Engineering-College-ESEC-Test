package CollegeTest.S3Level2.Heard;

import java.util.Scanner;

public class PoliceThief_GridContains_PoliceCriminal {
    static int maxThiefCaptured(int N,int K,char[][] grid){
        int maxThief =0;
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                if(grid[i][j]=='P'){
                    for (int r=Math.max(0,j-K); r<=Math.min(N-1,j+K); r++){
                        if(grid[i][r] == 'T'){
                            maxThief++;
                            grid[i][r] = 'N';
                            break;
                        }
                    }
                }
            }
        }
        return maxThief;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Col Number : ");
        int N = sc.nextInt();
        System.out.print("Enter Position Thief : ");
        int K = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter element N,P,T(N-Normal,P-Police,T-Thief): ");
        char[][] grid = new char[N][N];
        for (int i=0; i<N; i++){
            grid[i] = sc.nextLine().replaceAll(" ","").toCharArray();
        }
        int result = maxThiefCaptured(N,K,grid);
        System.out.println(result);
    }
}

/*
Enter Row Col Number : 4
Enter Position Thief : 2
Enter element N,P,T(N-Normal,P-Police,T-Thief):
N T N P
T N N P
N N P T
T T P P
output : 4
 */
/*-----------------------------------------------*/

/*QUESTION:-
I give you a grid of size NxN that has the following specifications:

1. Each unit in the grid contains either police or a thief

2 Police can only catch a criminal if both of them are in the same row

3. Each police can only catch one criminal.

4. Police cannot catch a criminal more than k units away from the police

5. Any cell with N means he is a normal person and not a police or thief

You need to find the maximum number of criminals that can be caught in the grid,

Input format

First line: Two space-separated integers N and K

Next N lines: N space-separated characters (denoting each cell in the grid)

Output format

Print the maximum number of thieves that can be caught in the grid.

Code constraints

1 N = 1000

1<= K<= N*N

Sample Input

1

3 1

PTP

TPT

TT P

Output:

Total Thieves = 5

Given that k = 1, a thief who is in the adjacent cell can only be caught

Number of thieves reachable by policemen in Row 1 = 1 Number of thieves reachable by policemen in Row 2 = 2

Number of thieves reachable by policemen in Row 3 = 1

However, one policeman can catch at most 1 thief. Hence, in Row 2, only 1 thief is catchable. Therefore, the 3 thieves can be caught.

For example:

Input

31

NTP

Result

3

NPT

NTP

NTNP

TNNP NNPT
 */