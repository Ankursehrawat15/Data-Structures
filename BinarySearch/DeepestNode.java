// Using A queue TC - O(N) and SC - O(N)
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root) {
        Queue<Tree> queue = new LinkedList<>();
        if (root == null)
            return -1;
        else if (root.left == null && root.right == null)
            return root.val;
        queue.add(root);
        int ans = 0;
        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Tree node = queue.poll();
                if (i == 0) {
                    ans = node.val;
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return ans;
    }
}
