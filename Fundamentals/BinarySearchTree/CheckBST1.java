public static Pair<Boolean, Pair<Integer, Integer>> isBST(BinaryTreeNode<Integer> root) {

		if (root == null) {
			Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
			output.first = true;
			output.second = new Pair<Integer, Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;

			return output;
		}
		Pair<Boolean, Pair<Integer, Integer>> leftTree = isBST(root.left);
		Pair<Boolean, Pair<Integer, Integer>> rightTree = isBST(root.right);
		int min = Math.min(root.data, Math.min(leftTree.second.first, rightTree.second.first));
		int max = Math.max(root.data, Math.max(leftTree.second.second, rightTree.second.second));

		boolean isbst = ((root.data > leftTree.second.second) && (root.data <= rightTree.second.first)
				&& (leftTree.first) && (rightTree.first));
		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
		output.first = isbst;
		output.second = new Pair<Integer, Integer>();
		output.second.first = min;
		output.second.second = max;

		return output;

	}
