import java.util.ArrayList;

public class Main {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<TreeNode> record = new ArrayList<TreeNode>();
        if(root!=null)
        {
        	record.add(root);
        }else
        {
        	return list;
        }
        while(record.size()>0)
        {
        	int len = record.size();
        	for(int i=0;i<record.size() && i<len;i++)
        	{
                	list.add(record.get(0).val);
                	if(record.get(0).left!=null)
                	    record.add(record.get(0).left);
                	if(record.get(0).right!=null)
                	    record.add(record.get(0).right);  
                	record.remove(0);
        	}
        }
        
        return list;
    }

    public static void main(String[] args)
    {
    	//Main s = new Main();

    }
}