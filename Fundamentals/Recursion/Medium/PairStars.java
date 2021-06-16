	public static String addStars(String s) {
		String output;
        if(s.length() <= 1){
            return s;
        }
        
        String ans = addStars(s.substring(1));
        
        if(s.charAt(0) == ans.charAt(0)){
            output = s.charAt(0) + "*" + ans;
        }else{
            output = s.charAt(0) + ans;
        }
        
        
        return output;

	}
