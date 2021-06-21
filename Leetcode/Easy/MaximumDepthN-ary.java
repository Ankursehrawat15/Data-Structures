// time complexity O(N) --> as we are going on everyNode and cal height

class Solution {
   
    
    public int maxDepth(Node root) {
        
        if(root == null) return 0;
        int maxHeight = 0;
     for(int i =0;i<root.children.size();i++){
         int childHeight = maxDepth(root.children.get(i));
         if(childHeight > maxHeight){
             maxHeight = childHeight;
         }
     }
        
        return 1 + maxHeight;
        
       
        
    }
}


// BFS using Queue
class Solution {
   
    
    public int maxDepth(Node root) {
        
        if(root == null) return 0;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i = 0; i<size;i++){
                Node node = queue.poll();
                for(Node child : node.children ){
                    queue.add(child);
                }
                
             }
            
            depth++;
        }
        
            return depth;
       }
}
