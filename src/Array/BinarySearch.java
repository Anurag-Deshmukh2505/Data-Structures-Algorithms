package Array;

/**
 * Provides a method to perform binary search on a sorted integer array.
 */
public class BinarySearch {

    /**
     * Performs binary search to find the index of the target element.
     *
     * @param nums   sorted integer array
     * @param target value to search for
     * @return index of target if found, otherwise -1
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    /**
     * Main method to test the binary search functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] nums = {-10, -3, 0, 5, 9, 12, 18};
        int target = 9;
        int result = binarySearch.search(nums, target);

        System.out.println("Index of " + target + ": " + result);
    }
}
