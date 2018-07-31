import java.util.*;
class SETH
{
	public static void main(String args[])
	{
		HashSet<String> al = new HashSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Ravi");
		Iterator <String> itr = al.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}
}