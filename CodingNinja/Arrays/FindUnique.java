  public static void sortZeroesAndOne(int[] arr) {
     
    int num = 0;
        for(int i =0;i<arr.length;i++){
            
            if(arr[i] == 0){
                
                
                int temp = arr[num];
                arr[num] = arr[i];
                arr[i] = temp;
                num++;
            }
            
            
        }
        
    }
