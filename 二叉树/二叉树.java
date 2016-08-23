package 二叉树;
import java.util.*;

public class 二叉树 {
	public class TreeNode {
		public int val = 0;
		public TreeNode left = null;
		public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if(root1!=null && root2!=null)
		{
			if(root1.val == root2.val)
			{
				result = DoesRoot1HasRoot2(root1.left,root2.left)
						&& DoesRoot1HasRoot2(root1.right,root2.right);
			}           
			//如果上一次没有判断成功，继续判断
			if(result==false)
			{
				result = HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
			}
		}
		return result;
	}
	
	public static boolean DoesRoot1HasRoot2(TreeNode root1,TreeNode root2)
	{
		if(root2==null)
		{
			return true;
		}
		
		if(root1==null)
		{
			return false;
		}
		
		if(root1.val != root2.val)
		{
			return false;
		}
		
		return DoesRoot1HasRoot2(root1.left,root2.left) && 
				DoesRoot1HasRoot2(root1.right,root2.right);
	}
	
	 
    public static void main(String[] args){
    	    Scanner sc = new Scanner(System.in);
    	    
    	    sc.close();
    	}
    
}