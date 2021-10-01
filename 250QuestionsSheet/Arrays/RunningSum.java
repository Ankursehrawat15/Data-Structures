// time complexity is O(N) and space is O(1)
class Solution {
    public int[] runningSum(int[] nums) {
        
            int prev = 0;
            
            for(int i =0;i<nums.length;i++){
                    
                 nums[i] = prev + nums[i];
                    prev =  nums[i];
                    
                    
            }
            
            
            return nums;
    }
}
