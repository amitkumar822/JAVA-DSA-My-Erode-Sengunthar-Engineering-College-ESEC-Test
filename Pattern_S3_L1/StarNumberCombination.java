package CollegeTest.Pattern_S3_L1;

public class StarNumberCombination {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
                if(j!=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
                if(j!=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
/*
1
1 *2
1 *2 *3
1 *2 *3 *4
1 *2 *3 *4
1 *2 *3
1 *2
1
 */