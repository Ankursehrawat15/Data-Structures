
	public static BinaryTreeNode<Integer> levelWiseInput() {
		Scanner scan = new Scanner(System.in);
         System.out.println("Enter the root data: ");
		int rootData = scan.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> node = queue.poll();
			System.out.println("Enter the left child of " + node.data);
			int leftChild = scan.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
				queue.add(child);
				node.left = child;
			}
			System.out.println("Enter the right child of " + node.data);
			int rightChild = scan.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
				queue.add(child);
				node.right = child;
			}

		}

		return root;

	}
