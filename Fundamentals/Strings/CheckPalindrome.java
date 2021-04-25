
    	public static boolean isPalindrome(String str , int start , int end) {
           
            
            while(start <= end){
                
                if(!(str.charAt(start) == str.charAt(end))){
                    
                    return false;
            }
                
                start++;
                end--;
                
            
            }
            
            return true;
	
    
        }
	public static boolean isPalindrome(String str) {
	
        return isPalindrome(str , 0 , str.length()-1);
        
	}
