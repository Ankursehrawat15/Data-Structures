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
