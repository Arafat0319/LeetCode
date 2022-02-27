package easy;


public class BinaryTree_pathSum_112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean hasPathSum(TreeNode root, int targetSum) {
		return helper(root, targetSum);
	}

	public static boolean helper(TreeNode node, int t) {
		if(node.left == null && node.right == null)
			return t - node.val == 0;
		
		return (node.left != null && helper(node.left, t - node.val) || node.right != null && helper(node.right,  t - node.val));
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
