class Search
{
	public static void main(String args[])
	{
		ArrayList arr = new ArrayList();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of elements of array ");
		int n = scan.nextInt();
		System.out.println("Enter the elements");
		for (int i =0;i<n;i++)
		{
			arr.add(scan.nextInt());
		}
		System.out.print("Enter the element to Search ");
		int x = scan.nextInt();
		if (arr.contains(x))
		System.out.println("Number found");
		else
		System.out.print("Number Not Found");
	}
}