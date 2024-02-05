package CollegeTest_BasicToIntermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spiral2D_Array_SpiralMatrix {
    static List<Integer> spiralAntiClockWise(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        if(row==0) return list;
        int l=0,r=col-1,t=0,b=row-1,d=0;

        while (l<=r && t<=b){
            if(d==0){
                for(int i=t; i<=b; i++){
                    list.add(matrix[i][l]);
                }
                d=1;l++;
            } else if (d == 1) {
                for (int i=l; i<=r; i++){
                    list.add(matrix[b][i]);
                }
                d=2;b--;
            } else if (d == 2) {
                for (int i=b; i>=t; i--){
                    list.add(matrix[i][r]);
                }
                d=3;r--;
            } else if (d == 3) {
                for (int i=r; i>=l; i--){
                    list.add(matrix[t][i]);
                }
                d=0;t++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
//        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        List<Integer> ans = spiralAntiClockWise(matrix);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}

/*
Given a 2D array, print it in spiral form. See the following examples.
4
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

output:-1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7
 */