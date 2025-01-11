package module03_sliding_window;

/**
 * Best Time to Buy and Sell Stock
 *
 * @author created by sunjy on 1/9/25
 */
public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

}
