public static BinaryTreeNode<Integer> constructBST(int[] arr, int si, int ei) {
		if (si > ei) {
			return null;
		}

		int mid = (si + ei) / 2;
		BinaryTreeNode<Integer> node = new BinaryTreeNode<>(arr[mid]);

		node.left = constructBST(arr, si, mid - 1);
		node.right = constructBST(arr, mid + 1, ei);

		return node;

	}

	public static BinaryTreeNode<Integer> arrayToBST(int[] arr, int size) {
		int startIndex = 0;
		int endIndex = size - 1;

		return constructBST(arr, startIndex, endIndex);

	}
