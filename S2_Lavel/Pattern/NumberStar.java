package CollegeTest.S2_Lavel.Pattern;

public class NumberStar {
    public static void main(String[] args) {
        int n = 5,k=1;
        String[][] pattern = new String[n][n];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j !=1){
                    String st = ("*"+k++);
                    pattern[i-1][j-1]=st;
                }else{
                    int st = k++;
                    String str = String.valueOf(st);
                    pattern[i-1][j-1]=str;
                }
            }
        }
        //print()
        for(int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

        //lower Patternj
        for(int i=n-1; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}

/*
1
2*3
4*5*6
7*8*9*10
11*12*13*14*15
11*12*13*14*15
7*8*9*10
4*5*6
2*3
1
 */