package Maths;

/**
 * This class provides a method to determine which of two people
 * (represented by positions x and y) is closer to a third point z.
 */
public class ClosestPerson {

    /**
     * Determines which of the two positions x or y is closer to position z.
     *
     * @param x position of the first person
     * @param y position of the second person
     * @param z target position
     * @return 1 if x is closer, 2 if y is closer, or 0 if both are equidistant
     */
    public int findClosest(int x, int y, int z) {
        int diffX = Math.abs(z - x);
        int diffY = Math.abs(z - y);

        if (diffX < diffY) return 1;
        else if (diffX > diffY) return 2;
        return 0;
    }

    /**
     * Main method to test the findClosest functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ClosestPerson solution = new ClosestPerson();

        int x = 3, y = 10, z = 6;
        int result = solution.findClosest(x, y, z);

        System.out.println("Closest to " + z + ": " + result);
    }
}
