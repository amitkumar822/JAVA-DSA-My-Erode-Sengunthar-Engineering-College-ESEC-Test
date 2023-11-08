package CollegeTest_BasicToIntermediate.S4_Assessment;

import java.util.Scanner;

public class EmmaPlayingMobileGame_JumpingOnClouds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Total number of clouds
        int[] clouds = new int[n];

        for (int i = 0; i < n; i++) {
            clouds[i] = scanner.nextInt();
        }

        int jumps = jumpingOnClouds(clouds);
        System.out.println(jumps);

        scanner.close();
    }

    public static int jumpingOnClouds(int[] clouds) {
        int jumps = 0;
        int i = 0;

        while (i < clouds.length - 1) {
            if (i + 2 < clouds.length && clouds[i + 2] == 0) {
                i += 2; // Jump 2 clouds if possible
            } else {
                i += 1; // Otherwise, jump 1 cloud
            }

            jumps++;
        }

        return jumps;
    }
}


/*
Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number
that is equal to the number of the current cloud plus I or 2 . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting position to the last
cloud. It is always possible to win the game. For each game, Emma will get an array of clouds numbered O if they are safe or 1 if they must be avoided. For example indexed from 0..6 . The
number on each cloud is its index in the list so she must avoid the clouds at indexes I and 5. She could follow the following two paths: or . The first path takes 3 jumps while
the second takes 4.
Function Description
Complete the jumpingOnCIouds function in the editor below. It should return the minimum number of jumps required, as an integer.
jumpingOnCIouds has the following parameter(s):
c: an array of binary integers
Input Forrnat:
The first line contains an integer n, the total number of clouds. The second line contains n space-separated binary integers describing clouds Ogign. Constraints:
Output Format
Print the minimum number of jumps needed to win the game.
Sample Input O
7
0 0 1 0 0 1 0
Sample Output O
4
 */