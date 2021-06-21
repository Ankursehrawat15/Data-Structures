class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
     Queue<TreeNode> queue = new LinkedList<>();
        List<Double> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        queue.add(root);
        
        while(!queue.isEmpty()){
             int size = queue.size();
             long sum = 0;
           
            for(int i=0;i<size;i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                
                sum = sum + queue.poll().val;
               
                
            }
            
            list.add((double)sum/size);
        }
        
        
         return list;
        
    }
    
   
}
