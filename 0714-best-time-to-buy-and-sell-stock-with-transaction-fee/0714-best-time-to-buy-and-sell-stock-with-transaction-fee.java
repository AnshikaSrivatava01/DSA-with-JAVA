class Solution {
    public int maxProfit(int[] prices, int fee) {
      if(prices == null || prices.length <= 1){
        return 0;
      }
      int profit = 0;
      int buy = -prices[0];
      for(int i = 1; i<prices.length; i++){
        int prevProfit = profit;
        profit = Math.max(profit, buy + prices[i] - fee);
        buy = Math.max(buy, prevProfit - prices[i]);
      }
      return profit; 
    }
}