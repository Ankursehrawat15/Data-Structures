class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null){
            return ans;
        }
        
        for(int i =0;i<root.children.size();i++){
            postorder(root.children.get(i));
        }
        
        
        ans.add(root.val);
        
        
        return ans;
    }
}
