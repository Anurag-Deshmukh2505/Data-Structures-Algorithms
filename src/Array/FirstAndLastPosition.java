package Array;

/**
 * This class provides a method to find the starting and ending positions
 * of a given target value in a sorted integer array using binary search.
 */
public class FirstAndLastPosition {

    /**
     * Searches for the leftmost (first) index of the target in the array.
     *
     * @param nums   sorted array of integers
     * @param target the value to search
     * @return the leftmost index or -1 if not found
     */
    private int searchLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                right = mid - 1; // Move left to find earlier occurrence
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

    /**
     * Searches for the rightmost (last) index of the target in the array.
     *
     * @param nums   sorted array of integers
     * @param target the value to search
     * @return the rightmost index or -1 if not found
     */
    private int searchRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                left = mid + 1; // Move right to find later occurrence
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

    /**
     * Returns the first and last index of a target value in the array.
     *
     * @param nums   sorted array of integers
     * @param target the value to search
     * @return an array of two integers {firstIndex, lastIndex}
     */
    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchLeft(nums, target), searchRight(nums, target)};
    }

    /**
     * Main method to test the searchRange functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        FirstAndLastPosition solution = new FirstAndLastPosition();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);

        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
    }
}
