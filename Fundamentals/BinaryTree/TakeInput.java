
	public static BinaryTreeNode<Integer> takeInput(Scanner scan) {
		System.out.println("Enter the root data");
		int rootData = scan.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		root.left = takeInput(scan);
		root.right = takeInput(scan);

		return root;

	}
// print the binary tree

public static void print(BinaryTreeNode<Integer> root) {
		if(root  == null) {
			return;
		}
		
		String myTree = root.data+": ";
		
		if(root.left != null) {
			myTree += root.left.data+",";
		}
		if(root.right != null) {
			myTree += root.right.data;
		}
		
		System.out.println(myTree);
		print(root.left);
		print(root.right);
		
	}
