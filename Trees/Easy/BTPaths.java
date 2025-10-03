import java.util.ArrayList;
import java.util.List;

public class BTPaths {
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> result = new ArrayList<>();
            StringBuilder path = new StringBuilder();
            dfs(root, path, result);
            return result;
        }

        private void dfs(TreeNode node, StringBuilder path, List<String> result) {
            if (node == null)
                return;

            int len = path.length();
            if (len > 0) {
                path.append("->");
            }
            path.append(node.val);

            if (node.left == null && node.right == null) {
                result.add(path.toString());
            } else {
                dfs(node.left, path, result);
                dfs(node.right, path, result);
            }

            path.setLength(len); // backtrack
        }
    }
}
