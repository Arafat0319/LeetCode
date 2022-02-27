package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class allNodesDistanceKinBinaryTree_863 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		List<Integer> res = new LinkedList<>();
		if(root == null || target == null)
			return res;
		
		HashMap<TreeNode, TreeNode> map = new HashMap<>();
		HashSet<TreeNode> set = new HashSet<>();
		map.put(root, null);
		dfsFind(map, root);
		findRes(map, target, k, res, set);
		
		
		return res;
	}

	public static void dfsFind(HashMap<TreeNode, TreeNode> map, TreeNode root) {
		if(root == null)
			return;
		if(root.left != null)
			map.put(root.left, root);
		if(root.right != null)
			map.put(root.right, root);
		dfsFind(map, root.left);
		dfsFind(map, root.right);
	}
	
	public static void findRes(HashMap<TreeNode, TreeNode> map, TreeNode target, int k, List<Integer> res, HashSet<TreeNode> set) {
		if(target == null || set.contains(target))
			return;

		set.add(target);	
		if(k == 0)
			if(target != null)
				res.add(target.val);
		findRes(map, target.left, k - 1, res, set);
		findRes(map, target.right, k - 1, res, set);
		findRes(map, map.get(target), k - 1, res, set);
	}
}
