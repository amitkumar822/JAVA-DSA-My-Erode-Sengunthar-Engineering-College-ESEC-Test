package CollegeTest.S4_Level1.Heard;

public class removeUnbalancedParentheses {
    static String removeExtraParentheses(String str){
        char[] arr = str.toCharArray();
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]=='('){
                count++;
            } else if (arr[i] == ')') {
                if (count>0){
                    count--;
                }else {
                    arr[i]=0;
                }
            }
        }
        count=0;
        for (int i=arr.length-1; i>=0; i--){
            if(arr[i]==')'){
                count++;
            } else if (arr[i] == '(') {
                if (count>0){
                    count--;
                }else {
                    arr[i]=0;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : arr){
            if(ch !=0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "(((ab)"; // (ab)
        String result = removeExtraParentheses(str);
        System.out.println(result);
    }
}
