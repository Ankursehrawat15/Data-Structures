public static int sum(int input[] , int index) {
            
            if(index == input.length) return 0;
            
            int smallAns = sum(input , index+1);
            
            return input[index] + smallAns;
		
       
	}
    
public static int sum(int input[]) {
		
        return sum(input  , 0);
       
	}
