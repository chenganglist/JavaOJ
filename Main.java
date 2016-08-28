import java.util.*;
import java.util.Map.Entry;


public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);


	    TreeMap<Character,Integer> count = new TreeMap<Character,Integer>();
	    count.put('d', 16);
	    count.put('b',10);
	    count.put('a',9);
	    
	    Set<Entry<Character, Integer>>  a = count.entrySet();
	    Iterator<Entry<Character, Integer>> it = a.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
		sc.close();
	}
	
}