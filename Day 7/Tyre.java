
import java.util.*;
import java.lang.*;
import java.io.*;


class Tyre
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n,m;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    n=sc.nextInt();
		    m=sc.nextInt();
		    System.out.println(2*n+4*m);
		}
	}
}
