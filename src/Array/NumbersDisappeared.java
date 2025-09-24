package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to find all numbers that are missing
 * from an array containing integers from 1 to n.
 * <p>
 * The approach marks elements as negative to track presence in-place,
 * achieving O(n) time complexity and O(1) extra space (ignoring result list).
 */
public class NumbersDisappeared {

    /**
     * Finds all numbers between 1 and n that do not appear in the array.
     *
     * @param nums the input array containing integers from 1 to n
     * @return a list of missing numbers
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Mark elements present by making corresponding indices negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }

        // Numbers corresponding to positive values are missing
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    /**
     * Main method to test the findDisappearedNumbers method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        NumbersDisappeared obj = new NumbersDisappeared();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = obj.findDisappearedNumbers(nums);
        System.out.println("Missing numbers: " + result);
    }
}
