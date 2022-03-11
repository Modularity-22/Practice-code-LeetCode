class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        int len = 0;
        while(cur.next != null){
            len ++;
            cur = cur.next;
        }
        if(len == 0) return head;
        int p = len - k % len;
        if(p == len) return head;
        ListNode end = cur;
        cur = dummy;
        while(p-- > 0){
            cur = cur.next;
        }
        ListNode result = cur.next;
        cur.next = null;
        end.next = dummy.next;
        return result;
    }
}
