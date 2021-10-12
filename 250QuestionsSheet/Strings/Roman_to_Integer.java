// time complexity is O(N) and space is O(1)
class Solution {
    public int romanToInt(String s) {
      int ans = 0;
		int i = 0;
		  int num2 = 0;
		  int num1 = 0;
		while(i < s.length()) {
			
		     num1 = check(s.charAt(i));
		    if(i+1 < s.length()) {
		     num2 = check(s.charAt(i+1));
		    }else {
		    	num2 = 0;
		    }
		    if(num2 != 0 && num1 < num2) {
		    	ans += num2 - num1;
		    	i = i+2;
		    }else {
		    	ans += num1;
		    	
		    	i++;
		    	
		    }
			
		}
		
		
		return ans;
	
    }
    
    private static int check( char c ) {
		
		if(c == 'I') {
			return 1;
		}else if(c == 'V') {
			return 5;
		}else if(c == 'X') {
			return 10;
		}else if(c == 'L') {
			return 50;
		}else if(c == 'C') {
			return 100;
		}else if(c == 'D') {
			return 500;
		}else if(c == 'M') {
			return 1000;
		}else {
			return -1;
		}
		
		
		
	}
}
