class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode node = new TreeNode(val);
            return node;
        }
        
        
        if(val < root.val && root.left == null){
            TreeNode node = new TreeNode(val);
            root.left = node;
            
        }else if(val > root.val && root.right == null){
            TreeNode node = new TreeNode(val);
            root.right = node;
          
        }else if(val < root.val && root.left != null){
            root.left = insertIntoBST(root.left,val);
        }else{
            root.right =  insertIntoBST(root.right,val);
        }
        
        return root;
        
    }
}
