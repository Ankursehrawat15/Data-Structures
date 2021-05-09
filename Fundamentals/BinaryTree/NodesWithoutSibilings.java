/*
For a given Binary Tree of type integer, print all the nodes without any siblings.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints the node data in a top to down fashion with reference to the root. 
Node data in the left subtree will be printed first and then the right subtree.
A single space will separate them all.
 Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 second
Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
9    
*/

public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		if (root.left == null && root.right != null) {

			System.out.print(root.right.data + " ");
		} else if (root.left != null && root.right == null) {
			System.out.print(root.left.data + " ");
		} else if (root.left == null && root.right == null) {
			return;
		}

		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);

	}
