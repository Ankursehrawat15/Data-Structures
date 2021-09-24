// Using Recursion 
class Solution {
        
        private boolean checkSymmetry(TreeNode root1 , TreeNode root2){
                if(root1 == null && root2 == null) return true;
                if(root1 == null || root2 == null) return false;
           
              if(root1.val != root2.val){
                      return false;
              } 
                
                boolean left = checkSymmetry(root1.left , root2.right);
                if(left == false) return false;
                boolean right = checkSymmetry(root1.right , root2.left);
                
                return left && right;
                
        }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
            
            return checkSymmetry(root.left , root.right);
            
    }
}
