package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binaryTreeRightSideView_199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
//	DFS   Time O(n)  Space O(n)
	public static List<Integer> rightSideViewDFS(TreeNode root){
		List<Integer> res = new ArrayList<>();
		if(root == null)
			return res;
		
		dfs(root, res, 0);
		return res;
		
	}
	public static void dfs(TreeNode root, List<Integer> res, int level) {
		if(root == null)
			return;
		
		if(level == res.size())
			res.add(root.val);
		
		dfs(root.right, res, level + 1);
		dfs(root.left, res, level + 1);
	}
	

	
	
	
	
	
	
//	BFS  Time O(n)  Space O(n)
	public static List<Integer> rightSideViewBFS(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if(i == size - 1)
					ans.add(node.val);
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
			}
		}

		return ans;
	}
}
