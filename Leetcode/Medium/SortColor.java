// Time complexity is O(2N)
public void sortColors(int[] a) {
            int count0 = 0 , count1 = 0 , count2 = 0;
        
        for(int num : a){
            if(num == 0){
                count0++;
            }else if(num == 1){
                count1++;
            }else{
                count2++;
            }
        }
        
        for(int i =0;i<a.length;i++){
            
            if(count0  > 0){
                a[i] = 0;
                count0--;
            }else if(count1 > 0){
                a[i] = 1;
                count1--;
            }else if( count2 > 0){
                a[i] = 2;
                count2--;
            }
            
        }
  
  // one pass solution
   public void sortColors(int[] a) {
         
           int low = 0 , high = a.length-1 , mid = 0;
            
        while(mid <= high){
                
                if(a[mid] == 0){
                     
                         int temp = a[mid];
                        a[mid] = a[low];
                        a[low] = temp;
                        low++;
                        mid++;
                        
                        
                }else if(a[mid] == 2){
                    
                        int temp = a[mid];
                        a[mid] = a[high];
                        a[high] = temp;
                        high--;
                        
                }else{
                        mid++; 
                
                }
              
        }    
           
        
    }
        
