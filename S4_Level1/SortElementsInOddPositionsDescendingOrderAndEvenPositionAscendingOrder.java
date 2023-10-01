package CollegeTest.S4_Level1;

import java.util.Arrays;
import java.util.Scanner;

public class SortElementsInOddPositionsDescendingOrderAndEvenPositionAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
//        int[] num = {1,2,3,4,5,6,7,8,9,10}; // 9 2 7 4 5 6 3 8 1 10
//        int[] num = {1,2,3,4,5}; // 5 2 3 4 1
        int[] num = new int[len];
        for(int i=0; i<len; i++){
            num[i] = sc.nextInt();
        }
        len = num.length;
        int evlen = len/2;
        int oddlen = len-evlen;
        int[] even = new int[evlen];
        int[] odd = new int[oddlen];
        int e =0;
        int o=0;
        for(int i=0; i<len; i++){
            if((i+1)%2==0){
                even[e] = num[i];
                e++;
            }else {
                odd[o] = num[i];
                o++;
            }
        }
        int[] sort = new int[len];
        int ep = 1;
        for (int i=0; i<evlen; i++){
            sort[ep] = even[i];
            ep +=2;
        }
        Arrays.sort(odd);
        int op = 0;
        for (int i=oddlen-1; i>=0; i--){
            sort[op] = odd[i];
            op +=2;
        }
        for (int res : sort){
            System.out.print(res+" ");
        }
    }
}
