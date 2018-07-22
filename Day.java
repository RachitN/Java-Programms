import java.time.LocalDate;
import java.util.Scanner;
public class Day {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String day = scan.next();
		day=day.toUpperCase();
		System.out.println(day);
		LocalDate today = LocalDate.now();
		if (day.equals("TODAY"))
		{
			
			System.out.println(today);
		}
		else if(day.equals("YESTERDAY"))
		{
			LocalDate yesterday = today.minusDays(1);
			System.out.println(yesterday);
		}
		else if(day.equals("TOMORROW"))
		{
			LocalDate tomorrow = today.plusDays(1);
			System.out.println(tomorrow);
		}
		else
		{
			System.out.println("Enter The Correct Value");
		}
	}
}
