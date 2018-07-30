class SalesPerson extends Thread
{
	public void run()
	{
		String name[]={"Rachit","Rohith","Kaus","Thanna","Anmol"};
		for (int i =0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}
}
class Days extends Thread
{
	public void run()
	{
		String day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	   for (int i =0;i<day.length;i++)
		{
			Thread.currentThread().setName(day[i]);
		}
		
	}
	public static void main(String args[])
	{
		SalesPerson s = new SalesPerson();
		Days d = new Days();
		d.start();
		s.start();
		if (d.getName.equals("Sunday"))
		{   try
			{
			s.suspend();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		if (d.getName.equals(Wednesday))
		{
			try
			{
				s.resume();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
