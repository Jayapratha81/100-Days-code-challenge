import java.util.*;
import java.lang.*;
import java.io.*;

class qualify
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- != 0)
		{
		    int x = s.nextInt();
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int aMarks = a*1;
		    int bMarks = b*2;
		    int sum = aMarks + bMarks;
		    System.out.println(sum >= x ? "qualify" : "notqualify");
		  
		}
	}
}
