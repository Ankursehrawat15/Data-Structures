class Solution {
    
    public void inOrder(TreeNode root , List<Integer> list){
        if(root == null){
            return;
        }
        
        inOrder(root.left , list);
        list.add(root.val);
        inOrder(root.right , list);
    }
    
    public TreeNode construct(List<Integer> list){
        if(list.size() == 0) return null;
        
        TreeNode root = null;
        TreeNode tail = null;
        for(int i =0;i<list.size();i++){
           
            TreeNode node = new TreeNode(list.get(i));
            if(root == null){
                root = node;
                tail = node;
            }else{
            
            tail.right = node;
            tail = tail.right;
            }
        }
        
        
        return root;
        
        
    }
    public TreeNode increasingBST(TreeNode root) {
        
      List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        
        return construct(list);
    }
}
