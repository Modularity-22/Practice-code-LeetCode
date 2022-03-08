	public class Solution {
		public boolean hasCycle(ListNode head) {
			if(head == null) return false;
			ListNode slow = head, fast = head;
			if(fast.next == null) return false;
			do{
				slow = slow.next;
				fast = fast.next.next;
			}while(slow != fast && slow != null && fast != null && fast.next != null);
			if(slow == fast) return true;
			return false;
		}
	}