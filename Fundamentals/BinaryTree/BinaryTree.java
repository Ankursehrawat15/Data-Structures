// node class
class BinaryTreeNode<T> {

	T data;
	BinaryTreeNode<T> right;
	BinaryTreeNode<T> left;

	BinaryTreeNode(T data) {
		this.data = data;
		left = null;
		right = null;
	}

}
public class BinaryTree {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(20);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(30);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(40);
		root.left = node1;
		root.right = node2;
	}

}
