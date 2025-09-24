package Array;

import java.util.Arrays;

/**
 * This class provides a method to add one to a number represented
 * as an array of digits.
 */
public class PlusOne {

    /**
     * Adds one to the integer represented by the digits array.
     *
     * @param digits an array of digits representing a non-negative integer
     * @return a new array representing the integer after adding one
     */
    public int[] plusOne(int[] digits) {
        // Traverse from the last digit backwards
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, return result
            }
            digits[i] = 0; // Set current digit to 0 and continue carry
        }

        // If all digits were 9, create a new array with leading 1
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    /**
     * Main method to test the plusOne function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        PlusOne obj = new PlusOne();
        int[] digits = {1, 2, 3};

        int[] result = obj.plusOne(digits);
        System.out.println("After adding one: " + Arrays.toString(result));
    }
}
