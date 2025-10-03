public class SumTree {
    class Solution {
        public void toSumTree(Node root) {
            sum(root);
        }

        public int sum(Node root) {
            if (root == null)
                return 0;

            int originalValue = root.data;
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);

            root.data = leftSum + rightSum;

            return originalValue + leftSum + rightSum;
        }
    }
}
