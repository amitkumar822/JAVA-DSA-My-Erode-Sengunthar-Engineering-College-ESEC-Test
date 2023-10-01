package CollegeTest.A_NewPracticeTest;

import java.util.Scanner;

public class Amount_MinimumNumberOfNotes {
    static void NotesCounts(int amount,int[] notes,int[] notesCount){
        for(int i=0; i<notes.length; i++){
            notesCount[i] = amount/notes[i];
            amount = amount%notes[i];
        }
        boolean isNot = false;
        for (int i=0; i<notes.length; i++){
            int max=0;
            int d=notesCount[i];
            if(d>max){
                max=d;
            }
            if(max<4){
                System.out.println(notes[i]+": "+notesCount[i]);
            }else {
                isNot=true;
                break;
            }
        }
        if (isNot){
            System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = {500,100,50,20,10,5,2,1};
        int[] notesCount = new int[notes.length];

        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            int amount = sc.nextInt();
            NotesCounts(amount,notes,notesCount);
        }
    }
}

/*
Write a Program to get amount as input from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, and l)required for the amount. How many minimum number of notes required for the given amount
in Programming. Program to find minimum number of notes required for the given denomination. Logic to find minimum number of denomination for a given amount in Program.
Input Format
The first line of input is the integer T, denoting number of test cases. The first line of each test case is an amount N
Constraints
Output Format
For each test case, there is an output i.e. minimum number of denomination for a given amount.
Sample Input O
1
1002e
Sample Output O
Invalid Input
Sample Input 1
2
575
1070
Sample Output 1
500: 1
1
5:
1
500: 2
1
1:
 */
