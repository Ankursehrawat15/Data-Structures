// preOrder Traversal
public static void printPreOrder(TreeNode<Integer> root){
		if(root == null) return;
     System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++){
            printPostOrder(root.children.get(i));
        }
        
     
	}

//postOrder Traversal
public static void printPostOrder(TreeNode<Integer> root){
		if(root == null) return;
        for(int i=0;i<root.children.size();i++){
            printPostOrder(root.children.get(i));
        }
        
        System.out.print(root.data+" ");
	}
