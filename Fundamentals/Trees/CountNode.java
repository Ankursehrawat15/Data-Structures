public static int count(TreeNode<Integer> root) {
	if(root == null) {
		return 0;
	}
		int count =1;
		for(int i =0;i<root.children.size();i++) {
			count += count(root.children.get(i));
		}
		return count;
	}
