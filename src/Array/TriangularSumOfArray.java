package Array;

/**
 * This class provides a method to compute the triangular sum of an array.
 *
 * The process repeatedly replaces the array with a new array where each element
 * is the sum of adjacent elements modulo 10, until only one element remains.
 */
public class TriangularSumOfArray {

    /**
     * Computes the triangular sum of the given array.
     *
     * @param nums an array of integers
     * @return the single remaining element after triangular reduction
     */
    public int triangularSum(int[] nums) {
        int n = nums.length;

        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            n--;
        }

        return nums[0];
    }

    /**
     * Main method to test the triangularSum functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        TriangularSumOfArray solution = new TriangularSumOfArray();

        int[] nums = {1, 2, 3, 4, 5};
        int result = solution.triangularSum(nums);

        System.out.println("Triangular Sum: " + result);
    }
}
