// Time complexity is O(N) and space complexity is O(1)  
public int[] sortArrayByParity(int[] nums) {
        
            
        int str = 0;
            int end = nums.length-1;
            
            while(str < end){
                    
                   if(nums[str] % 2 == 0){
                           while(str < nums.length){
                                   
                                   if(nums[str] % 2 != 0){
                                           break;
                                   }
                                   
                                   str++;
                           }
                   } 
                    
                    if(nums[end] % 2 != 0){
                            while(end >= 0){
                                    
                                    if(nums[end] % 2 == 0){
                                            break;
                                    }
                                    
                                    end--;
                            }
                    }
                    
                    
                    if(str < end){
                            
                            int temp = nums[str];
                            nums[str] = nums[end];
                            nums[end] = temp;
                            
                            str++;
                            end--;
                    }
                    
            }
            
            return nums;
            
    }
