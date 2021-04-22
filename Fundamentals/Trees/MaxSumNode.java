	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {

		if (root == null)
			return root;
		int sum = root.data;

		for (int i = 0; i < root.children.size(); i++) {
			sum += root.children.get(i).data;

		}
		int maxSum = sum;
		TreeNode<Integer> maxNode = root;

		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> subMaxNode = maxSumNode(root.children.get(i));

			int subSum = subMaxNode.data;
			for (int j = 0; j < subMaxNode.children.size(); j++) {
				subSum += subMaxNode.children.get(j).data;
			}

			if (subSum > maxSum) {
				maxSum = subSum;
				maxNode = subMaxNode;
			}

		}

		return maxNode;

	}
