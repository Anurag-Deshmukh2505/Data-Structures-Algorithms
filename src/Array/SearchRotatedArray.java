package Array;

public class SearchRotatedArray {

    // Function to search target in rotated sorted array
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

    // Main method with predefined array
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 }; // Predefined rotated array
        int target = 0; // Target to search

        SearchRotatedArray sra = new SearchRotatedArray();
        int result = sra.search(nums, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
