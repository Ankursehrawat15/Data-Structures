
	public static void printLevelWise(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = queue.poll();
			String myTree = frontNode.data + ":";
			if (frontNode.left == null) {
				myTree += "L:" + "-1" + ",";
			} else {
				myTree += "L:" + frontNode.left.data + ",";
				queue.add(frontNode.left);
			}

			if (frontNode.right == null) {
				myTree += "R:" + "-1";
			} else {
				myTree += "R:" + frontNode.right.data;
				queue.add(frontNode.right);
			}

			System.out.println(myTree);
		}

	}
