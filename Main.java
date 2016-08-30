import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext())
       {
           String s = sc.next();
           char[] a = s.toCharArray();
           moveArray(a);
           System.out.println(new String(a));
       }
       sc.close();
    }
    
    public static void moveArray(char[] a)
    {
    	for(int i=a.length-1;i>=0;i--)
    	{
    		if(Character.isUpperCase(a[i]))
    		{
    			char tmp = a[i];
    			int j;
    			for(j=i;j<a.length-1 && Character.isLowerCase(a[j+1]);j++)
    			{
    				a[j] = a[j+1];
    			}
    			a[j] = tmp;
    		}
    	}
    }
   
}