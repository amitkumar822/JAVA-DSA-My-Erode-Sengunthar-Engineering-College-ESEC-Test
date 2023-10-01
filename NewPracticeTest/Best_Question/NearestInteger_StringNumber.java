package CollegeTest.Best_Question;

public class NearestInteger_StringNumber {
    static int closerNearestNumber(int num,int m){
        int nearestLarger = (num/m)*m;
        int nearestSmaller = nearestLarger+m;

        int distanceLarger = Math.abs(num - nearestLarger);
        int distanceSmaller = Math.abs(num - nearestSmaller);

        if (distanceSmaller == distanceLarger){
            return Math.max(nearestLarger,nearestSmaller);
        } else if (distanceLarger < distanceSmaller) {
            return nearestLarger;
        }else{
            return nearestSmaller;
        }
    }
    public static void main(String[] args) {
        String stNum = "num: 67";
        String stM = "m: 8";

        String[] wdNum = stNum.split(" ");
        int num = Integer.parseInt(wdNum[1]);

        String[] wdM = stM.split(" ");
        int m = Integer.parseInt(wdM[1]);

        int result = closerNearestNumber(num,m);
        System.out.println(result);
    }
}
