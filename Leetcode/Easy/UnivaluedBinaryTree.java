// O(N)
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        
        if(root == null) return true;
        
      if(root.left != null && root.val != root.left.val){
          return false;
      }
      
      if(root.right != null && root.val != root.right.val){
          return false;
      }
        
        boolean leftAns = isUnivalTree(root.left);
        if(leftAns != true){
            return false;
        }
        boolean rightAns = isUnivalTree(root.right);
        
        return rightAns;
        
    }
}
