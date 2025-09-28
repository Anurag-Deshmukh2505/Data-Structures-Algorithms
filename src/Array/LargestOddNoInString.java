package Array;

/**
 * This class provides a method to find the largest substring of digits
 * from the given numeric string that forms an odd number.
 */
public class LargestOddNoInString {

    /**
     * Returns the largest substring (from the start) that forms an odd number.
     *
     * @param num the numeric string to check
     * @return the largest odd-number substring, or an empty string if none exists
     */
    public String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    /**
     * Main method to test the largestOddNumber functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        LargestOddNoInString solution = new LargestOddNoInString();

        String num = "35420";
        String result = solution.largestOddNumber(num);

        System.out.println("Largest odd number substring: " + result);
    }
}
