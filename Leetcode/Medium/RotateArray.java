// Time complexity is O(N) as well as space Complexity
class Solution {
    public void rotate(int[] nums, int k) {
             int n = nums.length;
        int [] ans = new int[n];
           
            int i = 0;
            while(i < n ){
                    
            ans[(i+k)%n] = nums[i];
                    
              i++;      
          }
              int index = 0;
           for(int num : ans){
                   nums[index++] = num;
           }
            
            
    }
}
