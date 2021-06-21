// Time Complexity is O(N) 
public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int depthLeft = maxDepth(root.left); // max depth --> left
        int depthRight = maxDepth(root.right); // max depth ---> right
        
        return 1 + Math.max(depthLeft , depthRight);
        
    }
