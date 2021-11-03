class Solution {
    public int[] productExceptSelf(int[] nums) {
        
       int[] ans = new int[nums.length];
        
           // suffix
        int rightP = 1;
        for(int i =nums.length-1;i>=0;i--){
            
            int temp = nums[i];
            ans[i] = rightP;
            rightP = rightP * temp;
        }
        
        // prefix 
        int leftP = 1;
        for(int i =0;i<nums.length;i++){
            
            int temp = nums[i];
            nums[i] = leftP;
            leftP = leftP * temp;
            
        }
        
        
     
        
        // cobining them both
        int i = 0;
        while( i < nums.length){
            
            ans[i] = ans[i] * nums[i];
            i++;
        }
        
        return ans;
    }
}
