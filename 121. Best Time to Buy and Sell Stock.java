class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int local = 0, global = 0;
        for(int i = 1; i < prices.length; i++){
            local = Math.max(0, local - prices[i - 1] + prices[i]);
            global = Math.max(global, local);
        }
        return global;
    }
}