package CollegeTest.S4_Level1.Heard;
import java.util.*;
public class AreaOfHeights_Histogram {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = "[2,1,5,6,2,3]";
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "");
        String[] parts = input.split(",");
        int[] heights = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            heights[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println("Output: " + largestRectangleArea(heights));
    }
}
