/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        
        
        private TreeNode build(int[] nums , int st , int end){
                
                if(st > end){
                   return null;
                }
                
                
                TreeNode root = new TreeNode();
         
                    int mid = (st + end) / 2;
                    root.val = nums[mid];
                    
                    root.left = build(nums , st , mid-1);
                    root.right = build(nums , mid+1 , end);
                    
                    return root;
        }
        
        
    public TreeNode sortedArrayToBST(int[] nums) {
          TreeNode root = build(nums , 0 , nums.length-1);
            
            return root;
    }
}
