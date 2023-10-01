package CollegeTest.S4_Level1.Pattern;

public class PROGRAM_Pattern {

    public static void main(String[] args) {
        String str = "PROGRAM";
        int len = str.length();
        int mid = len/2;
        StringBuilder sb = new StringBuilder();
        for (int i=mid; i<len; i++){
            char ch =str.charAt(i);
            String st = String.valueOf(ch);
            sb.append(st);
        }
        for(int i=0; i<mid; i++){
            char ch =str.charAt(i);
            String st = String.valueOf(ch);
            sb.append(st);
        }

        String st = sb.toString();
        for (int i=0; i<len; i++){
            for (int j=0; j<=i; j++){
                System.out.print(st.charAt(j));
            }
            System.out.println();
        }
    }
}
/*
G
GR
GRA
GRAM
GRAMP
GRAMPR
GRAMPRO
 */