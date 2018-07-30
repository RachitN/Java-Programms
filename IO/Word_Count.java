import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Word_Count {
	public static void main(String args[]) throws IOException 
	{
		
		HashMap <String,Integer> hm = new HashMap <String,Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The File Name to read");
		String fname= scan.nextLine();
		File file = new File(fname);
		System.out.println("Enter The File Name to write");
		String fname1= scan.nextLine();
		FileWriter fwrite = new FileWriter(fname1);
		BufferedWriter bw = new BufferedWriter(fwrite);
		scan.close();
		Scanner input = new Scanner(file);
		while(input.hasNext())
		{
			String word = input.next();
			 if (!hm.containsKey(word)) {  // first time we've seen this string
			      hm.put(word, 1);
			    }
			    else {
			      int count =hm.get(word);
			      hm.put(word, count + 1);
			    }
			
		}
		Set< Map.Entry< String,Integer> > st = hm.entrySet();
		for(Map.Entry<String,Integer>  k:st)
		{
			String s = k.getKey()+":";
			bw.write(s);
			bw.write(String.valueOf(k.getValue()));
			bw.newLine();
			
		}
		bw.close();
		input.close();
	}	

}
