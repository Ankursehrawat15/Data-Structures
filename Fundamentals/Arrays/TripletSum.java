  public static int findTriplet(int[] arr, int x) {
    	
        int count = 0;
        for(int i=0;i<arr.length-2;i++){
            
            for(int j=i+1;j<arr.length-1;j++){
                
                for(int z = j+1; z<arr.length;z++){
                    
                    if(arr[i] + arr[j] + arr[z] == x){
                        count++;
                    }
                    
                }
            }
        }
        
        return count;
        
    }
