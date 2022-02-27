package easy;

public class diameterOfBinaryTree_543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }
    public int dfs(TreeNode root){
        if(root == null)
            return 0;
        
        int l = dfs(root.left);
        int r = dfs(root.right);
        res = res > l + r? res : l + r;
        return Math.max(l, r) + 1;
    }

}
