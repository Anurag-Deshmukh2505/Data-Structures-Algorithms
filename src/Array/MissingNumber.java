package Array;

/**
 * This class provides methods to find the missing number in an array containing
 * distinct numbers from 0 to n.
 */
public class MissingNumber {

    /**
     * Finds the missing number using the sum formula.
     * <p>
     * Note: This method can cause integer overflow for large arrays.
     *
     * @param nums the array containing n distinct numbers from 0 to n
     * @return the missing number
     */
    public int missingNumberSum(int[] nums) {
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return actualSum - arraySum;
    }

    /**
     * Finds the missing number using XOR operation.
     * This method avoids integer overflow and works efficiently for large arrays.
     *
     * @param nums the array containing n distinct numbers from 0 to n
     * @return the missing number
     */
    public int missingNumberXOR(int[] nums) {
        int n = nums.length;
        int xor = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // XOR with all elements in the array
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    /**
     * Main method to test missing number methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Missing number (sum method): " + missingNumber.missingNumberSum(nums));
        System.out.println("Missing number (XOR method): " + missingNumber.missingNumberXOR(nums));
    }
}
