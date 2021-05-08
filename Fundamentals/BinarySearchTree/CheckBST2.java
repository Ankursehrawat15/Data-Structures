	public static boolean isBST(BinaryTreeNode<Integer> root, int min, int max) {

		if (root == null)
			return true;

		if (root.data < min || root.data > max) {
			return false;
		}

		boolean leftOk = isBST(root.left, min, root.data - 1);
		boolean rightOk = isBST(root.right, root.data, max);
		return leftOk && rightOk;

	}
