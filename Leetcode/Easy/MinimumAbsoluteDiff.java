// For every node we are comparing it with all other nodes 
// TimeComplexity is o(nlogn)
class Solution {
    int minDiff = Integer.MAX_VALUE;
    
    public void dfs(TreeNode root , int nodeVal){
        if(root == null) return;
        
        if(Math.abs(root.val-nodeVal) < minDiff){
            minDiff = Math.abs(root.val-nodeVal);
        }
        
        dfs(root.left , nodeVal);
        dfs(root.right,nodeVal);
    }
    
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0;
        
        dfs(root.left,root.val);
        dfs(root.right,root.val);
        
        
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        
        
        return minDiff;
        
        
        
    }
}
