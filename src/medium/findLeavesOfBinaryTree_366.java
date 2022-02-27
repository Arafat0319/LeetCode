package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findLeavesOfBinaryTree_366 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2);
		a.right = new TreeNode(3);
		a.left.left = new TreeNode(4);
		a.left.right = new TreeNode(5);
		System.out.println(findLeaves(a));
//		List<Integer> res = new ArrayList<Integer>();

	}

	public static List<List<Integer>> findLeaves(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		HashSet<TreeNode> visited = new HashSet<TreeNode>();
		while (!visited.contains(root)) {
			List<Integer> res = new ArrayList<Integer>();
			dfs(root, res, visited);
//			System.out.println(ans);
			ans.add(res);
		}

		return ans;
	}

	public static void dfs(TreeNode root, List<Integer> res, HashSet<TreeNode> visited) {
		if (!visited.contains(root) && ((root.left == null || visited.contains(root.left)) && (root.right == null || visited.contains(root.right)))) {
			res.add(root.val);
			visited.add(root);
			return;
		}
		if (root.left != null)
			dfs(root.left, res, visited);
//		root.left = null;
		if (root.right != null)
			dfs(root.right, res, visited);
//		root.right = null;
	}

	public static void nul(TreeNode a) {
		a = null;
	}
}
