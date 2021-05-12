// Lowest common Anscestor
static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
      
        if(root == null){
            return -1;
        }
		
        if(root.data  == a || root.data == b){
            
            return root.data;
        }
        
         int left = getLCA(root.left , a, b);        
         int right = getLCA(root.right , a ,b);
        
        if(left == -1 ){
            return right;
        } else if (right == -1){
            return left;
        } else{
            return root.data;
        }
  }


// better code approach 
  public static BinaryTreeNode<Integer> nodeLCA(BinaryTreeNode<Integer> root, int a, int b) {

        if (root == null) {
            return null;
        }


        if (root.data == a || root.data == b) {

            return root;
        }

        BinaryTreeNode<Integer> leftNode = nodeLCA(root.left, a, b);
        BinaryTreeNode<Integer> rightNode = nodeLCA(root.right, a, b);

        if (leftNode != null && rightNode != null) {
            return root;
        } else if (leftNode != null) {
            return leftNode;
        } else {
            return rightNode;
        }


    }


    static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

        BinaryTreeNode<Integer> ans = nodeLCA(root, a, b);
        if (ans != null) {
            return ans.data;
        } else {
            return -1;
        }


    }


