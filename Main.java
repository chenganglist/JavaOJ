import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int groupNumber = in.nextInt();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int j = 0; j < groupNumber; j++){
            int count = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < count; i++){
                list.add(i + 1);
            }

            for(int i = 1; i < count; i++){
                int temp = list.get(count - 1);
                list.add(count - i - 1, temp);
                list.remove(list.size() - 1);
            }
            result.add((ArrayList<Integer>) list);
        }
        
		Iterator<ArrayList<Integer>> it = result.iterator();
		while(it.hasNext())
		{
			ArrayList<Integer> a =  it.next();
			int len = a.size();
			for(int i=0;i<len-1;i++)
			{
				System.out.print(a.get(i)+" ");
			}
			System.out.println(a.get(len-1));
		}
        in.close();
    }
}