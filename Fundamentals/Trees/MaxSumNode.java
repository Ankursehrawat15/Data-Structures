	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {

		if (root == null)
			return root;
		int sum = root.data;

		for (int i = 0; i < root.children.size(); i++) {
			sum += root.children.get(i).data;

		}
		int maxSum = sum;
		TreeNode<Integer> maxNode = root;

		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> subMaxNode = maxSumNode(root.children.get(i));

			int subSum = subMaxNode.data;
			for (int j = 0; j < subMaxNode.children.size(); j++) {
				subSum += subMaxNode.children.get(j).data;
			}

			if (subSum > maxSum) {
				maxSum = subSum;
				maxNode = subMaxNode;
			}

		}

		return maxNode;

	}

// Another approach
	public class Solution {

		static class Pair<T> {
			TreeNode<T> node;
			int sum;
		}

		public static Pair<Integer> maxSum(TreeNode<Integer> root) {
			Pair<Integer> maxNode = new Pair<>();
			if (root == null)
				return maxNode;
			int maxsum = root.data;

			for (int i = 0; i < root.children.size(); i++) {
				maxsum += root.children.get(i).data;

			}

			maxNode.node = root;
			maxNode.sum = maxsum;

			for (int i = 0; i < root.children.size(); i++) {
				Pair<Integer> subMaxNode = maxSum(root.children.get(i));
				if (subMaxNode.sum > maxNode.sum) {
					maxNode.node = subMaxNode.node;
					maxNode.sum = subMaxNode.sum;
				}

			}

			return maxNode;

		}

		public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {

			return maxSum(root).node;

		}

	}
