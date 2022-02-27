package easy;

public class rangeSumOfBST_938 {
	private int sum;
	public int rangeSumBST(TreeNode root, int low, int high) {
		sum = 0;
		dfs(root, low, high);
		return sum;
	}
	
	public void dfs(TreeNode root, int low, int high) {
		if(root == null)
			return;
		if(low <= root.val && root.val <= high)
			sum += root.val;
		
		if(low < root.val)
			dfs(root.left, low, high);
		if(high > root.val)
			dfs(root.right, low, high);
	}
}
