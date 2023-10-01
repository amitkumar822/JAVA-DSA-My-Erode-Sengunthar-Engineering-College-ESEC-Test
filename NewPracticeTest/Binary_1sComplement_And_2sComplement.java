package CollegeTest.A_NewPracticeTest;

public class Binary_1sComplement_And_2sComplement {
    public static void main(String[] args) {
        String binaryNumber = "0111"; // Change this to your input binary number

        String onesComplement = calculateOnesComplement(binaryNumber);
        String twosComplement = calculateTwosComplement(onesComplement);

        System.out.println("Original Binary: " + binaryNumber);
        System.out.println("1's Complement: " + onesComplement);
        System.out.println("2's Complement: " + twosComplement);
    }

    public static String calculateOnesComplement(String binaryNumber) {
        StringBuilder onesComplement = new StringBuilder();
        for (char bit : binaryNumber.toCharArray()) {
            if (bit == '0') {
                onesComplement.append('1');
            } else if (bit == '1') {
                onesComplement.append('0');
            } else {
                System.err.println("Invalid input: Binary number should contain only 0s and 1s.");
                return null;
            }
        }
        return onesComplement.toString();
    }

    public static String calculateTwosComplement(String onesComplement) {
        int carry = 1;
        StringBuilder twosComplement = new StringBuilder();

        // Start from the rightmost bit (LSB) and work towards the left (MSB)
        for (int i = onesComplement.length() - 1; i >= 0; i--) {
            char bit = onesComplement.charAt(i);

            // Add the carry to the current bit
            int sum = (bit - '0') + carry;

            // Determine the new bit and update the carry
            if (sum == 2) {
                twosComplement.insert(0, '0');
                carry = 1;
            } else {
                twosComplement.insert(0, (char) (sum + '0'));
                carry = 0;
            }
        }

        // If there's still a carry left, prepend it
        if (carry == 1) {
            twosComplement.insert(0, '1');
        }

        return twosComplement.toString();
    }
}
