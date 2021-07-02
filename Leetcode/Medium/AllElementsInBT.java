// using sort function
class Solution {
    
    public void inOrder(TreeNode root , List<Integer> list){
       if(root == null) return;
        
        inOrder(root.left , list);
        list.add(root.val);
        inOrder(root.right , list);
        
        
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
    
        inOrder(root1 , list);
        inOrder(root2,list);
     
        Collections.sort(list);
        return list;
      
       
    }
} 



// without sort function
public void inOrder(TreeNode root , List<Integer> list){
       if(root == null) return;
        
        inOrder(root.left , list);
        list.add(root.val);
        inOrder(root.right , list);
        
        
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        inOrder(root1 , list1);
        inOrder(root2,list2);
        List<Integer> ans = new ArrayList<>();
       
      
        while(list1.size() != 0 && list2.size() != 0){
            if(list1.get(0) < list2.get(0)){
                ans.add(list1.remove(0));
            }else{
                ans.add(list2.remove(0));
            }
        }
        
        if(list1.size() != 0){
            for(int elem : list1){
                ans.add(elem);
            }
        }
        
        if(list2.size() != 0){
            for(int elem : list2){
                ans.add(elem);
            }
        }
        
        
        return ans;
    }
}
