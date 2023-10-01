package CollegeTest.Pattern_S3_L1;

public class RowColSameNbChar {
    public static void main(String[] args) {
        int n=4;

        char ch = 97;
        int nb = 1;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==j){
                    System.out.print(nb+" ");
                    ch++;
                    nb+=n+1;
                }else {
                    System.out.print(ch+" ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}


/*
int n=4 output:-
1 b c d
e 6 g h
i j 11 l
m n o 16
 */
