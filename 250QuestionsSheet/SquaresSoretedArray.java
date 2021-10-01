class Solution {
    public int[] sortedSquares(int[] nums) {
        
      int [] ans = new int[nums.length];
        int st = 0;
        int end = nums.length-1;
        int index = nums.length-1;
            while(st <= end){
                 
                if(Math.abs(nums[st]) > Math.abs(nums[end]) ){
                        ans[index--] = (int)Math.pow(nums[st] , 2);
                        st++;
                }else{
                        
                        ans[index--] = (int)Math.pow(nums[end] , 2);
                        end--;
                }    
                    
                    
                    
            }
            
            return ans;
            
            
    }
}
