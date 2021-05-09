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

}
