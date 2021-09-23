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

// TimeComplexity is O(N) and SpaceComplexity is O(N)

class Solution {
        
        
    private void preOrder(TreeNode root , List<Integer> list){
            if(root == null) return;
            
            list.add(root.val);
            
            preOrder(root.left , list);
            preOrder(root.right , list);
    }    
      
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
            
            preOrder(root , list);
            
            return list;
            
    }
}

// Using Stacks
 public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            if(root == null) return list;
            stack.push(root);
            
            while(!stack.isEmpty()){
                   TreeNode node = stack.pop();
                    
                    if(node.right != null){
                            stack.push(node.right);
                    }
                    
                    if(node.left != null){
                            stack.push(node.left);
                    }
                    
                    list.add(node.val);
            }
           
            
            return list;
            
    }
