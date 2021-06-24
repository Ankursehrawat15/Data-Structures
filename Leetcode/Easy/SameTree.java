// dfs --> going on everyNode and checking whether they satisfies the conditions or not
// time complexity will be 0(N)
class Solution {
    
    public boolean dualTraverse(TreeNode p , TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
       
        if(p.val != q.val) return false;
        
        boolean leftAns  = dualTraverse(p.left , q.left);
        boolean rightAns = dualTraverse(p.right , q.right);
        
         return leftAns && rightAns;
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return dualTraverse(p,q);
        
    }
}
