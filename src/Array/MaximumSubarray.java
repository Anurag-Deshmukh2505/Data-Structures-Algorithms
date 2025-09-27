package Array;

/**
 * This class provides a method to find the maximum subarray sum
 * using Kadane's Algorithm.
 *
 * The algorithm runs in O(n) time and works by tracking the current
 * running sum and updating the maximum sum whenever a larger value is found.
 */
public class MaximumSubarray {

    /**
     * Returns the largest sum of a contiguous subarray within the given array.
     *
     * @param nums an integer array (must contain at least one element)
     * @return the maximum subarray sum
     */
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    /**
     * Main method to demonstrate the maxSubArray functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        MaximumSubarray solver = new MaximumSubarray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solver.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
