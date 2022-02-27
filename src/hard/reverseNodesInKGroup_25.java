package hard;



public class reverseNodesInKGroup_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(5);
		
		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		
		ListNode r = reverseKGroup(head, 5);
		System.out.println(r.val + " " + r.next.val);
//		print(r);
	}
	
	public static void print(ListNode r) {
		ListNode tmp = r;
		while(tmp!= null) {
			System.out.print(r.val + " ");
			tmp = tmp.next;
		}
	}
	
	public static ListNode reverseKGroup(ListNode head, int k) {
		if(head == null)
			return null;
		
		int length = 0;
        ListNode tmp = head;
        while(tmp.next != null){
            length++;
            tmp = tmp.next; 
        }
        if(k > length)
            return head;
		
		ListNode dummy = new ListNode(-1);
		ListNode prev = null;
		
		ListNode tail = null;
		ListNode end = null;
		ListNode prev2 = null;
		ListNode cur = head;
		ListNode next = head.next;
		
		
		for(int i = 0; i < length / k; i++) {
			tail = cur;
			for(int j = 0; j < k; j++) {
				System.out.println(j);
				cur.next = prev2;
				prev2 = cur;
				cur = next;
				next = next.next;
			}

			if(i == 0)
				dummy.next = prev2;
			
			System.out.println("Dummy: " + dummy.next.val);
			end = cur;
			if(prev!=null)
				prev.next = end;
			tail.next = next;
			prev = end;
			
			
			prev2 = tail;
			cur = next;
			next = next.next;
			
		}
		
		
		return dummy.next;
	}

}



//class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
