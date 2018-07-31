import java.util.*;
public class TestC
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		list.add("ravi");
		list.add("vijay");
		list.add("rajesh");
		l2.add("Hello");
		l2.addAll(list);
		Iterator itr = l2.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*for (String obj : l2)
		{
			System.out.println(obj);
		}*/
		list.add("Hello");
		l2.retainAll(list);
		for (String obj : l2)
		{
			System.out.println(obj);
		}
	}
}
