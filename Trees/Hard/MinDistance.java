package Trees.Hard;

public class MinDistance {
    int findDist(Node root, int a, int b) {
        Node lca = findLCA(root, a, b);
        int distA = findDistance(lca, a, 0);
        int distB = findDistance(lca, b, 0);
        return distA + distB;
    }

    Node findLCA(Node root, int a, int b) {
        if (root == null || root.data == a || root.data == b) {
            return root;
        }

        Node left = findLCA(root.left, a, b);
        Node right = findLCA(root.right, a, b);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    int findDistance(Node root, int target, int dist) {
        if (root == null) {
            return -1;
        }

        if (root.data == target) {
            return dist;
        }

        int left = findDistance(root.left, target, dist + 1);
        if (left != -1) {
            return left;
        }

        return findDistance(root.right, target, dist + 1);
    }

    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
}
