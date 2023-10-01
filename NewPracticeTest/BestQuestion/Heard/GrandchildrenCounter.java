package CollegeTest.A_NewPracticeTest.BestQuestion.Heard;

import java.util.*;

public class GrandchildrenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Map<String, List<String>> familyTree = new HashMap<>();

        // Input the family relationships
        for (int i = 0; i < n; i++) {
            System.out.print("Enter child and father names separated by space: ");
            String[] input = scanner.nextLine().split(" ");
            String child = input[0].toLowerCase();
            String father = input[1].toLowerCase();

            familyTree.putIfAbsent(father, new ArrayList<>());
            familyTree.get(father).add(child);
        }

        System.out.print("Enter name of the one whose number of grandchildren is needed: ");
        String targetName = scanner.nextLine().toLowerCase();
        scanner.close();

        int grandchildrenCount = countGrandchildren(familyTree, targetName);
        System.out.println("Number of grandchildren for " + targetName + ": " + grandchildrenCount);
    }

    public static int countGrandchildren(Map<String, List<String>> familyTree, String targetName) {
        int grandchildrenCount = 0;

        if (familyTree.containsKey(targetName)) {
            for (String child : familyTree.get(targetName)) {
                if (familyTree.containsKey(child)) {
                    grandchildrenCount += familyTree.get(child).size();
                }
            }
        }

        return grandchildrenCount;
    }
}



/*
Given a two dimensional array of string like
"shaW'>
<"wayne",
"rooney">
Where the first string is "child", second string is "Father". And given "ronaldo" we have to find his no of grandchildren. Here "ronaldo" has 2
grandchildren. So our output should be 2.
Sample Input 1:
Enter the number of inputs:4
luke shaw
wayne rooney
rooney Ronaldo
shaw rooney
Enter name of the one whose number of grandchildren is needed:ronaldo
Sample Output 1:
2
 */
