package easy;


public class designHashMap_706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap map = new MyHashMap();
		map.put(5, 5);
		map.put(5, 10);
		System.out.println(map.get(5));
		map.remove(5);


	}
}

class MyHashMap {
	private Node[] buckets;
	private int size;
	private static final double LOAD_FACTOR = 0.75;

	public MyHashMap() {
		size = 0;
		buckets = new Node[16];
	}

	public void put(int key, int value) {
		int index = key % buckets.length;
		Node head = buckets[index];
		
		while(head != null && head.key != key) 
			head = head.next;
		
		if(head != null) {
			head.value = value;
		}else {
			Node n = new Node(key, value);
			n.next = buckets[index];
			buckets[index] = n;
			size++;
		}
		
		if(size >= buckets.length * LOAD_FACTOR)
			update();
	}

	public int get(int key) {
		int index = key % buckets.length;
		Node head = buckets[index];
		
		while(head != null && head.key != key)
			head = head.next;
		
		return head == null ? -1 : head.value;
	}

	public void remove(int key) {
		int index = key % buckets.length;
		Node head = buckets[index];
		
		Node dummy = new Node(-1, -1), cur = dummy;
		dummy.next = head;
		while(cur.next != null && cur.next.key != key) {
			cur = cur.next;
		}
		
		if(cur.next != null && cur.next.key == key) {
			cur.next = cur.next.next;
			size--;
		}
		buckets[index] = dummy.next;
	}

	private void update() {
		Node[] o = buckets;
		Node[] n = new Node[buckets.length * 2];
		buckets = n;
		
		for(Node head : o) {
			while(head != null) {
				put(head.key, head.value);
				head = head.next;
			}
		}
	}
}

class Node {
	Node next;
	int key, value;

	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}
