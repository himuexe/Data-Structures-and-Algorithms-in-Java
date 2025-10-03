
import java.util.ArrayList;

public class LCA1 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public boolean getPath(TreeNode root, TreeNode n, ArrayList<TreeNode> path) {
            if (root == null) {
                return false;
            }

            path.add(root);

            if (root == n) {
                return true;
            }

            if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            ArrayList<TreeNode> path1 = new ArrayList<>();
            ArrayList<TreeNode> path2 = new ArrayList<>();

            getPath(root, p, path1);
            getPath(root, q, path2);

            int i = 0;
            while (i < path1.size() && i < path2.size()) {
                if (path1.get(i) != path2.get(i))
                    break;
                i++;
            }

            return path1.get(i - 1);
        }
    }
}
