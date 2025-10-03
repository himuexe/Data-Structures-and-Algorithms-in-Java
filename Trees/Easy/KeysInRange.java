import java.util.ArrayList;

public class KeysInRange {
    class Solution {
        public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
            ArrayList<Integer> list = new ArrayList<>();
            helper(root, low, high, list);
            return list;
        }

        private static void helper(Node root, int low, int high, ArrayList<Integer> list) {
            if (root == null)
                return;

            if (root.data >= low && root.data <= high) {
                helper(root.left, low, high, list);
                list.add(root.data);
                helper(root.right, low, high, list);
            } else if (root.data < low) {
                helper(root.right, low, high, list);
            } else {
                helper(root.left, low, high, list);
            }
        }
    }
}
