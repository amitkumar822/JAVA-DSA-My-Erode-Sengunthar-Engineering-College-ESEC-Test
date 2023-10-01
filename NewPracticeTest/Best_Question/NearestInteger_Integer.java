package CollegeTest.Best_Question;
import java.util.Scanner;

public class NearestInteger_Integer {
    public static int NearestInteger(int num, int m) {
        int nearestLarger = (num / m) * m; // Find the largest multiple of m less than or equal to num
        int nearestSmaller = nearestLarger + m; // Find the smallest multiple of m greater than num

        // Calculate the distances from num to nearestLarger and nearestSmaller
        int distanceLarger = Math.abs(num - nearestLarger);
        int distanceSmaller = Math.abs(num - nearestSmaller);

        // Check if both distances are equal
        if (distanceLarger == distanceSmaller) {
            // If there are two numbers with equal distance, return the larger one
            return Math.max(nearestLarger, nearestSmaller);
        } else if (distanceLarger < distanceSmaller) {
            // If nearestLarger is closer to num, return nearestLarger
            return nearestLarger;
        } else {
            // Otherwise, return nearestSmaller
            return nearestSmaller;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        System.out.print("Enter num: ");
        int num = scanner.nextInt(); //67

        System.out.print("Enter m: "); //8
        int m = scanner.nextInt();

        int result = NearestInteger(num, m);
        System.out.println("Result: " + result); //64

//        String strNum = scanner.nextLine();
//        String strM = scanner.nextLine();
//        String[] wdNum = strNum.split(" +");
//        String[] wdM = strM.split(" +");
//        int num = Integer.parseInt(wdNum[1]);
//        int m = Integer.parseInt(wdM[1]);
//        int result = NearestInteger(num,m);
//        System.out.println(result);

        scanner.close();
    }
}
