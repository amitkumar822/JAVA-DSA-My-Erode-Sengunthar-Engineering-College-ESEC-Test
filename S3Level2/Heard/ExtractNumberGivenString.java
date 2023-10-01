package CollegeTest.S3Level2.Heard;

import java.util.Scanner;

public class ExtractNumberGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        sc.nextLine();
        for (int j=0; j<n; j++) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                int d = str.charAt(i) - '0';
                if (d >= 0 && d <= 9) {
                    sb.append(d);
                } else if (d == -16) {
                    sb.append(" ");
                }
            }
            String st = sb.toString();
            String lt = st.replaceAll(" +", " ").trim();
            String[] kt = lt.split(" ");

            StringBuilder newSb = new StringBuilder();
            for (String lg : kt) {
                if (!(lg.contains("9"))) {
                    newSb.append(lg + " ");
                }
            }
            String kns = newSb.toString().trim();
            int ls = kns.length();
            if(ls !=0) {
                System.out.println(kns);
            }else {
                System.out.println("-1");
            }
        }
    }
}

/*
Enter size : 1
Hello23 indai345 53 rhd98 34
output : 23 345 53 34
 */