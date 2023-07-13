
import java.util.*;
import java.lang.*;
import java.io.*;

class minCoins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x;
		Scanner sc=new Scanner (System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    x=sc.nextInt();
		    if(x%5==0)
		    {
		        if(x%10==0)
		        {
		          System.out.println(x/10);
		        }
		        else
		        {
		          System.out.println((x/10)+1);
		        }
		    }
		    else
		    {
		        System.out.println(-1);
		    }
		}
	}
}
