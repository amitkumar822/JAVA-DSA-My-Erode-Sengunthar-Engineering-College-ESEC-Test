package CollegeTest_BasicToIntermediate.A_A_SuperBestQuestionForMe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NextDateForGivenDay_FindTheNextDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input date in the format dd/MM/yyyy
//        String inputDate = "31/01/2022";
        String inputDate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
        Calendar calendar = Calendar.getInstance();

        try {
            // Parse the input date
            Date date = sdf.parse(inputDate);
            calendar.setTime(date);

            // Add one day to the date
            calendar.add(Calendar.DAY_OF_MONTH, 1);

            // Format and print the next date
            String nextDate = sdf.format(calendar.getTime());
            System.out.println(nextDate);
        } catch (ParseException e) {
            System.err.println("Invalid date format. Please use d/M/yyyy format.");
        }
    }
}
/*
Find the next date for a given day.
Input
31/1/2022
Output
1/2/2022
For example:
Input
31/1/2022
Result
1/2/2022
 */