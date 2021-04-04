// not good approach
public static char highestOccuringChar(String str) {
		
        
       // aaabbbbbbccdd => b 
       int maxCount = Integer.MIN_VALUE;
        char c = 0;
        
        for(int i=0;i<str.length();i++){
            
            int count  =0 ;
            for(int j=0;j<str.length();j++ ){
                
                if(str.charAt(j) == str.charAt(i)) count++;
                
            }
            
            if(count > maxCount){
                c = str.charAt(i);
                maxCount = count;
            }
            
            
        }
        
        return c;
        
        
	}


// better approach
	public static char highestOccuringChar(String str) {
		
    int [] frequency = new int [256];
        int maxFrequency = 0;
        
        for(int i =0 ;i<str.length();i++){
            
            frequency[str.charAt(i)]++;
            
            maxFrequency = Math.max(maxFrequency , frequency[str.charAt(i)]);
        }
        
        char ans = '0';
        for(int i =0;i<frequency.length;i++){
            
            if(frequency[str.charAt(i)] == maxFrequency){
                ans = str.charAt(i);
                break;
            }
            
        }
            
        return ans;
        
	}
