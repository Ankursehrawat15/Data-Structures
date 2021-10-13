
// time complexity is O(2^N) ie exponential
class Solution {
    public int fib(int n) {
        
          if(n==1 || n==0) {
	    	return n;
	    }
	    
	    return fib(n-1) + fib(n-2);
        
        
    }
}

// Using DP memorization
class Solution {
    public int fib(int n) {
        
      int [] dp = new int[n+1];
		Arrays.fill(dp, -1);
		return fib_dp(n , dp);
        
    }
    
    
    
    private static int fib_dp(int n , int [] dp) {
		
		if(n == 1 || n == 0) {
			return n;
		}
		
		int first_num;
		if(dp[n-1] == -1) {
			first_num = fib_dp(n-1 , dp);
			dp[n-1] = first_num;
		}else {
			first_num = dp[n-1];
		}
		
		int sec_num;
		if(dp[n-2] == -1) {
			sec_num = fib_dp(n-2 , dp);
			dp[n-2] = sec_num;
		}else {
			sec_num = dp[n-2];
		}
		
		return first_num + sec_num;
		
	}
}
