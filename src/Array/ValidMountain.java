package Array;

/**
 * This class provides a method to check whether an array forms a valid mountain array.
 * <p>
 * A valid mountain array has at least 3 elements, strictly increasing to a peak,
 * then strictly decreasing after the peak.
 */
public class ValidMountain {

    /**
     * Checks if the given array is a valid mountain array.
     *
     * @param arr the input array of integers
     * @return true if the array is a valid mountain, false otherwise
     */
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // Walk up: strictly increasing
        while (i < n - 1 && arr[i] < arr[i + 1]) i++;

        // Peak can't be first or last element
        if (i == 0 || i == n - 1) return false;

        // Walk down: strictly decreasing
        while (i < n - 1 && arr[i] > arr[i + 1]) i++;

        return i == n - 1;
    }

    /**
     * Main method to test the validMountainArray function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ValidMountain vm = new ValidMountain();
        int[] arr = {3, 2, 1, 5, 6};

        System.out.println("Is valid mountain array: " + vm.validMountainArray(arr));
    }
}
