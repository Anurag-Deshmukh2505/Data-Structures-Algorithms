package Array;

/**
 * This class provides a method to check whether a given string
 * is a valid palindrome, considering only alphanumeric characters
 * and ignoring cases.
 */
public class ValidPalindrome {

    /**
     * Checks if the given string is a valid palindrome.
     *
     * @param s the input string
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    /**
     * Main method to test the isPalindrome functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        String input = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(input);

        System.out.println("Is palindrome? " + result);
    }
}
