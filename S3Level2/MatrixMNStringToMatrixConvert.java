package CollegeTest.S3Level2;

public class MatrixMNStringToMatrixConvert {
    public static void main(String[] args) {
        String str = "{{3,2,1,5},{9,1,3,0}}";
        String st = str.replaceAll("[{,]"," ");
        String[] wd = st.split("}");
        for (String res : wd){
            System.out.println(res.trim());
        }
    }
}
