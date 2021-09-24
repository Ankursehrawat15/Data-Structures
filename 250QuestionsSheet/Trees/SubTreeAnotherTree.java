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
        
     private boolean preOrder(TreeNode root , TreeNode subRoot){
             if(root == null && subRoot == null) return true;
             if(root == null || subRoot == null) return false;
             
             if(root.val != subRoot.val){
                     return false;
             }
             
             boolean leftPart  = preOrder(root.left , subRoot.left);
             boolean rightPart = preOrder(root.right , subRoot.right);
             
             return rightPart && leftPart;
             
     }   
        
        
        
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
           if(root == null && subRoot == null) return true;
             if(root == null || subRoot == null) return false;
            
            if(root.val == subRoot.val){
                 boolean ans = preOrder(root , subRoot);
                    if(ans == true){
                         return true;
                    }
            }
            boolean left = isSubtree(root.left , subRoot);
            boolean right = isSubtree(root.right, subRoot);
           
            
          return left || right;
            
    }
}
