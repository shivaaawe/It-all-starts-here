package AC.Arrays.Practice_Questions;

public class buy_and_sell_stocks {
    public static int buyandsellstocks1(int [] prices){
        int track_profit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        for(int i=1; i<prices.length; i++){
            if(buyingPrice<prices[i]){
                int profit = prices[i] - buyingPrice;
                track_profit = Math.max(track_profit, profit);
            }
            else{
                buyingPrice = prices[i];
            }
        }
        return track_profit; 
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(buyandsellstocks1(prices));
    }
}
