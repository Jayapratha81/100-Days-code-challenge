
import java.util.*;
import java.lang.*;
import java.io.*;


class sastaSharkTank
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 for(int i=-0;i<t;i++)
		 {
		     int a=sc.nextInt();
		     int b=sc.nextInt();
		     a=a*(100/10);
		     b=b*(100/20);
		     if(a>b)
		     {
		         System.out.println("First");
		     }
		     else if(a==b)
		     {
		         System.out.println("Any");
		     }
		     else
		     {
		         System.out.println("Second");
		     }
		 }
	}
}
