//  Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.  




public static boolean checkNumber(int input[], int x, int index) {
		
        if(index == input.length) return false;
        
        
        boolean  smallAns = checkNumber(input , x , index+1);
      
        if(!(smallAns)){
             if(input[index] == x ){
          return true;          
        }else{
            return false;
        }
        }
        else{
            return true;
        }
      
      
	}
	
	public static boolean checkNumber(int input[], int x) {
		
        return checkNumber(input , x , 0);
        
        
	}

// can also do this

 public static boolean checkNumber(int input[], int x, int index) {
		
        if(index == input.length) return false;
        
        if(input[index] == x)
        {
            return true;
        }
        
        
        boolean  smallAns = checkNumber(input , x , index+1);
      
        if(!(smallAns)){
            return false;
        }else{
            return true;
        }
      
      
	}
	
	public static boolean checkNumber(int input[], int x) {
		
        return checkNumber(input , x , 0);
        
        
	}
