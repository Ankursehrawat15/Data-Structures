class Solution {
    
    public TreeNode construct(int[] nums, int start , int end){
        
        if(start > end){
            return null;
        }
        
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = construct(nums,start,mid-1);
        root.right = construct(nums,mid+1,end);
        
        
        return root;
        
    }
    
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return construct(nums,0,nums.length-1);
        
    }
}
