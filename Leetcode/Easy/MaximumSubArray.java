// Time complexity is O(N) and Space complexity is O(1)
class Solution {
    public int maxSubArray(int[] nums) {
            int ans = Integer.MIN_VALUE;
            int sum = 0;
         for(int i =0;i<nums.length;i++){
                 
                 sum += nums[i];
                 if(sum <= 0){
                      if(sum > ans){
                           ans = sum;
                      }   
                         sum = 0;
                         continue;
                 }
                 else if(sum > ans){
                     ans =sum;
                 }
         }
             
            return ans;
            
    }
}
