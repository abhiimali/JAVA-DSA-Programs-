class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int min_price=Integer.MAX_VALUE;
      //  int temp=0 ;
        //int loc ;
        for(int i =0; i < prices.length ; i++ )
        {
           
            min_price=Math.min(prices[i],min_price);
            profit=Math.max(profit,prices[i]-min_price);

            
        }
        return profit ;
    }
}