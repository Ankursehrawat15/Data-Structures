class Solution {
    
    public void inOrder(TreeNode root , List<Integer> list){
        if(root == null) return ;
        
       
        inOrder(root.left,list);
         list.add(root.val);
        inOrder(root.right,list);
        
    }
    
 
    public boolean findTarget(TreeNode root, int k) {
        
        List<Integer> list = new ArrayList<>();
        inOrder(root , list);
        
        if(list.size() <= 1){
            return false;
        }
        
        int left = 0;
        int right = list.size()-1;
        
        while(left < right){
            int sum = list.get(left) + list.get(right);
            if(sum == k){
                return true;
            }else if (sum < k){
                left++;
            }else{
                right--;
            }
        }
        
        return false;
        
       
    }
}
