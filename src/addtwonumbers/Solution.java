package addtwonumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode root, next;
		root = next = new ListNode(0);
		
		int rem = 0;
		
		while (l1 != null || l2 != null) {
			int num1 = l1 != null ? l1.val : 0;
			int num2 = l2 != null ? l2.val : 0;
			
			int total = num1 + num2 + rem;
			rem = total / 10;
			total = total > 9 ? total%10 : total;
			next = next.next = new ListNode(total);
			
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;		
		}
		
		if (rem != 0) {
			next.next = new ListNode(rem);
		}
		
		return root.next;
	}
	
	public static void main(String[] args) {
		
		ListNode root1 = new ListNode(1);
		root1.next = new ListNode(8);
		//root1.next.next = new ListNode(9);
		
		ListNode root2 = new ListNode(0);
		//root2.next = new ListNode(9);
		//root2.next.next = new ListNode(9);
		
		ListNode result = new Solution().addTwoNumbers(root1, root2);
		while (result != null) {
			System.out.print(result.val);
			if (result.next != null) System.out.print(" -> ");
			result = result.next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}
