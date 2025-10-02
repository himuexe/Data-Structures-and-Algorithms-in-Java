import java.util.*;

public class TopView {
    /*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    static class Info{
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>(); 
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        
        while(!q.isEmpty()){
            Info curr = q.remove();
            
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }
            
            if(curr.node.left != null){
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }
            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd + 1)); 
                max = Math.max(max, curr.hd + 1);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++){
            list.add(map.get(i).data); 
        }
        return list;
    }
}
}
