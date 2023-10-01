package CollegeTest.S3Level2.Best;

public class RemoveNthOccurance {
    public static String removeNthOcc(String str,String target,int n){
        int idx =-1;
        for(int i=0; i<n; i++){
            idx = str.indexOf(target,idx+1);
            if(idx==-1){
                return str;
            }
        }

        String beforeOcc = str.substring(0,idx);
        String afterOcc = str.substring(idx+target.length()).trim();
        return beforeOcc+afterOcc;
    }
    public static void main(String[] args) {
        String str = "Hello What do you think? Hello here we come";
        int index = 2;
        String target = "Hello";

        String result = removeNthOcc(str,target,index);
        System.out.println(result);

    }
}
