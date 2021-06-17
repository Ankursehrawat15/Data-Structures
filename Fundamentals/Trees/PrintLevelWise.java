// using Queue
public static void printLevelWise(TreeNode<Integer> root){
	 
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        TreeNode<Integer> nullNode = new TreeNode<>(Integer.MIN_VALUE);
        System.out.println(root.data);
        queue.add(root);
        queue.add(nullNode);
        while(queue.size() != 1){
            TreeNode<Integer> node = queue.remove();
            if(node == nullNode){
                queue.add(nullNode);
                System.out.println();
            }
            
            for(int i =0;i<node.children.size();i++){
                System.out.print(node.children.get(i).data+" ");
                queue.add(node.children.get(i));
            }
            
            
        }

	}
