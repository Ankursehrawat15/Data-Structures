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
