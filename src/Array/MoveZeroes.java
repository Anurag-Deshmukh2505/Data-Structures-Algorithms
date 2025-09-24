package Array;

/**
 * This class provides a method to move all zeroes in an array to the end
 * while maintaining the relative order of non-zero elements.
 */
public class MoveZeroes {

    /**
     * Moves all zeros in the given array to the end in-place.
     * Uses a two-pointer approach for optimal O(n) time complexity.
     *
     * @param nums the integer array to reorder
     */
    public void moveZeroes(int[] nums) {
        int j = 0; // pointer for next non-zero element position

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // Fill remaining positions with zeros
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }

    /**
     * Main method to test the moveZeroes method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes.moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
