package medium;

import java.util.*;

public class binaryTreeVerticalOrderTraversal_314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int max = 0, min = 0;
	public static List<List<Integer>> verticalOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;
		
		Queue<pair> q = new LinkedList<>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		
		q.offer(new pair(root, 0));
		
		
		while(!q.isEmpty()) {
			pair p = q.poll();
			TreeNode n = p.root;
			min = min < p.index ? min : p.index;
			max = max > p.index ? max : p.index;
			if(!map.containsKey(p.index))
				map.put(p.index, new ArrayList<Integer>() {
					{
						add(n.val);
					}
				});
			else {
				List a = map.get(p.index);
				a.add(n.val);
			}
			if(n.left != null)
				q.offer(new pair(n.left, p.index - 1));
			if(n.right != null)
				q.offer(new pair(n.right, p.index + 1));
		}
		
		for(int i = min; i <= max; i++) {
			if(map.containsKey(i))
				result.add(new ArrayList<Integer>(map.get(i)));
		}
		return result;
	}

}

class pair{
	TreeNode root;
	int index;
	public pair(TreeNode root, int index) {
		this.root = root;
		this.index = index;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}