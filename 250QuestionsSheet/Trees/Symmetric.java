// Using Recursion 
class Solution {
        
        private boolean checkSymmetry(TreeNode root1 , TreeNode root2){
                if(root1 == null && root2 == null) return true;
                if(root1 == null || root2 == null) return false;
           
              if(root1.val != root2.val){
                      return false;
              } 
                
                boolean left = checkSymmetry(root1.left , root2.right);
                if(left == false) return false;
                boolean right = checkSymmetry(root1.right , root2.left);
                
                return left && right;
                
        }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
            
            return checkSymmetry(root.left , root.right);
            
    }
}

// Using Queue
  public boolean isSymmetric(TreeNode root) {
            if(root == null) return true;
       Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root.left);
         queue.offer(root.right);
            
            while(queue.size() > 0){
               
                    TreeNode t1 = queue.poll();
                    TreeNode t2 = queue.poll();
                    
                    
                   if(t1 == null && t2 == null) continue;
                   if(t1== null || t2 == null) return false;
                    if(t1.val != t2.val) return false;
                    
              
                    queue.offer(t1.left);
                    queue.offer(t2.right);        
                
                    
                   
                         queue.offer(t1.right);
                    queue.offer(t2.left);         
                    
                   
                    
                    
            }
            
            
            return true;
    }
