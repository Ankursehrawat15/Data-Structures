// time complexity O(N)
class Solution {
 
    public boolean hasPathSum(TreeNode root, int targetSum) {
           if(root == null) return false;
        
        if(root.left == null && root.right == null && root.val == targetSum){
            return true;
        }
        
       boolean leftSide = hasPathSum(root.left , targetSum - root.val);
       boolean rightSide = hasPathSum(root.right , targetSum - root.val);
        
        return leftSide || rightSide;
      
    }
}
