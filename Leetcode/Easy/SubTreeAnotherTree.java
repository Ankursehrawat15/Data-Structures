class Solution {
    
    public boolean dfs(TreeNode root , TreeNode subTree){
        if(root == null && subTree == null) return true;
        if(root == null || subTree == null) return false;
        if(root.val != subTree.val){
            return false;
        }
        
        boolean left = dfs(root.left , subTree.left);
        if(left != true){
            return false;
        }
        
        boolean right = dfs(root.right , subTree.right);
        
        return right;
    } 
    
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(root == null) return false;
        
       if(dfs(root,subRoot)){
           return true;
       }
        
        
        boolean left =  isSubtree(root.left , subRoot);
       
        boolean right = isSubtree(root.right , subRoot);
        
        return right || left;
        
        
    }
}
