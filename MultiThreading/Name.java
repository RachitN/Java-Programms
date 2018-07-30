class Name extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		Name t1 = new Name();
		Name t2 = new Name();
		t1.setName("Rachit");
		t2.setName("Rex");
		t1.start();
		t2.start();
		
	}
}
