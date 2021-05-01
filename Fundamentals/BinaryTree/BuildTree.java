	public static BinaryTreeNode<Integer> build(int[] post, int posS, int posE, int[] in, int inS, int inE) {

		if (inS > inE)
			return null;

		int rootData = post[posE];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		int mid = 0;
		for (int i = inS; i < in.length; i++) {
			if (in[i] == rootData) {
				mid = i;
				break;
			}
		}

		int posSLeft = posS;
		int inSLeft = inS;
		int inELeft = mid - 1;
		int posELeft = (inELeft - inSLeft) + posSLeft;

		int posSRight = posELeft + 1;
		int posERight = posE - 1;
		int inSRight = mid + 1;
		int inERight = inE;

		root.left = build(post, posSLeft, posELeft, in, inSLeft, inELeft);
		root.right = build(post, posSRight, posERight, in, inSRight, inERight);

		return root;

	}

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {

		return build(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);

	}
