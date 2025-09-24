package Array;

import java.util.Arrays;

/**
 * This class provides a method to return an array such that each element
 * at index i is the product of all elements of the input array except nums[i].
 * <p>
 * The solution achieves O(n) time complexity without using division.
 */
public class ProductExceptSelf {

    /**
     * Returns an array where each element is the product of all other elements
     * in the input array except itself.
     *
     * @param nums the input array of integers
     * @return an array of products except self
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Build prefix product array
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Multiply with suffix products on the fly
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }

    /**
     * Main method to test the productExceptSelf method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ProductExceptSelf p = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};

        int[] res = p.productExceptSelf(nums);
        System.out.println("Product except self: " + Arrays.toString(res));
    }
}
