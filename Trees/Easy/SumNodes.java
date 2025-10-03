
public class SumNodes {
    static int sumBT(Node root) {
        if (root == null)
            return 0;
        int lh = sumBT(root.left);
        int rh = sumBT(root.right);
        return lh + rh + root.data;
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
