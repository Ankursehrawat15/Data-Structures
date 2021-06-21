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
