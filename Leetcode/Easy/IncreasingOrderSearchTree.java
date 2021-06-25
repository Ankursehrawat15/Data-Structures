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




// Another Way
class Pair{
    TreeNode root;
    TreeNode tail;
}

class Solution {
   
    public Pair construct(TreeNode root){
        if(root == null){
            Pair output = new Pair();
            return output;
        }
        
        Pair left = construct(root.left);
        Pair right = construct(root.right);
        TreeNode node = new TreeNode(root.val);
        
        Pair output = new Pair();
        if(left.tail != null){
            left.tail.right = node; 
        }
        
        if(right.root != null){
          node.right = right.root; 
        }
        
        
        if(left.root != null){
            output.root = left.root;
        }else{
            output.root = node;
        }
        
        if(right.tail != null){
            output.tail = right.tail;
        }else{
            output.tail = node;
        }
        
        
        return output;
        
    }
   
    public TreeNode increasingBST(TreeNode root) {
        
    
        
        return construct(root).root;
    }
}
