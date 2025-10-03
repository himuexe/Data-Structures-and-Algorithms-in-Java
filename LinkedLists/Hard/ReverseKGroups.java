package LinkedLists.Hard;

public class ReverseKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        
        if (count == k) {
            ListNode reversedHead = reverseLinkedList(head, k);
            head.next = reverseKGroup(curr, k);
            return reversedHead;
        }
        
        return head;
    }
    
    private ListNode reverseLinkedList(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (k > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}