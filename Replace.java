import java.util.*;
public class Replace {
	private static Scanner scan;

	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		scan = new Scanner(System.in);
		System.out.print("Enter the no of elements of array ");
		int n = scan.nextInt();
		System.out.println("Enter the elements");
		for (int i =0;i<n;i++)
		{
			arr.add(scan.nextInt());
		}
		System.out.print("Enter the element to Replace ");
		int x = scan.nextInt();
		int r = arr.indexOf(x);
		System.out.print("Enter the element to Insert ");
		x=scan.nextInt();
		arr.set(r, x);
		System.out.println("New Array");
		System.out.println(arr);

		
}

}
