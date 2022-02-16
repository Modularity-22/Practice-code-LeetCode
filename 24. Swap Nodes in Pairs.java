class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        dummy.next = head;
        ListNode temp = null;
        ListNode next = null;
        while(cur.next != null && cur.next.next != null){
            temp = cur.next;
            next = cur.next.next.next;
            cur.next = temp.next;
            temp.next = next;
            cur.next.next = temp;
            cur = cur.next.next;
        }
        return dummy.next;
    }
}