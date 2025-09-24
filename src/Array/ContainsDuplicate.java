package Array;

import java.util.HashSet;

/**
 * This class provides a method to check if an integer array contains any duplicates.
 */
public class ContainsDuplicate {

    /**
     * Checks whether the given array contains any duplicate elements.
     *
     * @param nums the array of integers to check
     * @return true if any value appears at least twice in the array, false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    /**
     * Main method to test the containsDuplicate function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println("Contains duplicates: " + c.containsDuplicate(nums));
    }
}
