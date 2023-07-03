
import java.util.*;
import java.lang.*;
import java.io.*;

class noteBooks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n,x;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		 n=sc.nextInt();
		 x=n*1000;
		 System.out.println(x/100);
		}
	}
}
