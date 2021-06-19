   public List<Integer> preorder(Node root) {
     
        List<Integer> list = new ArrayList<>();
        preOrder(root , list);
        return list;
     }

      public void preOrder(Node root , List<Integer> list){
        if(root == null) return;
        
        list.add(root.val);
        for(int i =0;i<root.children.size();i++){
            preOrder(root.children.get(i) , list);
        }
    }
// Using Stacks Iterative Approach
class Solution {
    public List<Integer> preorder(Node root) {
       Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(root);
        
        if(root == null ){
            return list;
        }
        
        while(!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);
            for(int i = node.children.size()-1;i>=0;i--){
                stack.push(node.children.get(i));
            }
        }
        
        return list;
    }
    
}
