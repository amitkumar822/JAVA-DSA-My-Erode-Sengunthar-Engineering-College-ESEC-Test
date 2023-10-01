package CollegeTest.S2_Lavel.Qualifying_Assessment;

import java.util.Scanner;

public class PrimeFibonacciAlternatingPrint {
    static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    //alternate program(marge)
    static void alternateMarge(int[] arr1,int[] arr2, int len1, int len2, int[] arr3){
        int i=0,j=0,k=0;

        //traverse both array
        while (i<len1 && j<len2){
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }

        //store remaining element of first array
        while (i<len1){
            arr3[k++]=arr1[i++];
        }

        //store remaining element of second array
        while (i<len2){
            arr3[k++]=arr2[i++];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.MAX_VALUE;
        System.out.println("Enter size :");
        int size = sc.nextInt();
        int[] num1 = new int[size];
        // prime program
        int count =0;
        int j=0;
        for (int i=1; i<num; i++){
            if (isPrime(i)){
                count++;
                num1[j] =i;
                j++;
                if(count==size){
                    break;
                }
            }
        }


        //fibonacci program
        int[] num2 = new int[size];
        int a=0,b=1;
        num2[0] = a;
        num2[1] = b;
        int ct =2;
        for(int i=2; i<num; i++){
            ct++;
            int c = a+b;
            num2[i]=c;
            if (ct == size){
                break;
            }
            a=b;
            b=c;
        }


        //Marge alternate
        int len1 = num1.length;
        int len2 = num2.length;
        int[] arr = new int[len1+len2];

        alternateMarge(num1,num2,len1,len2,arr);
        for (int ans : arr){
            System.out.print(ans+" ");
        }

    }
}
