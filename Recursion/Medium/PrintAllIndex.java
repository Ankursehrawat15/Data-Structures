

// Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
// Do this recursively. Indexing in the array starts from 0.


public static int[] allIndexes(int input[], int x, int index ) {
        
         if(index == input.length){
            int arr1 [] = new int[0];
            return arr1;
            
        }
       
       int [] smallAns =  allIndexes(input , x, index+1);
	 
        if(input[index] == x ){
            
            int [] output = new int[smallAns.length+1];
            output[0] = index;
            
            
            for(int i=0;i<smallAns.length;i++){
                
                output[i+1] = smallAns[i];
                
                
            }
            
            return output;
        }
        else{
            return smallAns;
        }
        
        
		
	}

	public static int[] allIndexes(int input[], int x) {
        
        return allIndexes(input , x , 0 );
		
	}
	
