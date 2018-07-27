import java.util.Scanner;

class Hare extends Thread 
{public static int j=0;
	public void run()
	{
		for (int i =0;i<=100;i++)
		{
			j=i;
			//System.out.println("Hare"+j);
			if (j==100)
				{System.out.println("Hare Wins by "+(100-Tortoise.k)+"m");
			    System.exit(0);}
			if (j==60)
				{try {
					Thread.sleep(275);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			else
			{
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			    
		}
	}
}
class Tortoise extends Thread 
{public static int k=0;
	public void run()
	{
		for (int i =0;i<=100;i++)
		{
			k=i;
			//System.out.println(k);
			if (k==100)
				{System.out.println("Tortoise Wins by "+(100-Hare.j)+"m");
			    System.exit(0);
			    }
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    
		}
	}
}
public class Race extends Thread  {
	public static void main(String[] args) {
		Hare hare = new  Hare();
		Tortoise tortoise = new  Tortoise();
		hare.setPriority(MAX_PRIORITY);
		//tortoise.setPriority(MIN_PRIORITY);;
		hare.start();
		tortoise.start();
	}
	
	
	

}
