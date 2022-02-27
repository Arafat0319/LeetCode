package hard;

import java.util.ArrayList;

public class mergeKSortedLists_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = null;
//		a.next = new ListNode(2);
//		a.next.next = new ListNode(3);

		ListNode e = new ListNode(1);
//		e.next = new ListNode(6);
//		e.next.next = new ListNode(7);
		ListNode[] arr = new ListNode[2];
		arr[0] = a;
		arr[1] = e;

		System.out.println(mergeKLists(arr).val);
	}

	public static ListNode mergeKLists(ListNode[] lists) {
		ListNode res = new ListNode();
		ListNode dummy = res;
		if(lists.length == 0)
			return null;
		int s = Integer.MAX_VALUE;
		for(int i = 0; i < lists.length; i++) {
			if(lists[i] == null)
				continue;
			s = s > lists[i].val ? lists[i].val : s;
		}

		int nullptr = 0, nextSmall = Integer.MAX_VALUE;
		boolean stop = false;
		
		
		while(!stop) {
			
			for(int i = 0; i < lists.length; i++) {
//					System.out.println(i);
					if(lists[i] == null) {
						nullptr++;
						continue;
					}
					
					while(lists[i] != null && lists[i].val == s) {
						res.next = new ListNode(lists[i].val);
						res = res.next;
//						System.out.println(res.val);
						lists[i] = lists[i].next;
//						System.out.println(lists[i].val);
						
						if(lists[i] == null)
							nullptr++;
						
					}
					if(lists[i] != null && lists[i].val != s)
						nextSmall = lists[i].val < nextSmall ? lists[i].val : nextSmall;
				
			}
			if(nullptr == lists.length)
				stop = true;
			s = nextSmall;
			nextSmall = Integer.MAX_VALUE;
		}
		
		
		return dummy.next;
	}
}

