class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        
        TreeNode leftSide = lowestCommonAncestor(root.left , p , q);
        
        TreeNode rightSide = lowestCommonAncestor(root.right , p , q);
        
        if(leftSide == null){
            return rightSide;
        }else if ( rightSide == null){
            return leftSide;
        }else{
            return root;
        }
        
        
    }
}
