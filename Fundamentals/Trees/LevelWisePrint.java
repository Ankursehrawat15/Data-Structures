
	public static TreeNode<Integer> takeInput(){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the RootNode: ");
		int rootData = scan.nextInt();
		
		TreeNode<Integer> rootNode = new TreeNode<>(rootData);
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(rootNode);
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			
			System.out.println("Enter the number of childrens of "+ frontNode.data);
			int childCount = scan.nextInt();
			
			for(int i =0;i<childCount;i++) {
				System.out.println("Enter the "+(i+1)+" node of "+ frontNode.data);
				int childData = scan.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
				frontNode.children.add(childNode);
				queue.add(childNode);
			}
		}
		
		return rootNode;
		
	}
