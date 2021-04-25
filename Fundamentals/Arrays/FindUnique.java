public static int findUnique(int[] arr){
		
        for(int i=0;i<arr.length;i++){
            
            int count = 0;
            for(int j =0;j<arr.length;j++){
                
                if(i == j){
                    continue;
                }
                
                
                if(arr[i] == arr[j]){
                    
                    count++;
                    break;
              }
                
                
            }
            
            if(count == 0){
                
                return arr[i];
            }
            
            
        }
        
        return -1;
        
    }
