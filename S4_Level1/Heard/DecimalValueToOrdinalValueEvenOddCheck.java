package CollegeTest.S4_Level1.Heard;

import java.util.Scanner;

public class DecimalValueToOrdinalValueEvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // Read the input as a single line
        str = str.substring(1, str.length() - 1); // Remove brackets
        String[] s = str.split(","); // Split the strings

        int m = sc.nextInt(); // Exponent

        long tVal = 0; //Total value

        for (String st : s) {
            long stVal = 1;

            for (char c : st.toCharArray()) {
                int charValue = (int) c;
                stVal *= powerWithMod(charValue, m);
                stVal %= 2; // Calculate modulo 2 to keep the result small
            }

            tVal += stVal;
            tVal %= 2; // Calculate modulo 2 for the total value as well
        }

        if (tVal == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        sc.close();
    }

    private static long powerWithMod(long base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % 2;
            }
            base = (base * base) % 2;
            exponent /= 2;
        }
        return result;
    }
}

/*
input: ['abcdefghijklmnopqrstuvwxyz','pqrs','ops']
input: 12
output: EVEN

------
input1:
['ace','oqs','oqs']
5
output1: ODD
input2:
['dg','pqs']
3
output2: EVEN
 */
