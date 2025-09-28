package Array;

/**
 * This class provides a method to find two numbers in a sorted array
 * that add up to a given target using the two-pointer approach.
 */
public class TwoSumIISortedArray {

    /**
     * Finds two numbers in the sorted array that add up to the target.
     * Returns their 1-based indices.
     *
     * @param numbers sorted array of integers
     * @param target  target sum to be achieved
     * @return an array of two indices (1-based) or {-1, -1} if not found
     */
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1, -1};
    }

    /**
     * Main method to test the twoSum functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        TwoSumIISortedArray solution = new TwoSumIISortedArray();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
