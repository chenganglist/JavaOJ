import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		int length = s.length();
		//初始化HashMap
		for(int i=0;i<26;i++)
		{
			count.put((char) ('a'+i), 0);
		}
		
		
		//HashMap计数
		for(int i=0;i<length;i++)
		{
			Set<Entry<Character, Integer>> t = count.entrySet();
		    Iterator<Entry<Character, Integer>>  it = t.iterator();
		    while(it.hasNext())
		    {
		    	  Entry<Character,Integer>  tmp = it.next();
		    	  if(tmp.getKey() == s.charAt(i))
		    	  {
		    		  tmp.setValue(tmp.getValue()+1);
		    	  }
		    }
		}
		
		//HashMap计算最小值
		int min = 20;
		Set<Entry<Character, Integer>> t = count.entrySet();
	    Iterator<Entry<Character, Integer>>  it = t.iterator();
	    while(it.hasNext())
	    {
	    	  Entry<Character,Integer>  tmp = it.next();
	    	  if(tmp.getValue() < min && tmp.getValue()>0 )
	    	  {
	    		   min = tmp.getValue();
	    	  }
	    }
	    
	    
		//删除出现次数最少的字符
		t = count.entrySet();
	    it = t.iterator();
	    while(it.hasNext())
	    {
	    	  Entry<Character,Integer>  tmp = it.next();
	    	  if(tmp.getValue() == min)
	    	  {
	    		   s = s.replace(tmp.getKey()+"", "");
	    	  }
	    }

	    System.out.println(s);
	
		sc.close();
	}

}
