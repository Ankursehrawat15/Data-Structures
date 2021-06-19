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
