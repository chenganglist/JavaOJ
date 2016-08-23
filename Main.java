import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int groupNumber = in.nextInt();
        ArrayList<ArrayDeque<Integer>> result = new ArrayList<ArrayDeque<Integer>>();
        for(int j = 0; j < groupNumber; j++){
            int count = in.nextInt();
            Deque<Integer> list = new ArrayDeque<Integer>();
            for(int i = count; i >=1; i--){
                list.addFirst(i);
                int tmp = list.getLast();
                list.removeLast();
                list.addFirst(tmp);
            }
            result.add((ArrayDeque<Integer>) list);
        }
        
		Iterator<ArrayDeque<Integer>> it = result.iterator();
		while(it.hasNext())
		{
			ArrayDeque<Integer> a =  it.next();
			while( a.size()> 1)
			{
				int tmp = a.getFirst();
				a.removeFirst();
				System.out.print(tmp+" ");
			}
			System.out.println((int)a.getFirst());
		}
        in.close();
    }
}