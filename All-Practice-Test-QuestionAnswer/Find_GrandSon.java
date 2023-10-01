package CollegeTest.BestGrand_Father_Son;

import java.util.Scanner;

public class Find_GrandSon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "{Mohan, Kumar},{Gram, Teresa},{Plum, Green}";
        String str2 = "{Kumar, Kishan}, {Teresa, Param}, {Green, Camaroon}";
        String tr = "Gram";


//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//        String tr = sc.nextLine();

        String ReStr1 = str1.replaceAll("[{\\,\\}]"," ").trim(); // Mohan  Kumar   Gram  Teresa   Plum  Green
        //System.out.println(ReStr1);
        String ReStr2 = str2.replaceAll("[{\\,\\}]"," ").trim(); //Kumar  Kishan    Teresa  Param    Green  Camaroon
        //System.out.println(ReStr2);

        //First String calculate ----------------------------
        String[] FReSt1 = ReStr1.split(" +");
        int count1=0;
        for(String fSt : FReSt1){
            count1++;
        }
        String[] arr1 = new String[count1];
        int r1=0;
        for (String rt1 : FReSt1){
            arr1[r1++] = rt1;
        }
//        for (String res1 : arr1){
//            System.out.print(res1+" ");
//        }

        //------------------------
        //Second String Calculate------
        String[] FReSt2 = ReStr2.split(" +");
        int count2=0;
        for(String fSt : FReSt2){
            count2++;
        }

        String[] arr2 = new String[count2];
        int r2=0;
        for (String rt2 : FReSt2){
            arr2[r2++] = rt2;
        }

//        for (String res2 : arr2){
//            System.out.print(res2+" ");
//        }

        //Start searching target Gram
        String FindTrNext = ""; //Teresa is found
        for(int i=0; i<FReSt1.length; i++){ //Mohan Kumar Gram Teresa Plum Green
            // System.out.print(arr1[i]+" ");
            if(arr1[i].equals(tr)){ //Gram searching
                //System.out.println(arr1[i]);
                FindTrNext= arr1[i+1];
                break;
            }
        }

        //fina search next
        boolean isNotFound = true;
        for (int i=0; i<FReSt2.length; i++){ //Kumar Kishan Teresa Param Green Camaroon
            if(arr2[i].equals(FindTrNext)){ //search Teresa Next
                String result = arr2[i+1];
                System.out.print(result);
                isNotFound=false;
            }
        }
        if (isNotFound){
            System.out.print("-1");
        }

    }
}
