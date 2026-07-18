class Solution {
    public int maxProfit(int[] prices) {
        int minP = prices[0];
        int res = 0;
        for(int i =1; i< prices.length; i++) {
            minP = Math.min(minP, prices[i]);
            res = Math.max(res, prices[i]-minP);
        }
        return res;
    }
}
