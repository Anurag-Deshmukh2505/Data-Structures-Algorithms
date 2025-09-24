package Array;

/**
 * This class provides a method to remove duplicates from a sorted array in-place.
 * <p>
 * The method returns the new length of the array containing unique elements.
 */
public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted array in-place.
     *
     * @param nums a sorted integer array
     * @return the length of the array after removing duplicates
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; // pointer for placing unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1; // new length
    }

    /**
     * Main method to test the removeDuplicates method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        int newLength = removeDuplicates.removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + newLength);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
