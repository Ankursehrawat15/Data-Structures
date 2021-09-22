// o(N+M)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
         
            
            int [] ans = new int [nums1.length];
            
            int idx = 0;
          int num1_idx = 0;
          int num2_idx = 0;
         while(num1_idx < m && num2_idx < n){
                 
                 
                 if(nums1[num1_idx] < nums2[num2_idx]){
                         
                         ans[idx++] = nums1[num1_idx];
                         num1_idx++;
                         
                 }else{
                         
                         
                         ans[idx++] = nums2[num2_idx];
                         num2_idx++;
                         
                         
                 }
                 
         }
            
            
            if(num1_idx < m){
                    
                    while(num1_idx < m){
                            
                            ans[idx++] = nums1[num1_idx];
                            num1_idx++;
                    }
                    
            }
            
            
            if(num2_idx < n){
                    
                    while(num2_idx < n){
                            
                            ans[idx++] = nums2[num2_idx];
                            num2_idx++;
                    }
                    
            }        
                    
                    
           for(int i =0;i<ans.length;i++){
                   
                   nums1[i] = ans[i];
           }         
                    
                    
                    
           
            
            
            
            
            
            
    }
}
