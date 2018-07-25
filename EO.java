
public class EO extends Thread {
	String criteria;
	EO()
	{
		
	}
	EO(String c)
	{
		criteria = c;
	}
  public void run()
  {   System.out.println();
	  System.out.println(criteria+" numbers are");
	  System.out.println();
	  

	  for (int i = 0;i<20;i++)
	  {
		  if (i%2==0 && criteria=="Even")
		  {   
			  System.out.println(i);
		  }
		  else if(criteria=="Odd" && i%2!=0)
		  {
			  System.out.println(i);
		  }
	  }
  }

public static void main(String[] args) {
	EO obj = new EO("Even");
	EO obj1 = new EO("Odd");
	obj.start();
	try
	{
	obj.join();
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	obj1.start();
	
}
}
