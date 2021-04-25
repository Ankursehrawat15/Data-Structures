 public static int duplicateNumber(int arr[]) {
    
        for(int i =0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                
                if(i == j ){
                    continue;
                }
                
                if(arr[i] == arr[j]){
                    
                    return arr[i];
                }
                
                
                
                
            }
            
        }
        
        return -1;
        
        
        
        
    }
