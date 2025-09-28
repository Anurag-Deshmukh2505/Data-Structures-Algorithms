package Array;

/**
 * This class provides methods to search for a target value in a rotated sorted array.
 */
public class SearchRotatedArray {

    /**
     * Searches for a target value in a rotated sorted array using modified binary search.
     *
     * @param nums   the rotated sorted array
     * @param target the value to search for
     * @return the index of target if found, -1 otherwise
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // target not found
    }

    /**
     * Main method to test the search in rotated array.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Predefined rotated array
        SearchRotatedArray obj = new SearchRotatedArray();

        int[] targets = {0, 3, 6, 7, 8}; // Multiple test targets

        System.out.println("Rotated Array Search Results:");
        for (int target : targets) {
            int index = obj.search(nums, target);
            if (index != -1) {
                System.out.println("Target " + target + " found at index: " + index);
            } else {
                System.out.println("Target " + target + " not found in the array.");
            }
        }
    }
}
