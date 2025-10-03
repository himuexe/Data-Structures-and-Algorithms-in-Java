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
public class DiameterTree2 {
    public class Info {
        int d;
        int h;

        public Info(int d, int h) {
            this.d = d;
            this.h = h;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Info var = diameter(root);
        return var.d;
    }

    public Info diameter(TreeNode root) {
        if (root == null)
            return new Info(0, 0);
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int d = Math.max(Math.max(leftInfo.d, rightInfo.d), leftInfo.h + rightInfo.h);
        int h = Math.max(leftInfo.h, rightInfo.h) + 1;
        return new Info(d, h);

    }
}