package CollegeTest.StringBest;

import java.util.Scanner;

public class EveryElemAdd5Div10AndSwap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        String str = sc.nextLine();
        int len = str.length();

        int[] num = new int[len];
        for(int i=0; i<len; i++){
            int digit = str.charAt(i)-'0';
            int sum = digit+5;  //4+5=9
            int div = sum%10;
            num[i] = div;
        }

        for (int i=0; i<1; i +=2){
            int temp = num[i];
            num[i]=num[i+2];
            num[i+2] = temp;

            int tm = num[i+1];
            num[i+1] = num[i+3];
            num[i+3] = tm;
        }
        int first = num[0];
        if(first != 0){
            System.out.print(num[0]);
        }
        for(int i=1; i<len; i++){ //0943 //3014 //0 1 2 3

            System.out.print(num[i]);
        }
    }
}

//4537
//(4+5)%10,(5+5)%10,(3+5)%10,(7+5)%10  = 9082 (1234)
//swap position 1 with 3(0,2)    : 8092
//swap position 2 with 4 (1,3)   : 8290

/*  Question:-
A company wants to transmit data over the telephone, but is concerned that its phones may be tapped. Develop a program that will encrypt the company's data so that the data may be transmitted more securely. All of its data is transmitted as four-digit integers. The program must read a four-digit integer entered by the user and encrypt it as follows:

Step 1: Replace each digit with the result of adding 5 to the digit and getting the remainder after dividing the new value by 10. Step 2: Swap the first digit with the third

Step 3: Swap the second digit with the fourth

Step 4: Print the encrypted integer.

Explanation:

Input is 4537

(4-5)%10, (5+5) % 10, (3+5 ) % 10, (7+5) %10

9082

Swap position 1 with position 3

8092

Swap position 2 with position 4

8290

Output is 8290
  */
