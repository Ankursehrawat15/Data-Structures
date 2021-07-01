class Solution {
    
    public int maximumCheck(TreeNode root , int max){
        if(root == null) return 0;
        
        int count = root.val >= max ? 1: 0;
                   
        count += maximumCheck(root.left,Math.max(root.val,max));
        count += maximumCheck(root.right,Math.max(root.val,max));
        
        return count;
    }
  
    
    public int goodNodes(TreeNode root) {
     
        return maximumCheck(root,-100000);
    
    }
}
