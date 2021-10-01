// time complexity is o(n) and space is o(1)

class Solution {
    public int removeDuplicates(int[] nums) {
             if(nums.length == 0) return 0;
            int k = 1;
            int index = 1;
            int prev = nums[0];
            for(int i =1;i<nums.length;i++){
                  
                    if(nums[i] != prev){
                      
                            prev = nums[i];
                            nums[index] = nums[i];
                            index++;
                            k++;
                            
                            
                    }
            }
            
            return k;
    }
}
