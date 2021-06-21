// O(N)
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
         
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        
      
    
        return root;
    }
}
