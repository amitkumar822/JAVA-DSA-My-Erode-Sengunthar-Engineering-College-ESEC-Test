package CollegeTest.Pattern_S3_L1;

public class K_typePattern {
    public static void main(String[] args) {
        int n=5;
        int p=1;

        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
}
