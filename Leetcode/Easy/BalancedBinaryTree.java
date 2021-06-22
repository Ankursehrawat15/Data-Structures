class Solution {
    
    public int getHeight(TreeNode root){
        if(root == null) return 0;
        
        return 1 + Math.max(getHeight(root.left) , getHeight(root.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        if(root.left == null && root.right == null){
            return true;
        }
        
        boolean leftBalanced = isBalanced(root.left);
        if(leftBalanced != true){
            return false;
        }
        boolean rightBalanced = isBalanced(root.right);
        if(rightBalanced != true){
            return false;
        }
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if(Math.abs(leftHeight - rightHeight ) <= 1){
            return true;
        }else{
            return false;
        }
        
    }
}
