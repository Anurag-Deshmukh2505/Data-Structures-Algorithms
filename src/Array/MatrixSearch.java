package Array;

/**
 * This class provides methods to search for a target value in a 2D matrix.
 * The matrix is assumed to have the following properties:
 *  - Integers in each row are sorted from left to right.
 *  - The first integer of each row is greater than the last integer of the previous row.
 */
public class MatrixSearch {

    /**
     * Searches for a target value in a 2D matrix.
     * This method uses a staircase search (optimal for row and column sorted matrices).
     *
     * @param matrix the 2D integer matrix
     * @param target the value to search for
     * @return true if target exists in the matrix, false otherwise
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = cols - 1;

        while (col >= 0 && row < rows) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else row++;
        }

        return false;
    }

    /**
     * Alternative optimal solution using binary search.
     * Treats the 2D matrix as a flattened 1D array.
     *
     * @param matrix the 2D integer matrix
     * @param target the value to search for
     * @return true if target exists in the matrix, false otherwise
     */
    public boolean searchMatrixBinary(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = matrix[mid / cols][mid % cols];

            if (midVal == target) return true;
            else if (midVal < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }

    /**
     * Main method to test the matrix search methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        MatrixSearch obj = new MatrixSearch();

        System.out.println("Staircase search:");
        System.out.println("Target 3: " + obj.searchMatrix(matrix, 3));
        System.out.println("Target 13: " + obj.searchMatrix(matrix, 13));

        System.out.println("\nBinary search:");
        System.out.println("Target 3: " + obj.searchMatrixBinary(matrix, 3));
        System.out.println("Target 13: " + obj.searchMatrixBinary(matrix, 13));
    }
}
