import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String  s1 = sc.nextLine();
			String  s2 = new StringBuilder(s1).reverse().toString();
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();

			System.out.println( a1.length - getLCString(a1,a2) );	
			
		}
		sc.close();
	}
	
	public static int getLCString( char[] a,char[] b)
	{
		int[][] c = new int[a.length][b.length];
		//注意初始值的计算
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[0]){
				c[i][0] = 1;
			}else if(i>0){
				c[i][0] = c[i-1][0];
			}
		}
		
		for(int j=0;j<b.length;j++)
		{
			if(a[0]==b[j]){
				c[0][j] = 1;
			}else if(j>0){
				c[0][j] = c[0][j-1];
			}
		}
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<b.length;j++)
			{
				if(a[i]==b[j]){
					c[i][j] = c[i-1][j-1] + 1;
				}else{
					c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
				}
			}
		}

		return c[a.length-1][b.length-1];
	}

}
