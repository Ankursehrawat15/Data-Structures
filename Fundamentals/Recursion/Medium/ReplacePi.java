public static String replace(String input){
          String output;
        if(input.length() <= 1){
            return input;
        }
        
      
        
        String ans = replace(input.substring(1));
        
        if(input.charAt(0) == 'p' && ans.charAt(0) == 'i'){
            output = "3.14" + ans.substring(1);
        }else{
            output = input.charAt(0)+ans;
        }
        
        return output;
       

	}
