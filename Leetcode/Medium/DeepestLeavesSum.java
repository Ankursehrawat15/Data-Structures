
// using Queue
class Solution {
    public int deepestLeavesSum(TreeNode root) {
     Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while(!queue.isEmpty()){
            int size  = queue.size();
            sum = 0;
            for(int i =0;i<size;i++){
                TreeNode node = queue.poll();
                
                sum += node.val;
                
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        
        return sum;
       
    }
}

// using Recursion
class Solution {
    int sum  = 0;
    public int height(TreeNode root){
        if(root == null) return 0;
        
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    
    public void sum (TreeNode root , int maxDepth){
        if(root == null || maxDepth < 0 ) return;
        
        if(maxDepth == 0){
            sum += root.val;
        }
        sum(root.left , maxDepth - 1);
        sum(root.right,maxDepth-1);
        
        
    }
    
    
    public int deepestLeavesSum(TreeNode root) {
     
        int maxDepth = height(root) - 1;
        sum(root,maxDepth);
        
        return sum;
       
    }
}
