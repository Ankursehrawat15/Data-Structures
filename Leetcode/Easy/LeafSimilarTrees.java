class Solution {
    
    public void leaf(TreeNode root1 , ArrayList<Integer> list){
       
        if(root1 == null) return ;
        
        if(root1.left == null && root1.right == null){
            list.add(root1.val);
        }
        
        leaf(root1.left , list);
        leaf(root1.right , list);
        
        
       
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2){
        
          ArrayList<Integer> list1 = new ArrayList<>();
          ArrayList<Integer> list2 = new ArrayList<>();
        
          leaf(root1 , list1);
          leaf(root2 , list2);
        
        if(list1.size() != list2.size()){
            return false;
        }
        
        for(int i =0;i<list1.size();i++){
            
         if(list1.get(i) != list2.get(i)){
                return false;
            }
        
        }
        
        
        return true;
       
        
    }
