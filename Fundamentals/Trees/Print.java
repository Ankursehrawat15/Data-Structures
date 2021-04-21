public static TreeNode<Integer> takeInput(Scanner scan) {

		System.out.println("Enter the node:" + " ");
		int data = scan.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data);
		System.out.println("Enter the number of children for " + data);
		int childCount = scan.nextInt();
		// if children are zero then root will be returned directly.
		for (int i = 0; i < childCount; i++) {
			// this is basically creating my sub tree: using recursion here.
			TreeNode<Integer> child = takeInput(scan);

			root.children.add(child);

		}

		return root;

	}

	public static void print(TreeNode<Integer> root) {

		String s = root.data + ": ";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";

		}

		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeNode<Integer> root = takeInput(scan);
		print(root);

	}
