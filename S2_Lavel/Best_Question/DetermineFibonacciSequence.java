package CollegeTest.S2_Lavel.Best_Question;

public class DetermineFibonacciSequence {
    public static void main(String[] args) {
        int n = 32;
        int a=0,b=1;
        boolean isNot = true;

        for(int i=0; i<=n; i++){
            int c = a+b;
            if(c==n){
                isNot=false;
                System.out.println("True");
                break;
            }
            a=b;
            b=c;
        }
        if (isNot){
            System.out.println("False");
        }
    }
}
