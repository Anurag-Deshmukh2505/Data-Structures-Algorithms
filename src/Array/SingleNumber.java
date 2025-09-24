package Array;

/**
 * This class provides a method to find the single number in an array
 * where every element appears twice except for one.
 * <p>
 * The method uses XOR to achieve O(n) time complexity and O(1) space.
 */
public class SingleNumber {

    /**
     * Finds the element that appears only once in the array.
     *
     * @param nums an integer array where every element appears twice except one
     * @return the single element that appears only once
     */
    public int singleNumber(int[] nums) {
        int xorr = 0;
        for (int num : nums) {
            xorr ^= num;
        }
        return xorr;
    }

    /**
     * Main method to test the singleNumber method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        int[] nums = {4, 1, 2, 2, 1};

        System.out.println("Single number: " + obj.singleNumber(nums));
    }
}
