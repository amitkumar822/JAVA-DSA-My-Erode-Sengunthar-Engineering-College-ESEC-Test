package CollegeTest.A_NewPracticeTest.BestQuestion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RottenOranges_matrixOfDimensionMNEmptyCell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] grid = new int[rows][cols];

        System.out.println("Enter the matrix values (0 for empty, 1 for fresh, 2 for rotten):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int time = minTimeToRotOranges(grid);
        if (time == -1) {
            System.out.println("All oranges cannot rot");
        } else {
            System.out.println("All oranges can become rotten in " + time + " time frames.");
        }
    }

    public static int minTimeToRotOranges(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        int time = 0;

        // Initialize the queue with rotten oranges and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean anyRotten = false;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();

                for (int[] dir : directions) {
                    int newRow = curr[0] + dir[0];
                    int newCol = curr[1] + dir[1];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                            && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        queue.offer(new int[]{newRow, newCol});
                        freshOranges--;
                        anyRotten = true;
                    }
                }
            }

            if (anyRotten) {
                time++;
            }
        }

        return freshOranges == 0 ? time : -1;
    }
}

/*
Given a matrix of dimension n where each cell in the matrix can have values Ot 1 or 2 which has the following meaning:
O: Empty cell
1: Cells have fresh oranges
2: Cells have rotten oranges
So we have to determine what is the minimum time required so that all the oranges become rotten. A rotten orange at index [i,j] can rot
other fresh orange at indexes [i-ljl, 1 j], [ij-l], [ij+ll (up, down, left and right). If it is impossible to rot every orange then simply print "All
oranges cannot rot"
Sample Input 1
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1
Sample Output 1
All oranges can become rotten in 2 time frames.
Sample Input 2
3 5
2 1 0 2 1
0 0 1 2 1
1 0 0 2 1
Sample Output 2
All oranges cannot rot
For example:
Input
2
1
1
2
1
1
e
S
1
e
e
e
1
e
e
1
e
2
2
2
2
2
Result
All oranges can become rotten in 2 time frames.
1
1
1
All oranges cannot rot
1
1
 */