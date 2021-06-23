class Solution {

  public boolean isCousins(TreeNode root, int x, int y) {
    if (root == null || x == y) return false;
    Queue < TreeNode > queue = new LinkedList < > ();
    queue.add(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      List < Integer > list = new ArrayList < > ();
      for (int i = 0; i < size; i++) {
        root = queue.remove();
        list.add(root.val);

        if (root.left != null) {
          queue.add(root.left);
        }

        if (root.right != null) {
          queue.add(root.right);
        }

        if (root.left != null && root.right != null) {
          if ((root.left.val == x && root.right.val == y) || (root.left.val == y && root.right.val == x)) {
            return false;
          }
        }

        if (list.contains(x) && list.contains(y)) {
          return true;
        }

      }

    }

    return false;

  }
}
