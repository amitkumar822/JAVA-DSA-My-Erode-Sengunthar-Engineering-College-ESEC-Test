package CollegeTest.Pattern_S3_L1;
public class MaxArrayToDecrease {
    public static void main(String[] args) {
        int n=4, p=1;
//        int[][] num = new int[n][n];
        int max =0;
        for(int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
//               int d = num[i][j] = p++;
                int d=p++;
               if(d>max){
                   max=d;
               }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(max+" ");
                max--;
            }
            System.out.println();
        }
    }
}

/*
10
9 8
7 6 5
4 3 2 1
 */