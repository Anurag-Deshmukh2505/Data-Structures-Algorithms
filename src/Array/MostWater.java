package Array;

/**
 * This class provides a method to find the maximum area of water that can be contained
 * between vertical lines represented by an array of heights.
 * <p>
 * The problem is commonly known as the "Container With Most Water" problem.
 */
public class MostWater {

    /**
     * Finds the maximum area of water that can be trapped between two lines.
     * <p>
     * Uses the two-pointer approach for optimal O(n) time complexity.
     *
     * @param height an array representing the height of vertical lines
     * @return the maximum water area
     */
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i = 0, j = height.length - 1;

        while (i < j) {
            int width = j - i;
            int minHeight = Math.min(height[i], height[j]);
            maxWater = Math.max(maxWater, minHeight * width);

            // Move the pointer with the smaller height
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxWater;
    }

    /**
     * Main method to test the maxArea function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        MostWater mostWater = new MostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Maximum water area: " + mostWater.maxArea(height));
    }
}
