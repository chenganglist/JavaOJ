import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
        	int n = sc.nextInt();
        	if(n<3)
        	{
        		System.out.println(1+"/"+1);
        		continue;
        	}
        	int num = n - 2;
        	int count = 0;
        	for(int i=2;i< n;i++)
        	{
        		count += countNum(n,i);
        	}
        	int min = Math.max(num, count);
        	for(int i=2;i<=min ;)
        	{
        		if(count%i==0 && num%i==0)
        		{
        			count = count/i;
        			num = num/i;
        			min = Math.max(num, count);
        			i = 2;
        		}else
        		{
        			i++;
        		}
        	}

        	System.out.println(count+"/"+num);
        		
        }
        sc.close();
    }
    
    public static int countNum(int a,int index)
    {
    	int count = 0;
    	while(a>=index)
    	{
    		int tmp = a%index;
    		count = count + tmp;
    		a = a/index;
    		//System.out.print(tmp+" ");
    	}
    	//System.out.println(a);
    	count = count+a;
    	return count;
    }
}