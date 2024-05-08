class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null) return head;
        ListNode r = reverseList(head);
        ListNode curr = r;
        int cMax = 0;
        while (curr.next != null) {
            if (curr.val > cMax) cMax = curr.val;
            if (curr.next.val < cMax) curr.next= curr.next.next;
            else curr = curr.next;
        }
        return reverseList(r);
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}