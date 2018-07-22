import java.util.*;
class Max_In_3
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		int a = first>second ? first : second;
		int b = third>second ? third : second;
		System.out.print("The max among them is " );
		System.out.println(a>b ? a : b);
		
	}	
}