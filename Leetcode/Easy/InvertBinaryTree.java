// O(N)
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
       
        TreeNode invertLeft = invertTree(root.left);
        TreeNode invertRight = invertTree(root.right);
        
        root.left = invertRight;
        root.right = invertLeft;
    
        return root;
    }
}
