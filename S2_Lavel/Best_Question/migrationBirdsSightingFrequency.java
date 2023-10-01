package CollegeTest.S2_Lavel.Best_Question;

import java.util.HashMap;
import java.util.Scanner;

public class migrationBirdsSightingFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len]; //arr == sightings

        for(int i=0; i<len; i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int birdType : arr){
            map.put(birdType,map.getOrDefault(birdType,0)+1);
        }
        int mostCommonBird = -1;
        int maxFreq = 0;

        for(var key : map.entrySet()){
            int birdType = key.getKey();
            int birdFreq = key.getValue();

            if(birdFreq>maxFreq || (birdFreq == maxFreq && birdType < mostCommonBird)){
                mostCommonBird = birdType;
                maxFreq = birdFreq;
            }
        }
        System.out.println(mostCommonBird);
    }
}
