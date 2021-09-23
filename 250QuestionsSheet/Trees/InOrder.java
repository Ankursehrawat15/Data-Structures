/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        
    private void inOrder(TreeNode root , List<Integer> list){
            
            if(root == null) return;
            
            inOrder(root.left , list);
            list.add(root.val);
            inOrder(root.right , list);
            
    }    
        
        
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
            
            inOrder(root , list);
            
            return list;
    }
}



// using stacks
  public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
         Stack<TreeNode> stack = new Stack<>();
            if(root == null) return list;
          
            
            TreeNode node = root;
            while(!stack.isEmpty() || node != null){
                    
                   while(node != null){
                           stack.push(node);
                           node = node.left;
                   } 
                    
                    node = stack.pop();
                    list.add(node.val);
                    node = node.right;
            }
            
            return list;
    }
