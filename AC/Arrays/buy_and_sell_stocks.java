package AC.Arrays;

public class buy_and_sell_stocks {
    public static int buyandsellstocks(int [] prices){
        int buyingPrice = prices[0];
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyingPrice<prices[i]){ // profit
                int profit = prices[i] - buyingPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));
    }
}
