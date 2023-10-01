package CollegeTest.S2_Lavel.Pattern;

public class BinaryPattern0101 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((i+j)%2==0?"0":"1");
            }
            System.out.println();
        }
    }
}
/*
0101
1010
0101
1010
 */