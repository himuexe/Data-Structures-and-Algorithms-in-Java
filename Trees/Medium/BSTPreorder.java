public class BSTPreorder {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public TreeNode bstFromPreorder(int[] preorder) {
            TreeNode root = null;
            for (int var : preorder) {
                root = insert(root, var);
            }
            return root;
        }

        public TreeNode insert(TreeNode root, int var) {
            if (root == null) {
                root = new TreeNode(var);
                return root;
            }
            if (root.val > var) {
                root.left = insert(root.left, var);
            } else {
                root.right = insert(root.right, var);
            }
            return root;
        }
    }
}
