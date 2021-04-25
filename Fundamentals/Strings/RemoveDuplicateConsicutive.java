
// For a given string(str), remove all the consecutive duplicate characters.


public static String removeConsecutiveDuplicates(String str) {
		
    
        
        String str2 = "";
        str2 = str2+str.charAt(0);
        
        int compare = 0;
        for(int i=1;i<str.length();i++){
            
            if(!(str.charAt(compare) == str.charAt(i))){
                
                str2 = str2 + str.charAt(i);
                compare  = i;
         }
     }
        
        return str2;
        
        
        
        
	}
