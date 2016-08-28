import java.util.*;
import java.util.Map.Entry;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int num = sc.nextInt();
			String[] s = new String[num];
			for(int i=0;i<num;i++)
			{
				s[i] = sc.next();
			}
			
			for(String ss:s)
			{
				System.out.println(findFirstOnceChar(ss));
			}
			
		}

		sc.close();
	}
	
	public static char findFirstOnceChar(String s)
	{
		char result = s.charAt(0);
		LinkedHashMap<Character,Integer> count = new LinkedHashMap<Character,Integer>();
		for(char i:s.toCharArray())
		{
			if(count.containsKey(i)==false)
			{
				count.put(i, 1);
			}else
			{
				count.put(i, count.get(i)+1);
			}
		}
		
		Set<Entry<Character,Integer>> a = count.entrySet();
		Iterator<Entry<Character, Integer>> it = a.iterator();
		while(it.hasNext())
		{
			Entry<Character, Integer> i = it.next();
			if(i.getValue()==1)
			{
				return i.getKey();
			}
		}
		return result;
	}
}