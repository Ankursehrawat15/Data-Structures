class BinaryTreeNode<T>{
	BinaryTreeNode<T> root;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	T data ;

	public BinaryTreeNode(T data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}


public class BinarySearchTree {
	private BinaryTreeNode<Integer> root;
	
	// Inserting a node intp the tree
	private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {
		if (root == null) {
			BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<>(data);
			return rootNode;
		}

		if (data >= root.data) {

			root.right = insertHelper(root.right, data);
		}

		if (data < root.data) {

			root.left = insertHelper(root.left, data);
		}

		return root;

	}

	public void insert(int data) {

		root = insertHelper(root, data);

	}


   // searching the node in the tree
private boolean hasDataHelper(int data , BinaryTreeNode<Integer> root) {
	if(root == null) {
		return false;
	}
	
	if(root.data == data) {
		return true;
	}else if (data > root.data) {
		// call right subTree
		return hasDataHelper(data , root.right);
	}else {
		// call left sub Tree
		return hasDataHelper(data , root.left);
	}
}

public boolean hasData(int data) {
	return hasDataHelper(data , root);
}
	
	// deleting a node in the tree
	// printing the tree

}
