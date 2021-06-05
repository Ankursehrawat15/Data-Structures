// using Recursion
 
    public void traversal(TreeNode root , ArrayList<Integer> list){
        if(root == null) return;
        
        if(root.left != null){
            traversal(root.left , list);
        }
        
         list.add(root.val);
        
        if(root.right != null){
            traversal(root.right , list);
        }
        
       
     }
    
    public List<Integer> inorderTraversal(TreeNode root) {
      ArrayList<Integer> list = new ArrayList<>();
       
        traversal(root ,list);
        
        return list;
    
            
    }
