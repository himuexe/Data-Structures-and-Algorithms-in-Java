
public class KthAncestor {
    class Solution {
        public int kthAncestor(Node root, int k, int node) {
            int[] result = new int[1];
            result[0] = -1;
            findKthAncestor(root, k, node, result);
            return result[0];
        }

        private int findKthAncestor(Node root, int k, int node, int[] result) {
            if (root == null)
                return -1;

            if (root.data == node)
                return 0;

            int left = findKthAncestor(root.left, k, node, result);
            int right = findKthAncestor(root.right, k, node, result);

            if (left != -1) {
                if (left + 1 == k) {
                    result[0] = root.data;
                }
                return left + 1;
            }

            if (right != -1) {
                if (right + 1 == k) {
                    result[0] = root.data;
                }
                return right + 1;
            }

            return -1;
        }
    }
}
