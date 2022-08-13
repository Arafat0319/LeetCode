package medium;
import java.util.*;

public class CloneGraph_133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node5 a = new Node5(1);
		Node5 b = new Node5(2);
		Node5 c = new Node5(3);
		Node5 d = new Node5(4);
		a.neighbors.add(b);
		a.neighbors.add(c);
		b.neighbors.add(a);
		b.neighbors.add(d);
		c.neighbors.add(d);
		c.neighbors.add(a);
		d.neighbors.add(b);
		d.neighbors.add(c);
		
		Node5 e = cloneGraph(a);
		System.out.println(e.neighbors);
	}
	
	public static Node5 cloneGraph(Node5 node) {
		if(node == null)
			return null;
		Map<Node5, Node5> map = new HashMap<>();
		dfs(node, map);
		return map.get(node);
	}

	public static void dfs(Node5 node, Map<Node5, Node5> map) {
		if(!map.containsKey(node)) {
			Node5 copy = new Node5(node.val);
			map.put(node, copy);
			System.out.println("Initializing First Node " + node.val);
		}
		for(Node5 n : node.neighbors) {
			if(map.containsKey(n)) {
				map.get(node).neighbors.add(map.get(n));
				System.out.println(node.val + " ----> " + n.val);
			}
			else {
				Node5 copy = new Node5(n.val);
				map.put(n, copy);
				map.get(node).neighbors.add(copy);
				System.out.println(node.val + " ----> " + n.val);
				dfs(n, map);
				
			}
		}
			
	}
}


class Node5 {
    public int val;
    public List<Node5> neighbors;
    public Node5() {
        val = 0;
        neighbors = new ArrayList<Node5>();
    }
    public Node5(int _val) {
        val = _val;
        neighbors = new ArrayList<Node5>();
    }
    public Node5(int _val, ArrayList<Node5> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
    
  
		
	
}