class Solution {
    public ListNode doubleIt(ListNode head) {
        if (head == null) return head;
        if (head.val == 0) return head;
        
        ListNode list = reverse(head);
        ListNode curr = list;
        int carry = 0;
        while (curr != null) {
            int v = curr.val * 2;
            curr.val = (v % 10) + carry;
            carry = v > 9 ? 1 : 0;
            if (curr.next == null) break;
            curr = curr.next;
        }
        if (carry != 0) {
            curr.next = new ListNode(1);
        }
        return reverse(list);
    }
    
    public ListNode reverse(ListNode head) {
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