public static String removeConsecutiveDuplicates(String s) {
		
        if(s.length() <= 1){
            return s;
        }
        
        String ans = removeConsecutiveDuplicates(s.substring(1));
        
        if(s.charAt(0) != ans.charAt(0)){
              return s.charAt(0) + ans;
        }
        
        return ans;

	}
