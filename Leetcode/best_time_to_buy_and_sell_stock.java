package Leetcode;

public class best_time_to_buy_and_sell_stock {
    public static int maxProfit(int[] prices) {
        int track_profit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(buyingPrice<prices[i]){
                int profit = prices[i] - buyingPrice;
                track_profit = Math.max(profit, track_profit);
            }else{
                buyingPrice = prices[i];
            }
        }
        return track_profit;
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
