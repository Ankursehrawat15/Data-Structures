public static int countLeafNodes(TreeNode<Integer> root){
        if(root == null) return0
        int leafNodes = 0;
        if(root.children.size() == 0){
            leafNodes++;
        }
        for(int i =0;i<root.children.size();i++){
            leafNodes += countLeafNodes(root.children.get(i));
        }
        
        return leafNodes;

		

	}
	
