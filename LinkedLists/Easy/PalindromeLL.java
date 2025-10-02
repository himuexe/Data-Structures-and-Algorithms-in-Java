public class PalindromeLL {
    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode mid = findMid(head);
        ListNode prev = null;
        ListNode curr = mid.next;
        
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        ListNode rightHead = prev;
        ListNode leftHead = head;
        
        while (rightHead != null) {
            if (rightHead.val != leftHead.val) return false;
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }
        
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}