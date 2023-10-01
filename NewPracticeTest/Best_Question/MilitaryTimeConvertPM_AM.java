package CollegeTest.Best_Question;

import java.util.Scanner;

public class MilitaryTimeConvertPM_AM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        System.out.print("Enter string am or pm: ");
        String am_pm = scanner.next();

        String militaryTime = convertToMilitaryTime(hours, minutes, seconds, am_pm);
        System.out.println("Output Format");
        System.out.println(militaryTime);
    }

    public static String convertToMilitaryTime(int hours, int minutes, int seconds, String am_pm) {
        if (am_pm.equalsIgnoreCase("pm") && hours != 12) {
            hours += 12;
        } else if (am_pm.equalsIgnoreCase("am") && hours == 12) {
            hours = 0;
        }

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
