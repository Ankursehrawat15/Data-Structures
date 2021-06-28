class Pair{
    int diameter; 
    int height;
}
class Solution {
    
    public Pair diameter(TreeNode root){
        if(root == null) {
           Pair output = new Pair();
            output.height = 0;
            output.diameter = 0;
            return output;
        }
        
        Pair left = diameter(root.left);
        Pair right = diameter(root.right);
        
       Pair output = new Pair();

        output.height = 1 + Math.max(left.height , right.height);
        output.diameter = Math.max(left.height + right.height,Math.max(left.diameter , right.diameter));
        
        return output;
    }
    
    
    public int diameterOfBinaryTree(TreeNode root) {
       Pair ans = diameter(root);
        return ans.diameter;
    }
}
