package CollegeTest;

import java.util.Scanner;

public class BinaryToOctalConvert {
    public static void main(String[] args) {
        String binary = "00110111";
        int decimal = Integer.parseInt(binary,2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number : "+octal);
    }
}
