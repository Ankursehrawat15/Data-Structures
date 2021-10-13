
// time complexity is O(N) and Space complexity is O(1)
class Solution {
    public int maxProfit(int[] prices) {
       int totalProfit = 0;
		int maxProfit = 0;
		int buy = prices[0];
		int prev = prices[0];
		for(int i =1;i<prices.length;i++) {
			
			if(prices[i] < prev) {
				buy = prices[i];
				totalProfit += maxProfit;
				maxProfit = 0;
			}else {
			   
				int profit = prices[i] - buy;
				if(profit > maxProfit) {
					maxProfit = profit;
				}
				
			}
			
			 prev = prices[i];
			
			}
		
		if(maxProfit != 0) {
			totalProfit += maxProfit;
		}
		
		return totalProfit;
			
		}
    }
