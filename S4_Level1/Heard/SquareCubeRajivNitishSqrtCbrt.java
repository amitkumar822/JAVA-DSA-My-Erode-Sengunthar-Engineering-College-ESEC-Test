package CollegeTest.S4_Level1.Heard;

import java.util.Scanner;

public class SquareCubeRajivNitishSqrtCbrt {
    static boolean isSqrt(int sum){
        int sqrt = (int)Math.sqrt(sum);
        return (sqrt*sqrt)==sum;

    }
    static boolean isCub(int sum){
        int cb = (int)Math.cbrt(sum);
        return (cb*cb*cb)==sum;

    }
    public static void main(String[] args) {
//        int[] num = {1,2,3,4,5}; // 3
//        int[] num = {1,1,1,1,2,2,3,4,8,8}; //2
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int r=0; r<t; r++) {
            int size = sc.nextInt();
            int[] num = new int[size];
            for (int i=0; i<size; i++){
                num[i]=sc.nextInt();
            }




            int len = num.length;
            int c1 = 0, c2 = 0;
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
//                prefectCheck((num[i]+num[j]));
                    int res = num[i] + num[j];
                    if (isCub(res)) {
                        c1++;
                    }
                    if (isSqrt(res)) {
                        c2++;
                    }
                }
            }
            int ans = c1 + c2;
            System.out.println(ans);
        }
    }
}

/*
2
5
1 2 3 4 5
3
10
1 1 1 1 2 2 3 4 8 8
14
 */

/*
Rsjiv •nd Nitish h:' fight becsuse Rsji'.' •.vss annoying Nitish with his question. R*jiv being genius in srr•ys Nitish •n •rray of r.ätur•l numbers A of length N with elements .42, Nitish has to find the smcunt of perfect psirs in the array.
A perfect pair is pair where (A, + is perfect square or perfect cube and i j-
Since Rajiv and Nitish are not tylking with Other Efter the fight you been given the qu•estion to and inturn "th Of them perfect pair again
NOTE A psir A) •nd A) sre yne not tc be counted Nice.
Input
The first line the input cont3ins the single integer denoting the number Of test The first line Of each test contains single integer N_ second line conäins N sp=e-separated integers AZ .
For each test print a single line containing a single integer denoting the tots' nun-Eer cf perfect pairs.
CcnstraintE
10
Ssmple Input
Ssmple Output
For example
s s 24
1472 Y 4
Input
s 27
271
lee
34 s s
6 e me ret 4 2 2 S 1 69 1 S S 2 9 S 77 22 1 S 9 2 le Y s 71 Y 3 9 le 7 S le 2 S 2 961 S 1 le 4616 7 le S S 6 2 7
1 : S 2 142 S Y s 1 3 la 7 lee 3 le 2 le 9 le 2 S S a 2 S S 1 246 2 S 9 7
7 ze 2 €4 ae •e 2 le le ae 71 s 6 s sae s le s s s s 4
Result
Ills
1269
1176
1226
le 24' 6 Y le le le 7 7 S le S S 4 6 le le 6 Y 4 le 2 2 S 1 Y 84 s 7 S S 84 S •e 2 7 le •e s g ze S
ses ss 10 s 2 s s s 10 10 2 le 2 s 6 A lea 2 sag 1 s 1 9 as
s 1 s 1 sss s le s ae •e
24 s
7 g A 6 g 76
le 1 6
9
73 a 6
1 la le le 462
8
6
s 41 E 2 •s
2 S 22
s 14
2 Y laa1477169agre
1 ! 374264 sss 4 s s 432
s 91 2 2 la
w s 16 6 s 4
s 91
2
s 41
 */
