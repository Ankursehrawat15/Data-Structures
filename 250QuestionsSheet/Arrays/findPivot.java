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
