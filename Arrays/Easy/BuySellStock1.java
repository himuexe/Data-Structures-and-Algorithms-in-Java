public class BuySellStock1 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], profit = 0;
        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else if (price - minPrice > profit)
                profit = price - minPrice;
        }
        return profit;
    }
}