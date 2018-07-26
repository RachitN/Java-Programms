import java.util.ArrayList;
import java.util.Scanner;
public class Specific {

	
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
			System.out.print("Enter the element to Insert ");
			int x=scan.nextInt();
			arr.add(2,x);
			System.out.println("New Array");
			System.out.println(arr);

			
	}

	}



