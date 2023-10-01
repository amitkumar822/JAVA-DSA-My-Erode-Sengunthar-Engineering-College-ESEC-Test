package CollegeTest.A_NewPracticeTest.BestQuestion;

import java.util.Scanner;

public class CricketMatchScoreCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String scorecard = "111111"; // Replace this with your scorecard input
        String scorecard = sc.nextLine();
        calculateScore(scorecard);
    }

    public static void calculateScore(String scorecard) {
        if (scorecard.length() != 6) {
            System.out.println("Invalid");
            return;
        }

        int[] batsmanScores = new int[2];
        int bowlerScore = 0;

        int currentBatsman = 0;

        for (int i = 0; i < 6; i++) {
            char ball = scorecard.charAt(i);

            if (ball == '.') {
                // No run
            } else if (ball == 'Y') {
                // Wide ball, only bowler score increases
                bowlerScore++;
            } else if (Character.isDigit(ball)) {
                int runs = Character.getNumericValue(ball);
                batsmanScores[currentBatsman] += runs;

                if (runs % 2 != 0) {
                    // Odd run scored, change the batsman
                    currentBatsman = 1 - currentBatsman;
                }
            } else {
                System.out.println("Invalid");
                return;
            }
        }

        System.out.println("BATSMAN 1: " + batsmanScores[0]);
        System.out.println("BATSMAN 2: " + batsmanScores[1]);
        System.out.println("BOWLER: " + (batsmanScores[0] + batsmanScores[1] + bowlerScore));
    }
}

/*QUESTION:-
Find the score after one over in a cricket match with the given cricket score card
. means no run
Y means it is a WIDE (only bowler score gets added)
Any even number the same batsman faces the next ball
Any odd number the next batsman faces the next ball
6 balls per over
Any other format print invalid
 */
