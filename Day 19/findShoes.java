import java.util.*;
import java.lang.*;
import java.io.*;

class findShoes
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
		    if(m<n)
		    {
		        System.out.println(n+(n-m));
		    }
		    else
		    {
		        System.out.println(n);
		    }
		}
	}
}
