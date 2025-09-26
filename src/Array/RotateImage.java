package Array;

/**
 * This class provides a method to rotate an n x n matrix
 * by 90 degrees clockwise in place.
 * <p>
 * The algorithm first transposes the matrix, then reverses each row.
 * This achieves the rotation with O(n^2) time and O(1) extra space.
 */
public class RotateImage {

    /**
     * Rotates the given n x n matrix by 90 degrees clockwise in place.
     *
     * @param matrix the square matrix to rotate
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix in place
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // only traverse upper triangle
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) { // only half of each row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    /**
     * Example usage to test the rotate function.
     */
    public static void main(String[] args) {
        RotateImage sol = new RotateImage();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        sol.rotate(matrix);

        System.out.println("Rotated matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        // Output:
        // 7 4 1
        // 8 5 2
        // 9 6 3
    }
}
