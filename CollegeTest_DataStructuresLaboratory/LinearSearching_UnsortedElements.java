package CollegeTest_DataStructuresLaboratory;

import java.util.Scanner;

public class LinearSearching_UnsortedElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        boolean isFound = true;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == t){
                System.out.println("Element "+t+" is present at location "+i);
                if(i==0){
                    System.out.println("Best Case");
                } else if (i == len - 1) {
                    System.out.println("Worst Case");
                }
                isFound = false;
            }
        }
        if (isFound){
            System.out.println("Element not found");
        }

    }
}

/*
Given an array of unsorted elements. find an element in array using linear searching.
First line of the input is no of elements present in an array. Second line of the input is the array
elements. Third line of the input is the element to be searched in array of given elements.
If the element is in the first index (index 0) display "Best Case"
If the element is in the last index (index n-1) display "Worst Case"
For example:
Input
7
1
5
15
7
le
3e
6
88
3
7
9
19
33
1
2
5
7
2
13
11
47
2e 5 3 7 1 le
Result
Element 1 is present at location 4
Element 7 is present at location 4
Worst Case
Element 30 is present at location e
Best Case
Element not found
98 34 12
 */