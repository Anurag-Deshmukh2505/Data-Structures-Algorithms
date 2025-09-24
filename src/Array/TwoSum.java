package Array;

import java.util.HashMap;

/**
 * This class provides a method to find indices of the two numbers in an array
 * that add up to a specific target.
 * <p>
 * The method uses a HashMap for O(n) time complexity.
 */
public class TwoSum {

    /**
     * Finds indices of two numbers such that they add up to the target.
     *
     * @param nums   the input array of integers
     * @param target the target sum
     * @return an array containing the indices of the two numbers, or {-1, -1} if no solution exists
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // No solution found
    }

    /**
     * Main method to test the twoSum function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices of two sum: " + result[0] + ", " + result[1]);
    }
}
