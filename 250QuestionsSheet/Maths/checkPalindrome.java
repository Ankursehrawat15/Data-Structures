class Solution {
    
    private int reverse(int x) {
		
		int digit = 0;
		while(x != 0) {
		   int num = x % 10;
		   digit = digit * 10 + num;
		   
		   x = x / 10;
		}
		
		return digit;
	}
	
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;
		int reversed_num = reverse(x);
		
		if(x == reversed_num) {
			return true;
		}else {
			return false;
		}
    }
}
