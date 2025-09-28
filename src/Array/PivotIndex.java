package Array;

/**
 * This class provides a method to find the pivot index in an array.
 * The pivot index is where the sum of the elements to the left
 * is equal to the sum of the elements to the right.
 */
public class PivotIndex {

    /**
     * Finds and returns the pivot index of the given array.
     *
     * @param nums array of integers
     * @return pivot index, or -1 if no such index exists
     */
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (totalSum - nums[i] - leftSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    /**
     * Main method to test the pivotIndex functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        PivotIndex solution = new PivotIndex();

        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = solution.pivotIndex(nums);

        System.out.println("Pivot Index: " + result);
    }
}
