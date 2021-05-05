/* Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
Note: Duplicate elements should be kept in the right subtree.

Sample Input 1 :
3 1 5 -1 2 -1 -1 -1 -1
Sample Output 1 :
true
Sample Input 2 :
5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
Sample Output 2 :
false


*/


// first approach 
	public class Solution {

		public static int maximum(BinaryTreeNode<Integer> root) {

			if (root == null) {
				return Integer.MIN_VALUE;
			}

			int leftmax = maximum(root.left);
			int rightmax = maximum(root.right);

			return Math.max(root.data, Math.max(leftmax, rightmax));

		}

		public static int minimum(BinaryTreeNode<Integer> root) {

			if (root == null) {
				return Integer.MAX_VALUE;
			}

			int minleft = minimum(root.left);
			int minright = minimum(root.right);

			return Math.min(root.data, Math.min(minleft, minright));

		}

		public static boolean isBST(BinaryTreeNode<Integer> root) {

			if (root == null)
				return true;

			int maxLeft = maximum(root.left);
			int minRight = minimum(root.right);

			if (maxLeft >= root.data || minRight <= root.data) {

				return false;
			}

			boolean leftBst = isBST(root.left);
			boolean rightBst = isBST(root.right);

			if (leftBst && rightBst) {
				return true;
			} else {
				return false;
			}

		}

	}
