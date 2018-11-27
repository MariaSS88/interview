public class MaxProfit {
    public int maxProfitOfStockPrices(int[] prices){
        if(prices.length < 2) return 0;
        int minElement = prices[0];
        int curProfit = 0;
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            minElement = Math.min(minElement, prices[i]);
            curProfit = prices[i] - minElement;
            maxProfit = Math.max(maxProfit,curProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] prices = {9,4,7,5,13,8,3,10,15,19};
        MaxProfit test = new MaxProfit();
        System.out.println(test.maxProfitOfStockPrices(prices));
    }
}
