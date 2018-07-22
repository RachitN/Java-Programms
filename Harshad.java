import java.util.Scanner;
class Harshad
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		int sum=0;
		int no1=no;
		while(no>0)
		{
			sum+=(no%10);
			no=no/10;
		}
		if (no1%sum==0)
		System.out.println("NUMBER IS HARSHAD NO");
		else
		System.out.println("NUMBER IS NOT HARSHAD NO");
	}	
}