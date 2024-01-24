package CollegeTest_BasicToIntermediate.Best_Question;

import java.util.Scanner;

public class RobotStringAtPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moves = sc.nextLine();

        boolean result = isRobotAtOrigin(moves);

        if (result==true){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    public static boolean isRobotAtOrigin(String moves) {
        int x = 0;
        int y = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    System.out.println("Invalid move character: " + move);
            }
        }

        return x == 0 && y == 0;
    }
}


/*
There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (O, O) after it completes its moves.
The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot
returns to the origin after it finishes all of its moves, return true. Otherwise, return false.
Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, 'IL" will always make it move left, etc. Also, assume that
the magnitude of the robot's movement is the same for each move.
Example 1:
Input: "LID"
Output: true
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started .
Therefore ,
we return true.
Example 2:
Input .
Output: false
and then down once.
All moves have the same magnitude,
so it ended up at the origin where it started.
Therefore,
Explanation: The robot moves left twice.
It ends up two
"moves "
to the left of the origin.
We return false because it is not at the origin at the end of
For example:
Input
IJDLUDLRR
IJUUULLLLDDDDRRRR
Result
False
True
True
 */