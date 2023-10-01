package CollegeTest.S4_Level1.Qualifying_Assessment;
import java.util.*;
public class MilitaryTimePmAmStringGiven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {
            String time12Hour = scanner.nextLine();
            String time24Hour = convertTo24HourFormat(time12Hour);
            System.out.println(time24Hour);
        }
    }

    public static String convertTo24HourFormat(String time12Hour) {
        String[] parts = time12Hour.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1].substring(0, 2));
        int second = Integer.parseInt(parts[2].substring(0, 2));
        String ampm = parts[2].substring(2);

        if (ampm.equals("PM") && hour != 12) {
            hour += 12;
        } else if (ampm.equals("AM") && hour == 12) {
            hour = 0;
        }

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
/*input:-
1
10:20:23PM
22:20:23
 */