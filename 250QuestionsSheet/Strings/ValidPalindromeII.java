class Solution {
    
    private static boolean  check(String s ) {
	    
		int i = 0;
		int j = s.length()-1;
		
		while(i < j) {
			
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		
		return true;
	}
    
    
    
    
    
    public boolean validPalindrome(String s) {
        
		
		int start = 0;
		int end = s.length()-1;
        
		while(start <= end) {
			
		    if(s.charAt(start) != s.charAt(end) ) {
		    	
		    	
		    	String s1 = s.substring(start , end);
		    	String s2 = s.substring(start+1 , end+1);
		    	
		    	return check(s1) || check(s2);
		    
		          
		    }
		    
		    start++;
	    	end--;
			
		}
		
		
		return true;
		
    }
}
