import java.util.*;

public class Main {
    public static void main(String[] args){
    	    Scanner sc = new Scanner(System.in);
    	    List<Integer> list = new ArrayList<Integer>();
    	    int num = sc.nextInt();
    	    for(int i=0;i<num;i++)
    	    {
    	    	list.add(sc.nextInt());
    	    }
    	    Collections.sort(list);
    	    System.out.println(list);
    	    sc.close();
    	}
}