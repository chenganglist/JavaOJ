import java.util.ArrayList;
import java.util.LinkedList;
//使用LinkedList不断添加元素，并不断从头部移除元素父节点
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<TreeNode> treeList = new LinkedList<TreeNode>();
        if(root!=null)
        {
        	treeList.add(root);
        	
        	while(treeList.isEmpty()==false)
        	{
        		TreeNode curNode = treeList.remove();
        		if(curNode!=null)
        		{
        			list.add(curNode.val);
                    
        			if(curNode.left!=null)
        			{
        				treeList.add(curNode.left);
        			}
        			
        			if(curNode.right!=null)
        			{
        				treeList.add(curNode.right);
        			}
        		}
        	}
        }
     
        return list;
    }
}