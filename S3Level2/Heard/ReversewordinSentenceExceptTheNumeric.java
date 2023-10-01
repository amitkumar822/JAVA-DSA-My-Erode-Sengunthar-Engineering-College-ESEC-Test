package CollegeTest.S3Level2.Heard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReversewordinSentenceExceptTheNumeric {
    public static void solution(String str) {
        Scanner sobj = new Scanner(str);
        String s;

        List<Character> v;
        while(sobj.hasNext()){
            v = new ArrayList<>();
            s = sobj.next();
            for(int i=0; i<s.length(); i++){
                v.add(s.charAt(i));
            }

            int l=0, r=v.size()-1;
            while(l<r){
                if(v.get(l)>=48 && v.get(l)<=57){ l++; continue;}
                if(v.get(r)>=48 && v.get(r)<=57){ r--; continue;}
                if(v.get(l)<=90 && v.get(l)>=65) v.set(l, (char)(v.get(l)+32));
                if(v.get(r)<=90 && v.get(r)>=65) v.set(r, (char)(v.get(r)+32));
                Collections.swap(v, l++, r--);
            }
            if(v.get(0)>=97 && v.get(0)<=122) v.set(0, (char)(v.get(0)-32));
            for(int i=0; i<v.size(); i++){
                s = s.substring(0, i) + v.get(i) + s.substring(i+1);
            }
            System.out.print(s + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int t = sc.nextInt();
        sc.nextLine();
        while(t !=0){
            str = sc.nextLine();
            solution(str);
            System.out.println();
        }
    }
}
/*
size : 2
input : there are 26 alphabets in english
output: Ereht Era 26 Stebahpla Ni Hsilgne
input : I26t is not a digit 1234
output : T26i Si Ton A Tigid 1234
 */