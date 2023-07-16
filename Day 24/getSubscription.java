import java.util.*;
import java.lang.*;
import java.io.*;

class getSubscription
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    x=sc.nextInt();
		    if(x>30)
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
