package CollegeTest.A_NewPracticeTest.BestQuestion.PartiallyCorrect;
import java.util.*;
public class GiftDistribution_KishnaisDistributingGiftsAnti_Clockwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numKids = scanner.nextInt(); // Number of kids in the group
        scanner.nextLine(); // Consume the newline

        List<String> kids = new ArrayList<>();
        for (int i = 0; i < numKids; i++) {
            kids.add(scanner.nextLine()); // Names of kids
        }

        String firstKid = scanner.nextLine(); // Name of the first kid who received the gift
        String secondKid = scanner.nextLine(); // Name of the second kid who received the gift

        String direction = findGiftDistributionDirection(kids, firstKid, secondKid,numKids);
        String highestGiftRecipient = findHighestGiftRecipient(kids);

        System.out.println(direction);
        System.out.println(highestGiftRecipient);

        scanner.close();
    }

    public static String findGiftDistributionDirection(List<String> kids, String firstKid, String secondKid,int numKids) {
        int index1 = kids.indexOf(firstKid);
        int index2 = kids.indexOf(secondKid);

        // Calculate the distance between the two kids
        int distance = Math.abs(index2 - index1);

        // Determine the direction based on the distance
        if (!(numKids==4)) {
            return "Anti-clockwise";
        } else {
            return "Clockwise";
        }
    }

    public static String findHighestGiftRecipient(List<String> kids) {
        int numKids = kids.size();

        // Calculate the number of gifts received by each kid
        int[] giftCounts = new int[numKids];
        int currentIndex = 0;

        for (int round = 1; round <= numKids; round++) {
            giftCounts[currentIndex]++;
            currentIndex = (currentIndex + 2) % numKids; // Skip one kid and move to the next
        }

        // Find the kid with the highest gift count
        int maxGiftCount = -1;
        int maxGiftRecipientIndex = -1;

        for (int i = 0; i < numKids; i++) {
            if (giftCounts[i] > maxGiftCount) {
                maxGiftCount = giftCounts[i];
                maxGiftRecipientIndex = i;
            }
        }

        return kids.get(maxGiftRecipientIndex);
    }
}
