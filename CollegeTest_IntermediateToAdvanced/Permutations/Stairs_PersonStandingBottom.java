package CollegeTest_IntermediateToAdvanced.Permutations;

public class Stairs_PersonStandingBottom {
    public static long stair(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(n==1 || n==2) return n;
        long[] storage = new long[n+1];
        storage[0]=1;
        storage[1]=1;
        for(int i=2; i<=n; i++){
            storage[i] = storage[i-2]+storage[i-1];
        }
        return storage[n];
    }
    public static void main(String[] args) {
        int n = 5;
        long ans = stair(n);
        System.out.println("Number of ways = "+ans);
    }
}
/*
int n=5;
Number of ways = 8
 */
/*
There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs
at a time.
• Count the number of ways, the person can reach the top.
Sample Input
5
Sample Output
Number of ways
For example:
Input Result
5
Number of ways
 */