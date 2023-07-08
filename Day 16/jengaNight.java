import java.util.*;
import java.lang.*;
import java.io.*;

class jengaNight
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n,x;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    n=sc.nextInt();
		    x=sc.nextInt();
		    if(x%n==0)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
