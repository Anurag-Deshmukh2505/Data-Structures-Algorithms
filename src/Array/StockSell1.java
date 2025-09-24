package Array;

/**
 * This class provides a method to calculate the maximum profit
 * from buying and selling a stock once.
 * <p>
 * The method iterates through prices to find the minimum buying price
 * and maximum profit achievable.
 */
public class StockSell1 {

    /**
     * Calculates the maximum profit from a single buy and sell.
     *
     * @param prices an array where prices[i] is the price of a given stock on day i
     * @return the maximum profit achievable
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);           // Track minimum price so far
            maxProfit = Math.max(maxProfit, price - minPrice); // Update max profit
        }

        return maxProfit;
    }

    /**
     * Main method to test the maxProfit function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        StockSell1 stockSell1 = new StockSell1();
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum profit: " + stockSell1.maxProfit(prices));
    }
}
