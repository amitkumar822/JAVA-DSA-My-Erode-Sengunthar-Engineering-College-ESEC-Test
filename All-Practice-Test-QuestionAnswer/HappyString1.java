package CollegeTest;

import java.util.Scanner;

public class HappyString1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        boolean isHappy = isHappyString(inputString);
        if (isHappy) {
            System.out.println("Output: HAPPY");
        } else {
            System.out.println("Output: NOT HAPPY");
        }
    }

    public static boolean isHappyString(String inputString) {
        int[] vowelCount = new int[5]; // 'a', 'e', 'i', 'o', 'u'
        for (char c : inputString.toCharArray()) {
            switch (Character.toLowerCase(c)) {
                case 'a':
                    vowelCount[0]++;
                    break;
                case 'e':
                    vowelCount[1]++;
                    break;
                case 'i':
                    vowelCount[2]++;
                    break;
                case 'o':
                    vowelCount[3]++;
                    break;
                case 'u':
                    vowelCount[4]++;
                    break;
            }
        }

        for (int count : vowelCount) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
