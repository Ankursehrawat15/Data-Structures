	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int heightTree = 1;
		int leftHeight = 0;
		int rightHeight = 0;
		if (root.left != null) {
			leftHeight = height(root.left);
		}

		if (root.right != null) {
			rightHeight = height(root.right);

		}

		if (leftHeight > rightHeight) {
			heightTree += leftHeight;
		} else {
			heightTree += rightHeight;
		}

		return heightTree;
	}

// with clean code:
	public static int height(BinaryTreeNode<Integer> root) {

		if (root == null)
			return 0;

		return Math.max(height(root.left), height(root.right)) + 1;

	}
