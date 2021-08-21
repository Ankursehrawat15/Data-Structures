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
// Time complexity is O(N) and space complexity is O(1)
class Solution {
        
        private void reverse(int [] nums , int s , int e){
                
                while(s < e){
                        
                        int temp = nums[e];
                        nums[e] = nums[s];
                        nums[s] = temp;
                        
                        s++;
                        e--;
                }
        }
        
        
        
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
          
            reverse(nums , 0 , nums.length-1);
            reverse(nums , 0 , k-1);
            reverse(nums , k , nums.length-1);
          
    }
}
