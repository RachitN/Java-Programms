import java.lang.*;
import java.util.*;
public class RSF {
  int findRSF(int input)
  {
	  String sub;
	  int m;
	  do 
	  {
		  int arr[] = new int[100];
		 int i =0;
		  while(input>0)
		  {
			 int x = input%10;
			 arr[i]=x; 
			 i++;
			 input=input/10;
		  }
		  sub="0";
		  for (int j = i-1;j>0;j--)
		  {
			  sub=sub+String.valueOf(Math.abs(arr[j]-arr[j-1]));
		  }
		  sub=sub.substring(1);
		   m = Integer.parseInt(sub);
		  input=m;
	  }while(m>10);
	  return m;
  }
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int input=scan.nextInt();
	RSF obj = new RSF();
	System.out.println(obj.findRSF(input));
	scan.close();
}
}
