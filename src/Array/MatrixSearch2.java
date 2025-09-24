package Array;

/**
 * This class provides a method to search for a target value in a 2D matrix.
 * The matrix is assumed to have the following properties:
 *  - Integers in each row are sorted from left to right.
 *  - Integers in each column are sorted from top to bottom.
 */
public class MatrixSearch2 {

    /**
     * Searches for a target value in a 2D matrix using the staircase search approach.
     *
     * @param matrix the 2D integer matrix
     * @param target the value to search for
     * @return true if the target exists in the matrix, false otherwise
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = cols - 1;

        while (col >= 0 && row < rows) {
            int num = matrix[row][col];
            if (num == target) {
                return true;
            } else if (num > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    /**
     * Main method to test the matrix search method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        MatrixSearch2 search = new MatrixSearch2();

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 18;
        System.out.println("Target " + target + " found: " + search.searchMatrix(matrix, target));
    }
}
