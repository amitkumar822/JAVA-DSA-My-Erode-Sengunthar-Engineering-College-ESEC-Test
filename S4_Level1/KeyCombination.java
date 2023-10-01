package CollegeTest.S4_Level1;

public class KeyCombination {
    static void combination(String digit,String[] kp,String res){
        if(digit.length() == 0){
            System.out.print(res+" ");
            return;
        }
        int currNum = digit.charAt(0)-'0';
        String currChoice = kp[currNum];
        for(int i=0; i<currChoice.length(); i++){
            combination(digit.substring(1),kp,res+currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String digit = "23";
        int d = Integer.parseInt(digit);
        if(d !=1) {
            String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            combination(digit, kp, "");
        }else {
            System.out.println("No combination of string");
        }
    }
}
