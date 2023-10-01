package CollegeTest;

import java.util.Scanner;

public class MatrixFinddeterminantOfTheGivenMatrix {

    public static double determinat2(double[][] matrix){
        return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
    }
    public static double determinat3(double[][] matrix){
        double a = matrix[0][0],b=matrix[0][1];
        double c = matrix[0][2],d=matrix[1][0];
        double e = matrix[1][1],f=matrix[1][2];
        double g = matrix[2][0],h=matrix[2][1];
        double i = matrix[2][2];

        double det = a*(e*i-f*h)-b*(d*i-f*g)+c*(d*h-e*g);
        return det;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        if( r!=2 && r !=3 && c !=2 && c !=3){
            return;
        }
        double[][] matrix = new double[r][c];
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int determinat;
        if(r==2 && c==2){
            determinat= (int)determinat2(matrix);
        }else{
            determinat = (int)determinat3(matrix);
        }
        System.out.println("Determinant of the matrix ="+determinat);
        sc.close();
    }
}

/*
2 2
1 2 3 4
Determinant of the matrix =-2
 */
/*------------------------*/
/*
3 3
2 1 3
1 0 2
2 0 -2
Determinant of the matrix =6
 */
