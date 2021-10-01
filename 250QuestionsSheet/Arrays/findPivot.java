class Solution {
    public int pivotIndex(int[] nums) {
        // find the left sum and right sum
            int [] arr = new int[nums.length];
            int prev = 0;
            for(int i =nums.length-1;i>=0;i--){
                    
                 arr[i] = nums[i] + prev;
                    prev = arr[i];
                    
            }
            prev = 0;
            for(int i=0;i<nums.length;i++){
               
                    nums[i] = nums[i] + prev;
                    prev = nums[i];
                    
            }
            
            
            for(int i =0;i<nums.length;i++){
                    if(nums[i] == arr[i]){
                            return i;
                    }
            }
            
            return -1;
    }
}


class Solution {
    public int pivotIndex(int[] nums) {
       int sum = 0;
            for(int num : nums){
                    sum += num;
            }
            
        int lSum = 0;
        int rightSum = sum;
            
            for(int i =0;i<nums.length;i++){
                 
                    rightSum = rightSum - nums[i];
                    
                    if(rightSum == lSum){
                            return i ;
                    }
                    
                    lSum = lSum + nums[i];
            }
            
            
            return -1;
            
    }
}
