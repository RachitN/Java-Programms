import java.util.*;
public class TestCO
{
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("ravi");
		list.add("vijay");
		list.add("rajesh");

		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		while (itr.hasPrevious())
			System.out.println(itr.previous());
	
	}
}