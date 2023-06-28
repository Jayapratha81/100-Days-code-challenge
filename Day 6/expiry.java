
import java.util.*;
import java.lang.*;
import java.io.*;

class expiry
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n,m,k;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    n=sc.nextInt();
		    m=sc.nextInt();
		    k=sc.nextInt();
		    if(m*k>=n)
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		    
		}
	}
}
