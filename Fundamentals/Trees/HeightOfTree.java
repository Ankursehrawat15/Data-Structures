public static int getHeight(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int height = 1;
		int maxHeight = 0;
		for (int i = 0; i < root.children.size(); i++) {
			int subtreeHeight = getHeight(root.children.get(i));
			if (subtreeHeight > maxHeight) {
				maxHeight = subtreeHeight;
			}

		}

		return height + maxHeight;

	}
	
