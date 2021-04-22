
	public static int largest(TreeNode<Integer> root) {
		int greatest = root.data;
		
		for(int i =0;i<root.children.size();i++) {
			int subtreeGreatest = largest(root.children.get(i));
			if(subtreeGreatest > greatest) {
				greatest = subtreeGreatest;
			}
			
		}
		return greatest;
	}
