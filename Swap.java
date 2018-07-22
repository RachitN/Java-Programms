import java.util.Scanner;
class Swap
{   static int a,b;
	static void swap()
	{
		int t = a;
		a=b;
		b=t;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		Swap.swap();
		System.out.println(a);
		System.out.println(b);
	}
}