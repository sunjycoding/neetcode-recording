package module02_two_pointers;

/**
 * Container With Most Water
 *
 * @author created by sunjy on 1/9/25
 */
public class ContainerWithMostWater {

    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxArea = 0;

        while (i < j) {
            int width = j - i;
            int height = Math.min(heights[i], heights[j]);
            int area = width * height;
            maxArea = Math.max(maxArea, area);

            if (heights[i] < heights[j]) {
                int currentHeight = heights[i];
                while (i < j && heights[i] <= currentHeight) {
                    i++;
                }
            } else {
                int currentHeight = heights[j];
                while (i < j && heights[j] <= currentHeight) {
                    j--;
                }
            }
        }

        return maxArea;
    }

}
