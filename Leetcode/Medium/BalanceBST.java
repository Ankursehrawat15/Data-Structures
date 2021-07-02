  
    public void inOrder(TreeNode root , List<Integer> list){
        if(root == null) return;
        
        inOrder(root.left , list);
        list.add(root.val);
        inOrder(root.right , list);
        
    }
    
    public TreeNode constructBST(List<Integer> list , int start , int end){
        if(start > end){
            return null;
        }
        
        int mid = (start + end ) /2;
        TreeNode root = new TreeNode(list.get(mid));
        
        root.left = constructBST(list,start,mid-1);
        root.right = constructBST(list,mid+1,end);
        
        
        return root;
        
    }
    
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        inOrder(root,list);
        
        return constructBST(list,0,list.size()-1);
      }
