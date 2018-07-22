import java.util.*;
class Last_Index
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		char c = scan.next().charAt(0);
		System.out.println(str.lastIndexOf(c));
		
		
	}
}