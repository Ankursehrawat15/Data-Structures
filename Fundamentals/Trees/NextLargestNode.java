
// approach i used (by using queues)
public static Queue<TreeNode<Integer>> findNextLargestNode(TreeNode<Integer> root, int n,
			Queue<TreeNode<Integer>> queue) {

		if (root.data > n) {
			queue.add(root);
		}
		for (int i = 0; i < root.children.size(); i++) {

			queue = findNextLargestNode(root.children.get(i), n, queue);
		}

		return queue;

	}

	public static TreeNode<Integer> findNextLargestNode(TreeNode<Integer> root, int n) {
		if (root == null) {
			TreeNode<Integer> node = null;
			return node;
		}
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue = findNextLargestNode(root, n, queue);
		TreeNode<Integer> nextLargestNode = null;
		int smallest = Integer.MAX_VALUE;
		while (!queue.isEmpty()) {
			TreeNode<Integer> newNode = queue.poll();
			if (newNode.data < smallest) {
				nextLargestNode = newNode;
				smallest = newNode.data;
			}

		}
    
    
    // better approach
    
	public  static TreeNode<Integer> nextLargestNode(TreeNode<Integer> root , int n){
		
		TreeNode<Integer> largestNode = null;
		if(root.data > n) {
              largestNode = root;			
		}
		
		for(int i =0;i<root.children.size();i++) {
			TreeNode<Integer> childLargestNode = nextLargestNode(root.children.get(i) , n);
			if(childLargestNode != null) {
				if(largestNode == null || childLargestNode.data < largestNode.data) {
					largestNode = childLargestNode;
				}
			}
		}
		
		return largestNode;
	}
    

		return nextLargestNode;

	}



	
