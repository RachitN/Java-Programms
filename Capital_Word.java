import java.util.*;
class Capital_Word
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String str1[] = str.split("\\s");
		int i=0;
		String word="";
		while (i<str1.length)
		{
			word=word+str1[i].substring(0,1).toUpperCase()+str1[i].substring(1)+" ";
			i++;
		}
		System.out.println(word);
	}
}