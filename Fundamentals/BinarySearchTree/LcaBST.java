 public static BinaryTreeNode<Integer> nodeLCA(BinaryTreeNode<Integer> root , int a , int b){
        
        if(root == null){
            return null;
        }
        
        if(root.data == a  || root.data == b){
            return root;
        }
        
        BinaryTreeNode<Integer> leftNode = nodeLCA(root.left , a , b);
        BinaryTreeNode<Integer> rightNode = nodeLCA(root.right , a , b);
        
        if(leftNode != null && rightNode != null){
            return root;
        } else if (leftNode != null){
            return leftNode;
        } else{
            return rightNode;
        }
        
        
        
        
    }
    
    
    
	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        
        BinaryTreeNode<Integer> ans = nodeLCA(root , a, b);
        if(ans != null){
            return ans.data;
        }else{
            return -1;
        }
        
        
        
		
	}
