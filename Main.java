public class Main {
	public int TreeDepth(TreeNode pRoot)
    {
        return pRoot!=null?Math.max(TreeDepth(pRoot.left)+1, TreeDepth(pRoot.right)+1):0;
    }
    public static void main(String[] args)
    {
    	//Main s = new Main();

    }
}