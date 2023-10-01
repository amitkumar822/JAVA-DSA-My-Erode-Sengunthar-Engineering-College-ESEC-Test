package CollegeTest.S4_Level1.Heard;

public class LetterValueCheckaaaaaaaaaa {

    public static int calculateNumericalValue(String word) {
        StringBuilder sb = new StringBuilder();
        for (char letter : word.toCharArray()) {
            sb.append((int) (letter - 'a'));
        }
        return Integer.parseInt(sb.toString());
    }

    public static boolean isSumEqual(String firstword, String secondword, String targetword) {
        return calculateNumericalValue(firstword) + calculateNumericalValue(secondword) == calculateNumericalValue(targetword);
    }

    public static void main(String[] args) {
        String firstword = "acb";
        String secondword = "cba";
        String targetword = "cdb";
        boolean output = isSumEqual(firstword, secondword, targetword);
        System.out.println(output); // This should print: true
    }
}
