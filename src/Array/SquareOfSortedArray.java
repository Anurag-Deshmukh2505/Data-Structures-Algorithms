package Array;

import java.util.Arrays;

/**
 * This class provides a method to return a new array containing the squares
 * of each number from a sorted array, also sorted in non-decreasing order.
 * <p>
 * The method uses a two-pointer approach to efficiently fill the result array.
 */
public class SquareOfSortedArray {

    /**
     * Returns an array of the squares of each element, sorted in non-decreasing order.
     *
     * @param nums a sorted integer array (can contain negative numbers)
     * @return a sorted array of squares of the input elements
     */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0, j = n - 1;
        int k = n - 1; // pointer for placing largest square

        while (i <= j) {
            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] * nums[j];

            if (leftSquare < rightSquare) {
                result[k--] = rightSquare;
                j--;
            } else {
                result[k--] = leftSquare;
                i++;
            }
        }

        return result;
    }

    /**
     * Main method to test the sortedSquares function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        SquareOfSortedArray sq = new SquareOfSortedArray();
        int[] nums = {-4, -3, 0, 1, 10};

        int[] res = sq.sortedSquares(nums);
        System.out.println("Sorted squares: " + Arrays.toString(res));
    }
}
