import java.util.*;
import java.io.*;
class Count
{
	public static void main(String args[]) throws IOException 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The File Name");
		String fname= scan.nextLine();
		FileReader fread = new FileReader(fname);
		BufferedReader br = new BufferedReader(fread);
		char c[]= new char[50];
		int k=0;
		while (br.ready())
		{
			br.read(c);
			int i =0;
			while (i<c.length)
			{   char b = Character.toUpperCase(c[i]);
				if (b == 'R')
				{
					k++;
				}
				i++;
			}
		}
		System.out.println(fname+" has "+k+" instances of letter 'r'.");
		
	}
}