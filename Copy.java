import java.io.*;
import java.util.Scanner;
public class Copy {

	public static void main(String args[]) throws IOException 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The File Name to read");
		String fname= scan.nextLine();
		FileReader fread = new FileReader(fname);
		BufferedReader br = new BufferedReader(fread);
		System.out.println("Enter The File Name to write");
		String fname1= scan.nextLine();
		FileWriter fwrite = new FileWriter(fname1);
		BufferedWriter bw = new BufferedWriter(fwrite);
		while(br.ready())
		{
			String x = br.readLine();
			bw.write(x);
			bw.newLine();
			
		}
		bw.close();
		br.close();
}
}
