public static int countNodes(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;

		int nodes = 1;
		nodes += countNodes(root.left);
		nodes += countNodes(root.right);

		return nodes;

	}
