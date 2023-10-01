package CollegeTest;

public class findFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "lovecodinglife";
//        String str = "aabb";
        char[] arr = str.toCharArray();
        int ans =-1;
        for (int i=0; i<str.length(); i++){
            if(str.indexOf(arr[i])==str.lastIndexOf(arr[i])){
                ans = i+1;
                break;
            }
        }
        System.out.println(ans);
    }
}
