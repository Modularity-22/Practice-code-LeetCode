/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
	class Solution {
		public ListNode sortList(ListNode head) {
			if(head == null || head.next == null) return head;
			ListNode dummy = new ListNode(0);
			dummy.next = head;
			ListNode slow = dummy, fast = dummy;
			while(fast != null && fast.next != null){
				slow = slow.next;
				fast = fast.next.next;
			}
			ListNode second = slow.next;
			slow.next = null;
			ListNode l1 = sortList(head);
			ListNode l2 = sortList(second);
			return merge(l1, l2);
		}
		private ListNode merge(ListNode l1, ListNode l2){        
			ListNode dummy = new ListNode(0), cur = dummy;
			while(l1 != null || l2 != null){
				if(l1 != null && l2 != null){
					cur.next = l1.val <= l2.val ? l1: l2;
					if(l1.val <= l2.val) l1 = l1.next;
					else l2 = l2.next;
				}else if(l1 != null){
					cur.next = l1;
					break;
				}else{
					cur.next = l2;
					break;
				}
				cur = cur.next;
			}
			return dummy.next;
		}
	}