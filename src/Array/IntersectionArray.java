package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * This class provides methods to find the intersection of two integer arrays.
 */
public class IntersectionArray {

    /**
     * Returns the intersection of two arrays as an int array using two HashSets.
     *
     * @param nums1 the first integer array
     * @param nums2 the second integer array
     * @return an array containing the unique common elements of nums1 and nums2
     */
    public int[] intersectionArrays(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }

        return result;
    }

    /**
     * Returns the intersection of two arrays as an int array using one HashSet and an ArrayList.
     * This method removes elements from the set after adding them to avoid duplicates.
     *
     * @param nums1 the first integer array
     * @param nums2 the second integer array
     * @return an array containing the unique common elements of nums1 and nums2
     */
    public int[] intersectionUsingList(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num); // ensures uniqueness
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Main method to test intersection methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        IntersectionArray intersectionArray = new IntersectionArray();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2};

        System.out.println("Intersection (method 1): " +
                Arrays.toString(intersectionArray.intersectionArrays(nums1, nums2)));
        System.out.println("Intersection (method 2): " +
                Arrays.toString(intersectionArray.intersectionUsingList(nums1, nums2)));
    }
}
