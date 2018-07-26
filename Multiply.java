import java.util.ArrayList;
import java.util.Scanner;

public class Multiply {
	private static Scanner scan;

	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		scan = new Scanner(System.in);
		System.out.print("Enter the no of elements of arrays ");
		int n = scan.nextInt();
		System.out.println("Enter the elements of array 1");
		for (int i =0;i<n;i++)
		{
			arr.add(scan.nextInt());
		}
		System.out.println("Enter the elements of array 1");
		for (int i =0;i<n;i++)
		{
			arr1.add(scan.nextInt());
		}for (int i =0;i<n;i++)
		{   
			arr2.add(arr.get(i)*arr1.get(i));
		}
		
		System.out.println("New Array");
		System.out.println(arr2);

		
}
}
