public static int convertStringToInt(String input){
		
        if(input.length() <= 1) return Character.getNumericValue(input.charAt(0));
        
        int converted = convertStringToInt(input.substring(1));
          
        int num = Character.getNumericValue(input.charAt(0));
        
        converted = (int)( num * Math.pow(10 , input.length()-1)) + converted;
         
        return converted;
	}
