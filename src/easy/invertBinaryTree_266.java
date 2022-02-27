package easy;

public class invertBinaryTree_266 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode invertTree(TreeNode root) {
		if(root == null)
			return null;
		dfs(root);
		return root;
	}
	public void dfs(TreeNode root) {
		if(root == null)
			return;
		TreeNode tmp = root.right;
		root.right = root.left;
		root.left = tmp;
		dfs(root.left);
		dfs(root.right);
	}
}
