import java.util.ArrayList;
import java.util.LinkedList;
//ʹ��LinkedList�������Ԫ�أ������ϴ�ͷ���Ƴ�Ԫ�ظ��ڵ�
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