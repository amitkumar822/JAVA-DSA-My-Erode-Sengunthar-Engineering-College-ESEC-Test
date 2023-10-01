package CollegeTest.Pattern_S3_L1;

public class BarfiPattern {
    public static void main(String[] args) {
        int n=3;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("a");
            }
            for (int j=1; j<=i-1; j++){
                System.out.print("a");
            }
            System.out.println();
        }

        for (int i=n-1; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("a");
            }
            for (int j=1; j<=i-1; j++){
                System.out.print("a");
            }
            System.out.println();
        }
    }
}


/*
  a
 aaa
aaaaa
 aaa
  a
 */