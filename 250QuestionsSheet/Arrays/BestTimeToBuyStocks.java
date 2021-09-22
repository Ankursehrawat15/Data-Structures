// Time complexity is O(N) and Space Complexity is O(1)
class Solution {
    public int maxProfit(int[] prices) {
        
            int buyCost = prices[0];
            int sellCost = 0;
            int maxProfit = 0;
            for(int i =1;i<prices.length;i++){
                 
                 if(prices[i] < buyCost){
                         buyCost = prices[i];
                 }else{
                         
                         sellCost = prices[i];
                         int profit = sellCost - buyCost;
                         if(profit > maxProfit){
                                 maxProfit = profit;
                         }
                         
                         
                         
                         
                 } 
                    
                    
            }
            
            return maxProfit;
    }
}
