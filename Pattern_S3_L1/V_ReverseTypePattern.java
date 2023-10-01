package CollegeTest.Pattern_S3_L1;

public class V_ReverseTypePattern {
    public static void main(String[] args) {
        int n=7;
        char ch = 65;
        char kr = 65;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(ch);
                ch++;
                kr = ch;
                kr--;
            }
            ch=65;
            for (int j=1; j<=2*(i-1); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n-i+1; j++){
                System.out.print(kr);
                kr--;
            }
            System.out.println();
        }
    }
}

/*
ABCDEFGGFEDCBA
ABCDEF  FEDCBA
ABCDE    EDCBA
ABCD      DCBA
ABC        CBA
AB          BA
A            A
 */