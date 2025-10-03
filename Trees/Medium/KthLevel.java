
public class KthLevel {
    public static void Klevel(Node root, int level, int k) {
        if (root == null)
            return;
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        Klevel(root.left, level + 1, k);
        Klevel(root.right, level + 1, k);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}