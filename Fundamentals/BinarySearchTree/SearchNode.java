
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {

		if (root == null)
			return false;

		if (root.data == k) {
			return true;
		} else if (k < root.data) {

			boolean isPresent = searchInBST(root.left, k);
			if (isPresent) {
				return true;
			}

		} else {
			boolean isPresent = searchInBST(root.right, k);
			if (isPresent) {
				return true;
			}
		}

		return false;

	}

}


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        
        if(root == null) return false;
        
        if(root.data == k){
            return true;
        }else if (k < root.data){
            
          return searchInBST(root.left , k);
            
        } else {
            return searchInBST(root.right , k);
        }
        
      
		
	}
}
