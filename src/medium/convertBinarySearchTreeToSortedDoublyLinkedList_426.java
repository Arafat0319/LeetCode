package medium;

import java.util.LinkedList;
import java.util.Queue;

public class convertBinarySearchTreeToSortedDoublyLinkedList_426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		Node a = treeToDoublyList(root);
		a = a.right;
		for(int i = 0; i < 10; i++) {
			System.out.print(a.val + " ");
			a = a.left;
		}
	}

	public static Node treeToDoublyList(Node root) {
		if(root == null)
			return root;
		Node head = new Node();
		Queue<Node> queue = new LinkedList<>();
		dfs(root, queue);
		head.right = queue.peek();
		Node tmp1 = queue.poll();
		while(!queue.isEmpty()) {
			Node tmp2 = queue.poll();
			tmp1.right = tmp2;
			tmp2.left = tmp1;
			tmp1 = tmp2;
		}
		head.right.left = tmp1;
		tmp1.right = head.right;
		return head.right;
	}
	
	public static void dfs(Node root, Queue<Node> queue) {
		if(root == null)
			return;
		
		dfs(root.left, queue);
		queue.add(root);
		dfs(root.right, queue);
	}
}






class Node{
	public int val;
	public Node left;
	public Node right;
	
	public Node() {};
	
	public Node(int _val) {
		this.val = _val;
	}
	
	public Node(int _val, Node _left, Node _right) {
		this.val = _val;
		this.left = _left;
		this.right = _right;
	}
}
