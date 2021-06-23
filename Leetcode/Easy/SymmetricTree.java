// Time Complexity O(N)
class Solution {
    
    
    public boolean dualTraverse(TreeNode root1 , TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        
        if(root1.val != root2.val){
            return false;
        }
        
        if(root1.left != null && root2.right != null && root1.left.val != root2.right.val){
            return false;
        }
        
        if(root1.right != null && root2.left != null && root1.right.val != root2.left.val){
            return false;
        }
        
        
        boolean leftSide = dualTraverse(root1.left , root2.right);
        if(leftSide == false){
            return false;
        }
        
        boolean rightAns = dualTraverse(root1.right , root2.left);
            
           return rightAns;
        
    }
      
    public boolean isSymmetric(TreeNode root) {
      
        
       return dualTraverse(root.left, root.right);
        
        
    }
}
