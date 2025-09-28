package Array;

/**
 * This class provides a method to convert a positive column number
 * to its corresponding Excel-style column title.
 *
 * For example:
 * 1 -> A
 * 28 -> AB
 * 701 -> ZY
 */
public class ExcelSheetColNo {

    /**
     * Converts a given column number to its corresponding Excel column title.
     *
     * @param colNum a positive integer representing the column number
     * @return the corresponding Excel column title as a string
     */
    public String convertToTitle(int colNum) {
        StringBuilder sb = new StringBuilder();
        while (colNum > 0) {
            colNum--; // Adjust because Excel columns are 1-based
            char ch = (char) ('A' + (colNum % 26));
            sb.append(ch);
            colNum /= 26;
        }
        return sb.reverse().toString();
    }

    /**
     * Main method to test the convertToTitle functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ExcelSheetColNo solution = new ExcelSheetColNo();

        int colNum = 701;
        String result = solution.convertToTitle(colNum);

        System.out.println("Excel Column Title for " + colNum + ": " + result);
    }
}
