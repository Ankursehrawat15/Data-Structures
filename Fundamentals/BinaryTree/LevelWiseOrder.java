public static void printLevelWise(BinaryTreeNode<Integer> root) {
       Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        if(root == null){
            return;
        }
        
        queue.add(root);
        while(queue.size() > 0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                BinaryTreeNode<Integer> node = queue.poll();
                System.out.print(node.data+" ");
                
                if(node.left != null){
                    queue.add(node.left);
                }
                
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            
            System.out.println()
        }
    }
