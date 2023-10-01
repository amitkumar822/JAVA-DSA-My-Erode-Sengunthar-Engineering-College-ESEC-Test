package CollegeTest;

public class LetterValueNumericalValue {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String s1 = "acb"; // 021-> 21
        String s2 = "cba";//210
        String s3 = "cdb"; //231

//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        String s3 = sc.nextLine();

        String d1 = "";
        String d2 = "";
        String d3 = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int lenAl = alphabet.length();
        char[] alphabetCh = alphabet.toCharArray();

        for (char ch : s1.toCharArray()){
            for (int i=0; i<lenAl; i++){
                if(ch==alphabetCh[i]){
                    d1 += i;
                }
            }
        }

        for (char ch : s2.toCharArray()){
            for (int i=0; i<lenAl; i++){
                if(ch==alphabetCh[i]){
                    d2 += i;
                }
            }
        }

        for (char ch : s3.toCharArray()){
            for (int i=0; i<lenAl; i++){
                if(ch==alphabetCh[i]){
                    d3 += i;
                }
            }
        }
        int ans1 = Integer.parseInt(d1);
        int ans2 = Integer.parseInt(d2);
        int ans3 = Integer.parseInt(d3);

        if((ans1+ans2)==ans3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
