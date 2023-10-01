package CollegeTest;

public class LCM_GCD_HCF {
    static int printHCF(int x,int y){
        if(y==0) return x;
        return printHCF(y,x%y);
    }
    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 24;
        int hcf = printHCF(n1,n2);
        int lcm = (n2*n1)/hcf;
        System.out.println("LCM is : "+lcm);
        System.out.println("GCD is : "+hcf);
    }
}
