public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		if(root == null){
            return null;
        }
        
        ArrayList<LinkedListNode<Integer>> list = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
            q.add(root);
        
        while(!q.isEmpty()){
            
            BinaryTreeNode<Integer> headNode = q.poll();
            LinkedListNode<Integer> head = new LinkedListNode<>(headNode.data);
            LinkedListNode<Integer> tail = head;
            int size = q.size();
           
             if(headNode.left != null){
                q.add(headNode.left);
            }
            
            if(headNode.right != null){
                q.add(headNode.right);
            }
            
            
            for(int i=0;i<size;i++){
                BinaryTreeNode<Integer> treeNode = q.poll();
                    if(treeNode.left != null){
                q.add(treeNode.left);
            }
            
            if(treeNode.right != null){
                q.add(treeNode.right);
            }
            
                LinkedListNode<Integer> node = new LinkedListNode<>(treeNode.data);
                tail.next = node;
                
                tail = tail.next;
            }
            
           
            list.add(head);
            
    }
        
        
        return list;
            
 }
