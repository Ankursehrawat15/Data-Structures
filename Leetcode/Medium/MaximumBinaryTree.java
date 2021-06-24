class Solution {
    
    public int max(int [] nums , int start , int end){
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i=start; i <= end ;i++){
            if(nums[i] > max){ 
                max = nums[i];
                maxIndex = i;
                // nums[i] = -1;
            }
        }
        return maxIndex;
    }
    
    public TreeNode build(int[] nums , int start , int end){
       
        if(start > end){
            return null;
        }
        
        int maxIndex = max(nums , start , end);
       
        
        TreeNode root = new TreeNode(nums[maxIndex]);
        
        root.left = build(nums , start , maxIndex-1);
        
        root.right = build(nums , maxIndex+1, end);
            
            
            return root;
    }
    
    
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    
        return build(nums,0,nums.length-1);
    }
}
