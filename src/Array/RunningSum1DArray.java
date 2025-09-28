package Array;

/**
 * This class provides a method to calculate the running sum of a 1D array.
 *
 * Example:
 * Input: [1, 2, 3, 4]
 * Output: [1, 3, 6, 10]
 */
public class RunningSum1DArray {

    /**
     * Computes the running sum of the given array.
     *
     * @param nums input array of integers
     * @return the same array with updated running sums
     */
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    /**
     * Main method to test the runningSum functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        RunningSum1DArray solution = new RunningSum1DArray();

        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);

        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
