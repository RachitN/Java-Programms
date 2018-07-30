import java.util.*;
class Colors implements Runnable
{
	String colors[] ={"White","Red","Yellow","Pink","Black"};
	public void run()
	{
		String str="";
		int r;
		Random rand = new Random();
		while (str!="Red")
		{   System.out.println(str);
			r=rand.nextInt(5);
			str=colors[r];
			
		}
	}
	public static void main(String args[])
	{
		Thread c = new Thread(new Colors());
		c.start();
	}
}
